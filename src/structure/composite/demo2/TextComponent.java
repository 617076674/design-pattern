package structure.composite.demo2;

public class TextComponent extends Component {
    @Override
    public void operation() {
        System.out.println("文本操作");
    }

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException("文本不支持新增组件操作");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("文本不支持删除组件操作");
    }
}