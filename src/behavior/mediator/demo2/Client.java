package behavior.mediator.demo2;

public class Client {
    public static void main(String[] args) {
        Window window = new Window();
        TextPane textPane = new TextPane();
        ListPane listPane = new ListPane();
        GraphicPane graphicPane = new GraphicPane();
        textPane.setMediator(window);
        listPane.setMediator(window);
        graphicPane.setMediator(window);
        window.textPane = textPane;
        window.listPane = listPane;
        window.graphicPane = graphicPane;
        textPane.show();
    }
}