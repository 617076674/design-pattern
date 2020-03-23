package behavior.state.demo4;

public class PrimaryState extends RoleState {
    public PrimaryState(Role role) {
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
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeCards() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void peekCards() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void display() {
        System.out.println("入门级");
    }
}