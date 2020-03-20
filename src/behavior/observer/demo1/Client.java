package behavior.observer.demo1;

public class Client {
    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");
        Observer play1 = new Player("杨过");
        acc.join(play1);
        Observer play2 = new Player("令狐冲");
        acc.join(play2);
        Observer play3 = new Player("张无忌");
        acc.join(play3);
        Observer play4 = new Player("段誉");
        acc.join(play4);
        play1.beAttacked(acc);
    }
}