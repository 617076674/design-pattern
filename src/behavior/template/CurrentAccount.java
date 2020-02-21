package behavior.template;

/**
 * @author qianyihui
 * @date 2019-06-15
 */
public class CurrentAccount extends Account {

    //活期账户类：具体子类
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息");
    }

}
