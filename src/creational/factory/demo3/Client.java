package creational.factory.demo3;

public class Client {
    public static void main(String[] args) {
        ((PictureReaderFactory) XMLUtil.getBean()).read();
    }
}