package creational.abstractfactory.demo2;

public class WindowsMobileGameFactory implements GameFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsMobileInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new WindowsMobileOperationController();
    }
}