package creational.abstractfactory.demo2;

public class AndroidOperationController implements OperationController {
    @Override
    public void operate() {
        System.out.println("Android系统的游戏操作控制OperationController");
    }
}