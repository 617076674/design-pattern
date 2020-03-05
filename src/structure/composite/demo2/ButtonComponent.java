package structure.composite.demo2;

public class ButtonComponent extends Component {
    @Override
    public void operation() {
        System.out.println("按钮操作");
    }

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException("按钮不支持新增组件操作");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("按钮不支持删除组件操作");
    }
}