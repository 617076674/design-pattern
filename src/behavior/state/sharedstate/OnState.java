package behavior.state.sharedstate;

/**
 * @author qianyihui
 * @date 2019-06-13
 */
public class OnState extends SwitchState {

    @Override
    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }

}
