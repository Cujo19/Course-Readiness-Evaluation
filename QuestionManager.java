import java.util.ArrayList;

public class QuestionManager {
    private ArrayList<Question> questionList = new ArrayList<>();

    // INSERT
    public void addQuestion(Question q) {
        questionList.add(q);
        System.out.println("Question added successfully.");
    }

    // DISPLAY
    public void displayQuestions() {
        if (questionList.isEmpty()) {
            System.out.println("No questions available.");
            return;
        }
        for (Question q : questionList) {
            System.out.println(q);
        }
    }

    // SEARCH
    public Question searchQuestionById(int id) {
        for (Question q : questionList) {
            if (q.getId() == id) {
                return q;
            }
        }
        return null;
    }

    // UPDATE
    public void updateQuestion(int id, String newText, String newAnswer, String newCategory) {
        Question q = searchQuestionById(id);
        if (q != null) {
            q.setQuestionText(newText);
            q.setCorrectAnswer(newAnswer);
            q.setCategory(newCategory);
            System.out.println("Question updated successfully.");
        } else {
            System.out.println("Question not found.");
        }
    }

    // DELETE
    public void deleteQuestion(int id) {
        Question q = searchQuestionById(id);
        if (q != null) {
            questionList.remove(q);
            System.out.println("Question deleted successfully.");
        } else {
            System.out.println("Question not found.");
        }
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }
}
