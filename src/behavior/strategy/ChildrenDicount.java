package behavior.strategy;

/**
 * @author qianyihui
 * @date 2019-06-14
 */
public class ChildrenDicount implements Discount {

    private final double DISCOUNT = 10;

    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        if (price >= 20) {
            return price - DISCOUNT;
        }
        return price;
    }

}
