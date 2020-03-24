package behavior.visitor.demo2;

public class Student implements Role {
    int countOfArticles;

    int grade;

    @Override
    public void accept(Checker checker) {
        checker.visit(this);
    }
}