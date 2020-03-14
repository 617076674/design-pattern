package behavior.interpreter.demo1;

public class AddExpression extends AbstractExpression {
    private AbstractExpression left, right;

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}