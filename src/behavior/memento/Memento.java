package behavior.memento;

/**
 * @author qianyihui
 * @date 2019-06-11
 */
class Memento {

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
