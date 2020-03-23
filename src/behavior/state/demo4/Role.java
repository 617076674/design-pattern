package behavior.state.demo4;

public class Role {
    RoleState roleState;

    int score;

    public Role() {
        this.roleState = new PrimaryState(this);
        roleState.display();
    }

    public void increase(int num) {
        roleState.display();
        roleState.increase(num);
        stateCheck();
        roleState.display();
    }

    public void decrease(int num) {
        roleState.display();
        roleState.decrease(num);
        stateCheck();
        roleState.display();
    }

    public void stateCheck() {
        if (score >= 40) {
            roleState = new FinalState(this);
        } else if (score >= 30) {
            roleState = new ProfessionalState(this);
        } else if (score >= 20) {
            roleState = new SecondaryState(this);
        } else {
            roleState = new PrimaryState(this);
        }
    }
}