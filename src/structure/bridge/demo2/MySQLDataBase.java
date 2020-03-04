package structure.bridge.demo2;

public class MySQLDataBase implements DataBase {
    @Override
    public void show() {
        System.out.println("MySQL数据库");
    }
}