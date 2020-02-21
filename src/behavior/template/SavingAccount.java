package behavior.template;

/**
 * @author qianyihui
 * @date 2019-06-15
 */
public class SavingAccount extends Account {

    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }

}
