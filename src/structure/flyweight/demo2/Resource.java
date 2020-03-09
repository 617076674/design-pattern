package structure.flyweight.demo2;

public abstract class Resource {
    public abstract String getType();

    public void display(Coordinates coord) {
        System.out.println("棋子颜色：" + this.getType() + "，棋子位置：" + coord.getX()
                + "，" + coord.getY());
    }
}