package behavior.responsibility.demo2;

public class Manager extends Handler {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        System.out.println("经理处理请假单成功");
    }
}