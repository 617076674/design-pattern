package structure.bridge.demo2;

public abstract class File {
    protected DataBase dataBase;

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public abstract void handle();
}