package creational.simplefactory.demo3;

public class Client {
    public static void main(String[] args) {
        Shape.create(XMLUtil.getShapeType());
    }
}
