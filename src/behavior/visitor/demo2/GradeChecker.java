package behavior.visitor.demo2;

public class GradeChecker extends Checker {
    @Override
    public void visit(Student student) {
        if (student.grade >= 90) {
            System.out.println("这位学生成绩优秀，已经可以评奖了");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if (teacher.feedbackScore >= 90) {
            System.out.println("这位教师反馈分优秀，已经可以评奖了");
        }
    }
}