package creational.abstractfactory.demo2;

public class WindowsMobileOperationController implements OperationController {
    @Override
    public void operate() {
        System.out.println("Windows Mobile系统的游戏操作控制OperationController");
    }
}