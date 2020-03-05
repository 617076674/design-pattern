package structure.composite.demo2;

import java.util.ArrayList;
import java.util.List;

public class WindowComponent extends Component {
    List<Component> list = new ArrayList<>();

    @Override
    public void operation() {
        for (Component component : list) {
            component.operation();
        }
    }

    @Override
    public void addComponent(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }
}