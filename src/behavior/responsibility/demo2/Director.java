package behavior.responsibility.demo2;

public class Director extends Handler {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getDay() < 3) {
            System.out.println("主任审批请假单成功");
        } else {
            this.successor.processRequest(request);
        }
    }
}