package behavior.state.demo4;

public class SecondaryState extends RoleState {
    public SecondaryState(Role role) {
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

    public void doubleScore() {
        role.score <<= 1;
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
        System.out.println("熟练级");
    }
}