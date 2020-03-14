package behavior.interpreter.demo3;

import java.util.ArrayList;
import java.util.Iterator;

public class ExpressionNode extends Node {
    private ArrayList<Node> list = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        while (true) {
            if (context.currentToken() == null) {
                break;
            } else if (context.currentToken().equals("END")) {
                context.skipToken("END");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public void execute() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Node) iterator.next()).execute();
        }
    }
}