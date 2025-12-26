/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRE_1;

import java.util.HashMap;
import java.util.Map;

public class QuizSession {
    private String studentName;
    private Map<String, Integer> categoryScores; // CS, IS, IT scores
    private int totalQuestions;
    private int correctAnswers;

    public QuizSession(String studentName) {
        this.studentName = studentName;
        this.categoryScores = new HashMap<>();
        this.categoryScores.put("CS", 0);
        this.categoryScores.put("IS", 0);
        this.categoryScores.put("IT", 0);
        this.totalQuestions = 0;
        this.correctAnswers = 0;
    }

    public void recordAnswer(String category, boolean isCorrect) {
        totalQuestions++;
        if (isCorrect) {
            correctAnswers++;
            categoryScores.put(category, categoryScores.get(category) + 1);
        }
    }

    public String getRecommendation() {
        int csScore = categoryScores.get("CS");
        int isScore = categoryScores.get("IS");
        int itScore = categoryScores.get("IT");

        if (csScore >= isScore && csScore >= itScore) {
            return "Computer Science (CS)";
        } else if (isScore >= csScore && isScore >= itScore) {
            return "Information Systems (IS)";
        } else {
            return "Information Technology (IT)";
        }
    }

    public void displayResults() {
        System.out.println("\n_____________________________________________");
        System.out.println("       QUIZ RESULTS SUMMARY             ");
        System.out.println("______________________________________");
        System.out.println("Student: " + studentName);
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.printf("Score: %.2f%%\n", getPercentage());
        System.out.println("\n--- Category Breakdown ---");
        System.out.println("CS (Computer Science): " + categoryScores.get("CS") + " correct");
        System.out.println("IS (Information Systems): " + categoryScores.get("IS") + " correct");
        System.out.println("IT (Information Technology): " + categoryScores.get("IT") + " correct");
        System.out.println("\n--- Recommendation ---");
        System.out.println("Based on your performance, you are most ready for: " + getRecommendation());
        System.out.println("_____________________________________\n");
    }

    public double getPercentage() {
        if (totalQuestions == 0) return 0;
        return (correctAnswers * 100.0) / totalQuestions;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
}