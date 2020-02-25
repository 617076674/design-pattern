package creational.abstractfactory.demo2;

public class SymbianOperationController implements OperationController {
    @Override
    public void operate() {
        System.out.println("Symbian系统的游戏操作控制OperationController");
    }
}