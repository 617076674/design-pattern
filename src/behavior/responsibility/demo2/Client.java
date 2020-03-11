package behavior.responsibility.demo2;

public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest(3);
        Handler handler = new Director("主任");
        handler.setSuccessor(new Manager("经理"));
        handler.processRequest(leaveRequest);
    }
}