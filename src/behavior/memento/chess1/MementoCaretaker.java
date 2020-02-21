package behavior.memento.chess1;

/**
 * @author qianyihui
 * @date 2019-06-11
 */
public class MementoCaretaker {

    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}
