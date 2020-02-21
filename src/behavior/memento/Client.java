package behavior.memento;

/**
 * @author qianyihui
 * @date 2019-06-11
 */
public class Client {
    public static void main(String[] args) {
        //创建原发器对象
        Originator ori = new Originator("状态1");
        System.out.println(ori.getState());

        //创建负责人对象，保存创建的备忘录对象
        Caretaker ct = new Caretaker();
        ct.setMemento(ori.createMemento());

        ori.setState("状态（2）");
        System.out.println(ori.getState());

        //从负责人对象中取出备忘录对象，实现撤销
        ori.restoreMemento(ct.getMemento());
        System.out.println(ori.getState());
    }
}
