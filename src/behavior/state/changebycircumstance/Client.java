package behavior.state.changebycircumstance;

/**
 * @author qianyihui
 * @date 2019-06-13
 */
public class Client {

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }

}
