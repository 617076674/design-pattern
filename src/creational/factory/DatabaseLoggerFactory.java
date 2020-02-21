package creational.factory;

/**
 * @author qianyihui
 * @date 2019-06-21
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
