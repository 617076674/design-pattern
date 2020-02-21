package behavior.command;

public class Client {
    public static void main(String[] args) {
        FunctionButton fb = new FunctionButton();
        Command command;        //定义命令对象
        command = (Command) XMLUtil.getBean();
        fb.setCommand(command);
        fb.click();
    }
}
