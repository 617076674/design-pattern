package behavior.interpreter.demo2;

public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    //动作（移动方式）表达式的解释操作
    @Override
    public String interpret() {
        if ("move".equalsIgnoreCase(action)) {
            return "移动";
        } else if ("run".equalsIgnoreCase(action)) {
            return "快速移动";
        }
        return "无效指令";
    }
}