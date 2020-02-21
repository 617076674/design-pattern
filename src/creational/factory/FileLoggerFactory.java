package creational.factory;

/**
 * @author qianyihui
 * @date 2019-06-21
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
