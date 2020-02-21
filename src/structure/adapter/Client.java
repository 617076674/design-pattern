package structure.adapter;

/**
 * @author qianyihui
 * @date 2019-06-19
 */
public class Client {
    public static void main(String[] args) {
        CarController car;
        car = (CarController) XMLUtil.getBean();
        car.move();
        car.phonate();
        car.twinkle();
    }
}
