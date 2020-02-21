package creational.abstractfactory;

/**
 * @author qianyihui
 * @date 2019-06-22
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮.");
    }
}
