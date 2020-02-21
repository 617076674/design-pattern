package creational.factory;

/**
 * @author qianyihui
 * @date 2019-06-21
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
