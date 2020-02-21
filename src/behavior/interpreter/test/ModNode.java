package behavior.interpreter.test;

public class ModNode extends AbstractNode {

    AbstractNode left;

    AbstractNode right;

    public ModNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret() {
        return left.interpret() % right.interpret();
    }

}
