import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionMenu {

    private QuestionManager manager;

    public QuestionMenu(QuestionManager manager) {
        this.manager = manager;
    }

    public void showMenu(Scanner sc) {
        int option;
        do {
            System.out.println("\n--- Question Management ---");
            System.out.println("1. Add Question");
            System.out.println("2. Update Question");
            System.out.println("3. Delete Question");
            System.out.println("4. Search Question");
            System.out.println("5. Display All Questions");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: addQuestion(sc); break;
                case 2: updateQuestion(sc); break;
                case 3: deleteQuestion(sc); break;
                case 4: searchQuestion(sc); break;
                case 5: manager.displayQuestions(); break;
            }

        } while (option != 0);
    }

    private void addQuestion(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter question text: ");
        String text = sc.nextLine();
        System.out.print("Enter correct answer (A/B/C/D): ");
        String ans = sc.nextLine();
        System.out.print("Enter category (CS/IS/IT): ");
        String cat = sc.nextLine();

        // Answer options
        List<String> options = new ArrayList<>();
        System.out.println("Enter 4 options (A-D):");
        options.add("A. " + sc.nextLine());
        options.add("B. " + sc.nextLine());
        options.add("C. " + sc.nextLine());
        options.add("D. " + sc.nextLine());

        manager.addQuestion(new Question(id, text, ans, cat, options));
        System.out.println("Question added.");
    }

    private void updateQuestion(Scanner sc) {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("New question text: ");
        String text = sc.nextLine();
        System.out.print("New correct answer (A/B/C/D): ");
        String ans = sc.nextLine();
        System.out.print("New category (CS/IS/IT): ");
        String cat = sc.nextLine();

        // Collect new options
        List<String> options = new ArrayList<>();
        System.out.println("Enter 4 new options (A-D):");
        options.add("A. " + sc.nextLine());
        options.add("B. " + sc.nextLine());
        options.add("C. " + sc.nextLine());
        options.add("D. " + sc.nextLine());

        manager.deleteQuestion(id); // simple update = delete + add
        manager.addQuestion(new Question(id, text, ans, cat, options));
        System.out.println("Question updated.");
    }

    private void deleteQuestion(Scanner sc) {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        manager.deleteQuestion(id);
    }

    private void searchQuestion(Scanner sc) {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        Question q = manager.searchQuestionById(id);
        System.out.println(q != null ? q : "Question not found.");
    }
}
