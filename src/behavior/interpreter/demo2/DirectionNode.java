package behavior.interpreter.demo2;

public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    //方向表达式的解释操作
    @Override
    public String interpret() {
        if ("up".equalsIgnoreCase(direction)) {
            return "向上";
        } else if ("down".equalsIgnoreCase(direction)) {
            return "向下";
        } else if ("left".equalsIgnoreCase(direction)) {
            return "向左";
        } else if ("right".equalsIgnoreCase(direction)) {
            return "向右";
        }
        return "无效指令";
    }
}