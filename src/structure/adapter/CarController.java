package structure.adapter;

/**
 * @author qianyihui
 * @date 2019-06-19
 */
public abstract class CarController {
    public void move() {
        System.out.println("玩具汽车移动");
    }
    public abstract void phonate(); //发出声音
    public abstract void twinkle(); //灯光闪烁
}
