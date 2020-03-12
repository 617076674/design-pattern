package behavior.command.demo1;

public class HelpCommand extends Command {
    private DisplayHelpClass hcObj;     //维持对请求接受者的引用

    public HelpCommand() {
        this.hcObj = new DisplayHelpClass();
    }

    //命令执行方法，将调用请求接受者的业务方法
    @Override
    public void execute() {
        hcObj.display();
    }
}