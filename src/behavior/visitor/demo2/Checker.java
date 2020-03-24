package behavior.visitor.demo2;

public abstract class Checker {
    public abstract void visit(Student student);

    public abstract void visit(Teacher teacher);
}