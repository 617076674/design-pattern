package behavior.responsibility.demo2;


public abstract class Handler {
    protected Handler successor;

    protected String name;

    public Handler(String name) {
        this.name = name;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void processRequest(LeaveRequest request);
}