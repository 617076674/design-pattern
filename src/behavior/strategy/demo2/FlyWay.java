package behavior.strategy.demo2;

public class FlyWay {
    private FeiJi feiJi;

    public FeiJi getFeiJi() {
        return feiJi;
    }

    public void setFeiJi(FeiJi feiJi) {
        this.feiJi = feiJi;
    }

    void startFly() {
        feiJi.startFly();
    }

    void flying() {
        feiJi.flying();
    }
}