package structure.composite.demo2;

public class Client {
    public static void main(String[] args) {
        Component component1 = new ButtonComponent(), component2 = new TextComponent(),
                component3 = new WindowComponent();
        component3.addComponent(component1);
        component3.addComponent(component2);
        component3.operation();
    }
}