package behavior.state.demo4;

public class Client {
    public static void main(String[] args) {
        Role role = new Role();
        role.increase(30);
        role.decrease(25);
    }
}