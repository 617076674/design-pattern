package behavior.state.sharedstate;

/**
 * @author qianyihui
 * @date 2019-06-13
 */
public class OffState extends SwitchState {

    @Override
    public void on(Switch s) {
        System.out.println("打开！");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭");
    }

}
