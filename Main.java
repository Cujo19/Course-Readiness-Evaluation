import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionManager manager = new QuestionManager();

        int choice;
        do {
            System.out.println("\n=== Question Management System ===");
            System.out.println("1. Add Question");
            System.out.println("2. Update Question");
            System.out.println("3. Delete Question");
            System.out.println("4. Search Question");
            System.out.println("5. Display All Questions");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter question: ");
                    String text = sc.nextLine();

                    System.out.print("Enter correct answer: ");
                    String answer = sc.nextLine();

                    System.out.print("Enter category (CS/IS/IT): ");
                    String category = sc.nextLine();

                    manager.addQuestion(new Question(id, text, answer, category));
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New question: ");
                    text = sc.nextLine();

                    System.out.print("New correct answer: ");
                    answer = sc.nextLine();

                    System.out.print("New category: ");
                    category = sc.nextLine();

                    manager.updateQuestion(id, text, answer, category);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextInt();
                    manager.deleteQuestion(id);
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    id = sc.nextInt();
                    Question q = manager.searchQuestionById(id);
                    System.out.println(q != null ? q : "Question not found.");
                    break;

                case 5:
                    manager.displayQuestions();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
