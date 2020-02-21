package creational.simplefactory.demo3;

public class Circle extends Shape {
    public Circle() {
        System.out.println("Circle is created");
    }

    @Override
    public void draw() {
        System.out.println("绘制一个圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个圆形");
    }
}