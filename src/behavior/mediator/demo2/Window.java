package behavior.mediator.demo2;

public class Window extends Mediator {
    public TextPane textPane;

    public ListPane listPane;

    public GraphicPane graphicPane;

    @Override
    public void operation(Pane pane) {
        if (pane == textPane) {
            System.out.println("中介者收到了TextPane的方法请求");
        } else if (pane == listPane) {
            System.out.println("中介者收到了ListPane的方法请求");
        } else if (pane == graphicPane) {
            System.out.println("中介者收到了GraphicPane的方法请求");
        }
    }
}