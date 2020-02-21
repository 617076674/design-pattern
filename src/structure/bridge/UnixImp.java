package structure.bridge;

/**
 * @author qianyihui
 * @date 2019-06-18
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在UNIX操作系统中显示图像：");
    }
}
