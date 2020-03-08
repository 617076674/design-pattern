package structure.decorator.demo1;

public class Client {
    public static void main(String[] args) {
        Component component = new Window(), componentSB = new ScrollBarDecorator(component),
                componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}