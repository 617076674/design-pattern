package behavior.memento.demo3;

public class Client {
    public static void main(String[] args) {
        Originator ori = new Originator("状态1");
        System.out.println(ori.getState());

        Caretaker ct = new Caretaker();
        ct.setMemento(ori.createMemento());

        ori.setState("状态（2）");
        System.out.println(ori.getState());

        ori.restoreMemento(ct.getMemento());
        System.out.println(ori.getState());
    }
}