package behavior.interpreter.test;

public class MultiNode extends AbstractNode {

    AbstractNode left;

    AbstractNode right;

    public MultiNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret() {
        return left.interpret() * right.interpret();
    }

}
