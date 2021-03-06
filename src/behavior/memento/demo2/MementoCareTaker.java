package behavior.memento.demo2;

import java.util.ArrayList;

public class MementoCareTaker {
    //定义一个集合来存储多个备忘录
    private ArrayList<ChessmanMemento> mementolist = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}