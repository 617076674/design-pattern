package behavior.interpreter.test;

public class DivideNode extends AbstractNode {

    AbstractNode left;

    AbstractNode right;

    public DivideNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret() {
        return left.interpret() / right.interpret();
    }

}
