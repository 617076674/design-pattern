package behavior.strategy.demo2;

public class AirPlane implements FeiJi {
    @Override
    public void startFly() {
        System.out.println("长距离起飞");
    }

    @Override
    public void flying() {
        System.out.println("亚音速飞行");
    }
}