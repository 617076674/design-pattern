package structure.bridge.demo2;

public class TxtFile extends File {
    @Override
    public void handle() {
        dataBase.show();
        System.out.println("TXT文件格式");
    }
}