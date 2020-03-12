package behavior.command.demo5;

public class EditCommand extends Command {
    @Override
    public void execute() {
        boardScreen.edit();
    }
}