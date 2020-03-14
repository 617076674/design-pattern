package behavior.interpreter.demo1;

public class SubExpression extends AbstractExpression {
    private AbstractExpression left, right;

    public SubExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}