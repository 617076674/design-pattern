package structure.flyweight.demo2;

public class Client {
    public static void main(String[] args) {
        ResourceFactory factory = ResourceFactory.getInstance();
        Resource resource1 = factory.getResource("p"), resource2 = factory.getResource("v");
        resource1.display(new Coordinates(1, 2));
        resource2.display(new Coordinates(2, 3));
        System.out.println(resource1 == factory.getResource("p"));
        System.out.println(resource2 == factory.getResource("v"));
    }
}