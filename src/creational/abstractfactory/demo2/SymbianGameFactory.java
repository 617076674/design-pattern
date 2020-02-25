package creational.abstractfactory.demo2;

public class SymbianGameFactory implements GameFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }
}