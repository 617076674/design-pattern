package creational.factory.demo3;

public class GIFPictureReader implements PictureReader {
    @Override
    public void read() {
        System.out.println("读取GIF图片");
    }
}