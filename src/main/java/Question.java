
import java.util.List;

public class Question {

    private int id;
    private String text;
    private String correctAnswer;
    private String category; // CS / IS / IT
    private List<String> options;

    public Question(int id, String text, String correctAnswer, String category, List<String> options) {
        this.id = id;
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.category = category.toUpperCase();
        this.options = options;

    }
  
    // Getters
    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getOptions() {
        return options;
    }

    // Setters
    public void setQuestionText(String text) {
        this.text = text;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " | Question: " + text
                + " | Answer: " + correctAnswer
                + " | Category: " + category
                + (options != null ? " | Options: " + options : "");
    }
}
