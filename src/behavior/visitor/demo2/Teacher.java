package behavior.visitor.demo2;

public class Teacher implements Role {
    int countOfArticle;

    int feedbackScore;

    @Override
    public void accept(Checker checker) {
        checker.visit(this);
    }
}