package behavior.command;

public class FunctionButton {

    private Command command;

    //为功能键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //发送请求的方法
    public void click() {
        System.out.print("单击功能键：");
        command.execute();
    }

}
