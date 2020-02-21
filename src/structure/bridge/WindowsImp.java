package structure.bridge;

/**
 * @author qianyihui
 * @date 2019-06-18
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.println("在Windows系统中显示图像：");
    }
}
