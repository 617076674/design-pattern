package behavior.state.demo3;

public class Screen {
    private ScreenState currentState, normalState, largerState, largestState;

    public Screen() {
        this.normalState = new NormalState();   //创建正常状态对象
        this.largerState = new LargerState();    //创建二倍放大状态对象
        this.largestState = new LargestState(); //创建四倍放大状态对象
        this.currentState = normalState;        //设置初始状态对象
        this.currentState.display();
    }

    public void setState(ScreenState state) {
        this.currentState = state;
    }

    //单击事件处理方法，封装了对状态类中业务方法的调用和状态的转换
    public void onClick() {
        if (this.currentState == normalState) {
            this.setState(largerState);
            this.currentState.display();
        } else if (this.currentState == largerState) {
            this.setState(largestState);
            this.currentState.display();
        } else if (this.currentState == largestState) {
            this.setState(normalState);
            this.currentState.display();
        }
    }
}