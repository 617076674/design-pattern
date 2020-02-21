package behavior.interpreter;

public class SentenceNode extends AbstractNode {

    private AbstractNode direction;

    private AbstractNode action;

    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    //简单句子的解释操作
    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + direction.interpret();
    }

}
