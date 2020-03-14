package behavior.interpreter.demo1;

public class NumExpression extends AbstractExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}