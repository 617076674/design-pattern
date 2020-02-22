package creational.factory.demo2;

public abstract class LoggerFactory {
    //在工厂类中直接调用日志记录器类的业务方法writeLog()
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();

    public abstract Logger createLogger(String args);

    public abstract Logger createLogger(Object obj);
}