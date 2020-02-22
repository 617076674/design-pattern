package creational.factory.demo3;

public class JPGPictureReaderFactory extends PictureReaderFactory {
    @Override
    public PictureReader createPictureReader() {
        return new JPGPictureReader();
    }
}
