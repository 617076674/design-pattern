package behavior.strategy.demo2;

public class Helicopter implements FeiJi {
    @Override
    public void startFly() {
        System.out.println("垂直起飞");
    }

    @Override
    public void flying() {
        System.out.println("亚音速飞行");
    }
}