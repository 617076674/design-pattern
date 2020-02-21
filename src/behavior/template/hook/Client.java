package behavior.template.hook;

/**
 * @author qianyihui
 * @date 2019-06-15
 */
public class Client {

    public static void main(String[] args) {
        DataViewer dv;
        dv = new XMLDataViewer();
        dv.process();
    }

}
