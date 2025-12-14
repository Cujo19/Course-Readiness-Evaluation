import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuestionManager manager = new QuestionManager();
        QuestionMenu qMenu = new QuestionMenu(manager);

        // seed questions
        manager.addQuestion(new Question(1, "What is an algorithm?", "B", "CS"));
        manager.addQuestion(new Question(2, "SQL is used for?", "C", "IS"));
        manager.addQuestion(new Question(3, "CPU function?", "B", "IT"));

        int choice;
        do {
            System.out.println("\n=== Course Readiness Evaluation System ===");
            System.out.println("1. Manage Questions");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt(); sc.nextLine();

            switch(choice) {
                case 1: qMenu.showMenu(sc); break;
            }

        } while(choice != 0);

        System.out.println("System exited.");
        sc.close();
    }
}
