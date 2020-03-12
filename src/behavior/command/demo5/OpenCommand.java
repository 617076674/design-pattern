package behavior.command.demo5;

public class OpenCommand extends Command {
    @Override
    public void execute() {
        boardScreen.open();
    }
}