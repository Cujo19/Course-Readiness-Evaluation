public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuestionManager qm = new QuestionManager();
        QuestionMenu qMenu = new QuestionMenu(qm);
        QuizRunner quiz = new QuizRunner();
        RecommendationEngine rec = new RecommendationEngine();

        seedQuestions(qm);

        int choice;
        do {
            System.out.println("\n=== Course Readiness Evaluation System ===");
            System.out.println("1. Manage Questions");
            System.out.println("2. Take Quiz");
            System.out.println("3. View Recommendation");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qMenu.showMenu(sc);
                    break;
                case 2:
                    quiz.runQuiz(sc, qm.getQuestionList());
                    break;
                case 3:
                    rec.analyzeAndRecommend(
                        qm.getQuestionList(),
                        quiz.getUserAnswers()
                    );
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
}


