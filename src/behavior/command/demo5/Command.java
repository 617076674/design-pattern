package behavior.command.demo5;

public abstract class Command {
    protected BoardScreen boardScreen = new BoardScreen();
    public abstract void execute();
}