package structure.adapter.demo2;

public class PoliceCarAdapter extends CarController {
    private PoliceSound sound;      //定义适配者PoliceSound对象

    private PoliceLamp lamp;        //定义适配者PoliceLamp对象

    public PoliceCarAdapter() {
        this.sound = new PoliceSound();
        this.lamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        sound.alarmSound();         //调用适配者类PoliceSound的方法
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();           //调用适配者类PoliceLamp的方法
    }
}