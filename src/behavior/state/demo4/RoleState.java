package behavior.state.demo4;

public abstract class RoleState {
    protected Role role;

    public abstract void increase(int num);

    public abstract void decrease(int num);

    public abstract void doubleScore();

    public abstract void changeCards();

    public abstract void peekCards();

    public abstract void display();
}