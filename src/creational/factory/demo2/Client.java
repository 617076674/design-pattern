package creational.factory.demo2;

public class Client {
    public static void main(String[] args) {
        ((LoggerFactory) XMLUtil.getBean()).writeLog();
    }
}