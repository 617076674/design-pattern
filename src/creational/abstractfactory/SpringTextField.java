package creational.abstractfactory;

/**
 * @author qianyihui
 * @date 2019-06-22
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框.");
    }
}
