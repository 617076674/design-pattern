package creational.abstractfactory;

/**
 * @author qianyihui
 * @date 2019-06-22
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框.");
    }
}
