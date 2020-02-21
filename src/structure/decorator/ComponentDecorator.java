package structure.decorator;

/**
 * @author qianyihui
 * @date 2019-06-28
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
