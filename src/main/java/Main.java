


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuestionManager manager = new QuestionManager();
        QuestionMenu qMenu = new QuestionMenu(manager);
        QuizMenu quizMenu = new QuizMenu(manager);
        seedQuestions(manager);

        int choice;
        do {
            System.out.println("\n=== Course Readiness Evaluation System ===");
            System.out.println("1. Manage Questions");
            System.out.println("2. Attempt Quiz");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qMenu.showMenu(sc);
                    break;
                case 2:
                    quizMenu.startQuiz(sc);
                    break;
            }

        } while (choice != 0);

        System.out.println("System exited.");
        sc.close();
    }

    private static void seedQuestions(QuestionManager manager) {

        // CS Questions
        manager.addQuestion(new Question(1, "What is an algorithm?",
                "B", "CS", List.of( "A. A data structure", "B. A step-by-step procedure", "C. A programming language", "D. A compiler" )));

        manager.addQuestion(new Question(2, "Which data structure follows the FIFO principle?",
                "C", "CS", List.of( "A. Stack", "B. Tree", "C. Queue", "D. Graph" )));

        manager.addQuestion(new Question(3, "What is the time complexity of linear search in the worst case?",
                "C", "CS", List.of( "A. O(1)", "B. O(log n)", "C. O(n)", "D. O(n log n)" )));

        manager.addQuestion(new Question(4, "Which of the following is NOT an example of a programming paradigm?",
                "D", "CS", List.of( "A. Object-Oriented", "B. Functional", "C. Procedural", "D. Compilation" )));

        manager.addQuestion(new Question(5, "What does recursion require to prevent infinite calls?",
                "B", "CS", List.of( "A. A loop", "B. A base case", "C. A stack", "D. A variable" )));

        manager.addQuestion(new Question(6, "Which data structure is best suited for hierarchical data?",
                "C", "CS", List.of( "A. Array", "B. Queue", "C. Tree", "D. HashMap" )));

        // IT Questions
        manager.addQuestion(new Question(7, "What is the main function of an operating system?",
                "B", "IT", List.of( "A. Compile code", "B. Manage hardware and software resources", "C. Connect to the internet", "D. Provide antivirus protection" )));

        manager.addQuestion(new Question(8, "Which device is used to connect multiple computers in a local area network (LAN)?",
                "C", "IT", List.of( "A. Modem", "B. Repeater", "C. Switch", "D. Printer" )));

        manager.addQuestion(new Question(9, "What does IP stand for in networking?",
                "B", "IT", List.of( "A. Internet Provider", "B. Internet Protocol", "C. Internal Process", "D. Integrated Platform" )));

        manager.addQuestion(new Question(10, "Which of the following is an example of system software?",
                "C", "IT", List.of( "A. Microsoft Word", "B. Google Chrome", "C. Operating System", "D. Photoshop" )));

        manager.addQuestion(new Question(11, "What is the purpose of a firewall?",
                "C", "IT", List.of( "A. Speed up the internet", "B. Store passwords", "C. Block unauthorized access", "D. Encrypt files" )));

        manager.addQuestion(new Question(12, "Which storage device is considered secondary storage?",
                "D", "IT", List.of( "A. RAM", "B. Cache", "C. Registers", "D. Hard Disk" )));
    }
}
