package behavior.memento.demo3;

public class Memento {
    private String state;

    public Memento(Originator o) {
        state = o.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
