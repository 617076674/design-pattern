package behavior.memento;

/**
 * @author qianyihui
 * @date 2019-06-11
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
