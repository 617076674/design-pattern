package behavior.interpreter.demo1;

import java.util.Stack;

public class InstructionHandler {
    private AbstractExpression node;

    public void handle(String instruction) {
        AbstractExpression left, right;
        Stack<AbstractExpression> stack = new Stack<>();  //声明一个栈对象用于存储抽象语法树
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("+")) {
                left = stack.pop();
                right = new NumExpression(Integer.parseInt(words[++i]));
                stack.push(new AddExpression(left, right));
            } else if (words[i].equalsIgnoreCase("-")) {
                left = stack.pop();
                right = new NumExpression(Integer.parseInt(words[++i]));
                stack.push(new SubExpression(left, right));
            } else {
                stack.push(new NumExpression(Integer.parseInt(words[i])));
            }
        }
        this.node = stack.pop();    //将全部表达式从栈中弹出
    }

    public int output() {
        return node.interpret();
    }
}