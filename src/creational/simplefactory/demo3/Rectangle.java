package creational.simplefactory.demo3;

public class Rectangle extends Shape {
    public Rectangle() {
        System.out.println("Rectangle is created");
    }

    @Override
    public void draw() {
        System.out.println("绘制一个长方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个长方形");
    }
}