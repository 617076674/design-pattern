package behavior.template.demo1;

public class Client {
    public static void main(String[] args) {
        ((Account) XMLUtil.getBean()).handle("张无忌", "123456");
    }
}