package behavior.interpreter.test;

public class NumNode extends AbstractNode {

    private int num;

    public NumNode(int num) {
        this.num = num;
    }

    @Override
    public Integer interpret() {
        return num;
    }
}
