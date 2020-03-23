package behavior.strategy.demo2;

public class Client {
    public static void main(String[] args) {
        FeiJi feiJi = (FeiJi) XMLUtil.getBean();
        FlyWay flyWay = new FlyWay();
        flyWay.setFeiJi(feiJi);
        flyWay.startFly();
        flyWay.flying();
    }
}