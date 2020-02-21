package behavior.state;

/**
 * @author qianyihui
 * @date 2019-06-13
 */
public abstract class AccountState {

    protected Account acc;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();

}
