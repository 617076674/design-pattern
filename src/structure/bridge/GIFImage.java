package structure.bridge;

/**
 * @author qianyihui
 * @date 2019-06-18
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为GIF.");
    }
}
