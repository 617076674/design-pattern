package creational.factory;

/**
 * @author qianyihui
 * @date 2019-06-21
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录.");
    }
}
