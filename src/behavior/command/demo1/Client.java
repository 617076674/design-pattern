package behavior.command.demo1;

public class Client {
    public static void main(String[] args) {
        FunctionButton fb = new FunctionButton();
        Command command = (Command) XMLUtil.getBean();
        fb.setCommand(command);
        fb.click();
    }
}