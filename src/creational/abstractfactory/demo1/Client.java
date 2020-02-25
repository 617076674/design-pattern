package creational.abstractfactory.demo1;

public class Client {
    public static void main(String[] args) {
        SkinFactory factory = (SkinFactory) XMLUtil.getBean();
        factory.createButton().display();
        factory.createTextField().display();
        factory.createComboBox().display();
    }
}