package behavior.visitor.demo2;

public class ArticleChecker extends Checker {
    @Override
    public void visit(Student student) {
        if (student.countOfArticles >= 2) {
            System.out.println("这位学生论文数已达标，可以评奖了");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if (teacher.countOfArticle >= 10) {
            System.out.println("这位教师论文数已达标，可以评奖了");
        }
    }
}