package behavior.interpreter.test;

import java.util.Stack;

public class InstructionHandler {

    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null, numNode;
        Stack<AbstractNode> stack = new Stack<>();  //声明一个栈对象用于存储抽象语法树
        for (int i = 0; i < instruction.length(); i++) {
            if (instruction.charAt(i) == '*') {
                left = stack.pop();
                right = new NumNode(Integer.valueOf(instruction.substring(i + 1, i + 2)));
                stack.push(new MultiNode(left, right));
                i++;
            } else if (instruction.charAt(i) == '/') {
                left = stack.pop();
                right = new NumNode(Integer.valueOf(instruction.substring(i + 1, i + 2)));
                stack.push(new DivideNode(left, right));
                i++;
            } else if (instruction.charAt(i) == '%') {
                left = stack.pop();
                right = new NumNode(Integer.valueOf(instruction.substring(i + 1, i + 2)));
                stack.push(new ModNode(left, right));
                i++;
            } else {
                stack.push(new NumNode(Integer.valueOf(instruction.substring(i, i + 1))));
            }
        }
        this.node = stack.pop();    //将全部表达式从栈中弹出
    }

    public int output() {
        return node.interpret();
    }

}
