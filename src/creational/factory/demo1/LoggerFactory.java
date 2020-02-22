package creational.factory.demo1;

public interface LoggerFactory {
    Logger createLogger();

    Logger createLogger(String args);

    Logger createLogger(Object obj);
}