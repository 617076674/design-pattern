package structure.adapter.demo2;

public class Client {
    public static void main(String[] args) {
        CarController car = (CarController) XMLUtil.getBean();
        car.move();
        car.phonate();
        car.twinkle();
    }
}