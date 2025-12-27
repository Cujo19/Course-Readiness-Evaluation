public class Question {

    private int id;
    private String text;
    private String correctAnswer;
    private String category; // CS / IS / IT

    public Question(int id, String text, String correctAnswer, String category) {
        this.id = id;
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id +
               " | Question: " + text +
               " | Answer: " + correctAnswer +
               " | Category: " + category;
    }
}
