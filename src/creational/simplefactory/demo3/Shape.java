package creational.simplefactory.demo3;

public abstract class Shape {
    public abstract void draw();

    public abstract void erase();

    public static Shape create(String s) {
        Shape shape = null;
        System.out.println(s);
        if (s.equals("Circle")) {
            shape = new Circle();
        } else if (s.equals("Rectangle")) {
            shape = new Rectangle();
        } else if (s.equals("Triangle")) {
            shape = new Triangle();
        } else {
            throw new UnsupportedOperationException();
        }
        return shape;
    }
}
