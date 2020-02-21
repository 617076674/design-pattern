package creational.simplefactory.demo3;

public class Triangle extends Shape {
    public Triangle() {
        System.out.println("Triangle is created");
    }

    @Override
    public void draw() {
        System.out.println("绘制一个三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个三角形");
    }
}