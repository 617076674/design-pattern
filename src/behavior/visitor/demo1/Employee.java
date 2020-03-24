package behavior.visitor.demo1;

public interface Employee {
    void accept(Department handler);
}