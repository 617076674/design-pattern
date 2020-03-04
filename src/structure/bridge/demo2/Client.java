package structure.bridge.demo2;

public class Client {
    public static void main(String[] args) {
        DataBase dataBase = (DataBase) XMLUtil.getBean("database");
        File file = (File) XMLUtil.getBean("file");
        file.setDataBase(dataBase);
        file.handle();
    }
}