package structure.bridge;

/**
 * @author qianyihui
 * @date 2019-06-18
 */
public abstract class Image {
    protected ImageImp imp;

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
