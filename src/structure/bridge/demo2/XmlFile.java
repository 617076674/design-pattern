package structure.bridge.demo2;

public class XmlFile extends File {
    @Override
    public void handle() {
        dataBase.show();
        System.out.println("XML文件格式");
    }
}