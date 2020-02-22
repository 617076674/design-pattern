package creational.factory.demo3;

public abstract class PictureReaderFactory {
    public void read() {
        this.createPictureReader().read();
    }

    public abstract PictureReader createPictureReader();
}
