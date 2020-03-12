package behavior.command.demo1;

public class ExitCommand extends Command {
    private SystemExitClass seObj;      //维持对请求接受者的引用

    public ExitCommand() {
        seObj = new SystemExitClass();
    }

    //命令执行方法，将调用请求接受者的业务方法
    @Override
    public void execute() {
        seObj.exit();
    }
}