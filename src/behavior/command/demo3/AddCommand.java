package behavior.command.demo3;

import java.util.ArrayList;
import java.util.List;

public class AddCommand extends AbstractCommand {
    private Adder adder = new Adder();

    private int index;

    private List<Integer> list = new ArrayList<>();

    @Override
    public int execute(int value) {
        list.add(value);
        index++;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-list.get(--index));
    }

    @Override
    public int redo() {
        if (index >= list.size()) {
            System.out.println("已是最新结果，无法继续恢复");
            return -1;
        }
        return adder.add(list.get(index++));
    }
}