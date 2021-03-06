package behavior.state.demo1;

public class Account {
    private AccountState state;     //维持一个对抽象状态对象的引用

    private String owner;           //开户名

    private double balance;     //账户余额

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = init;
        this.state = new NormalState(this);
        System.out.println(this.owner + "开户，初始金额为" + init);
        System.out.println("----------------------------------------");
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);      //调用对象的deposit()方法
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在账户状态为" + this.state.getClass().getName());
        System.out.println("----------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount);
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在账户状态为" + this.state.getClass().getName());
        System.out.println("----------------------------------------");
    }

    public void computeInterest() {
        state.computeInterest();    //调用状态对象的computeInterest()方法
    }
}