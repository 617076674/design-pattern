package structure.composite.demo2;

public abstract class Component {
    public abstract void operation();

    public abstract void addComponent(Component component);

    public abstract void remove(Component component);
}