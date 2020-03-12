package behavior.command.demo5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> list = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        list.add(menuItem);
    }
}