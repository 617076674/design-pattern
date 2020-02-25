package creational.abstractfactory.demo2;

public class AndroidGameFactory implements GameFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }
}