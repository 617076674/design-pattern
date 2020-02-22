package creational.factory.demo3;

public class JPGPictureReader implements PictureReader {
    @Override
    public void read() {
        System.out.println("读取JPG图片");
    }
}