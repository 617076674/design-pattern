package behavior.state.demo4;

public class FinalState extends RoleState {
    public FinalState(Role role) {
        this.role = role;
    }

    @Override
    public void increase(int num) {
        role.score += num;
    }

    @Override
    public void decrease(int num) {
        role.score -= num;
    }

    @Override
    public void doubleScore() {
        role.score <<= 1;
    }

    @Override
    public void changeCards() {
        System.out.println("换牌");
    }

    @Override
    public void peekCards() {
        System.out.println("偷看");
    }

    @Override
    public void display() {
        System.out.println("骨灰级");
    }
}