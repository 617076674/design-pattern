package behavior.command.demo5;

public class CreateCommand extends Command {
    @Override
    public void execute() {
        boardScreen.create();
    }
}