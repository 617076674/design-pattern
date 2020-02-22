package creational.factory.demo1;

public class Client {
    public static void main(String[] args) {
        ((LoggerFactory) XMLUtil.getBean()).createLogger().writeLog();
    }
}