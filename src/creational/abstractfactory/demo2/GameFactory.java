package creational.abstractfactory.demo2;

public interface GameFactory {
    InterfaceController createInterfaceController();

    OperationController createOperationController();
}