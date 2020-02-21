package behavior.memento.chess1;

/**
 * @author qianyihui
 * @date 2019-06-11
 */
public class Client {
    public static void main(String[] args) {
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chess = new Chessman("车", 1, 1);
        display(chess);
        mc.setMemento(chess.save());        //保存状态
        chess.setY(4);
        display(chess);
        mc.setMemento(chess.save());        //保存状态
        chess.setX(5);
        display(chess);
        System.out.println("********悔棋********");
        chess.restore(mc.getMemento());     //恢复状态
        display(chess);
    }

    public static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：第" + chess.getX() + "行第" + chess.getY() + "列。");
    }
}
