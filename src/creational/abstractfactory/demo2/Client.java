package creational.abstractfactory.demo2;

public class Client {
    public static void main(String[] args) {
        GameFactory factory = (GameFactory) XMLUtil.getBean();
        factory.createInterfaceController().interfaceControl();
        factory.createOperationController().operate();
    }
}