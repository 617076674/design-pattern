package creational.factory.demo3;

public class GIFPictureReaderFactory extends PictureReaderFactory {
    @Override
    public PictureReader createPictureReader() {
        return new GIFPictureReader();
    }
}
