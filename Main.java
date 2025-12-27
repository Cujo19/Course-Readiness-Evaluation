import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuestionManager manager = new QuestionManager();
        QuestionMenu qMenu = new QuestionMenu(manager);
        seedQuestions(manager);

        private static void seedQuestions(QuestionManager manager) {

    // CS Questions
    manager.addQuestion(new Question(1, "What is an algorithm?",
            "B", "CS"));

    manager.addQuestion(new Question(2, "Which data structure follows the FIFO principle?",
            "C", "CS"));

    manager.addQuestion(new Question(3, "What is the time complexity of linear search in the worst case?",
            "C", "CS"));

    manager.addQuestion(new Question(4, "Which of the following is NOT an example of a programming paradigm?",
            "D", "CS"));

    manager.addQuestion(new Question(5, "What does recursion require to prevent infinite calls?",
            "B", "CS"));

    manager.addQuestion(new Question(6, "Which data structure is best suited for hierarchical data?",
            "C", "CS"));

    // IT Questions
    manager.addQuestion(new Question(7, "What is the main function of an operating system?",
            "B", "IT"));

    manager.addQuestion(new Question(8, "Which device is used to connect multiple computers in a local area network (LAN)?",
            "C", "IT"));

    manager.addQuestion(new Question(9, "What does IP stand for in networking?",
            "B", "IT"));

    manager.addQuestion(new Question(10, "Which of the following is an example of system software?",
            "C", "IT"));

    manager.addQuestion(new Question(11, "What is the purpose of a firewall?",
            "C", "IT"));

    manager.addQuestion(new Question(12, "Which storage device is considered secondary storage?",
            "D", "IT"));
}

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

