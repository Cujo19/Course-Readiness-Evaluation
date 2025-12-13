public class Question {
    private int id;
    private String questionText;
    private String correctAnswer;
    private String category; // CS / IS / IT
    
    public Question(int id, String questionText, String correctAnswer, String category) {
        this.id = id;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.category = category;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "ID: " + id + 
        "\nQuestion: " + questionText + 
        "\nCorrect Answer: " + correctAnswer + 
        "\nCategory: " + category + "\n";
    }
}