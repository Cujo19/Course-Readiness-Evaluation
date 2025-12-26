
import java.util.Scanner;
import java.util.ArrayList;

public class QuizMenu {
    private QuestionManager manager;

    public QuizMenu(QuestionManager manager) {
        this.manager = manager;
    }

    public void startQuiz(Scanner sc) {
        ArrayList<Question> questions = manager.getQuestionList();

        if (questions.isEmpty()) {
            System.out.println("No questions available. Please add questions first.");
            return;
        }

        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();

        QuizSession session = new QuizSession(name);

        System.out.println("\n_________________________________");
        System.out.println("  COURSE READINESS EVALUATION QUIZ");
        System.out.println("_________________________________");
        System.out.println("Welcome, " + name + "!");
        System.out.println("You will answer " + questions.size() + " questions.");
        System.out.println("Answer with A, B, C, or D.\n");
        System.out.print("Press Enter to begin...");
        sc.nextLine();

        int questionNum = 1;

        for (Question q : questions) {
            System.out.println("\n______________________________________");
            System.out.println("Question " + questionNum + " of " + questions.size());
            System.out.println("Category: " + q.getCategory());
            System.out.println("────────────────────────────────────────");
            System.out.println(q.getQuestionText());

            // ✅ INPUT VALIDATION
            String answer;
            while (true) {
                System.out.print("\nYour answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase().trim();

                if (answer.equals("A") || answer.equals("B") ||
                    answer.equals("C") || answer.equals("D")) {
                    break;
                } else {
                    System.out.println("❌ Invalid input! Please enter A, B, C, or D.");
                }
            }

            boolean isCorrect = answer.equals(q.getCorrectAnswer());
            session.recordAnswer(q.getCategory(), isCorrect);

            if (isCorrect) {
                System.out.println("✓ Correct!");
            } else {
                System.out.println("✗ Incorrect. The correct answer is: " + q.getCorrectAnswer());
            }

            questionNum++;
        }

        session.displayResults();

        System.out.print("Press Enter to continue...");
        sc.nextLine();
    }
}

