package behavior.command.demo5;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem item1 = new MenuItem();
        item1.setCommand(new OpenCommand());
        menu.addMenuItem(item1);
        MenuItem item2 = new MenuItem();
        item2.setCommand(new CreateCommand());
        menu.addMenuItem(item2);
        MenuItem item3 = new MenuItem();
        item3.setCommand(new EditCommand());
        menu.addMenuItem(item3);
        item1.click();
        item2.click();
        item3.click();
    }
}