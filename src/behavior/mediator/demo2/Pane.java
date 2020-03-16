package behavior.mediator.demo2;

public abstract class Pane {
    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void show() {
        mediator.operation(this);
    }

    public abstract void specialMethod();
}