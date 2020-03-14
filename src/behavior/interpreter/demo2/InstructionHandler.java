package behavior.interpreter.demo2;

import java.util.Stack;

public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left, right, direction, action, distance;
        Stack<AbstractNode> stack = new Stack<>();  //声明一个栈对象用于存储抽象语法树
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            //本实例采用栈的方式处理指令，如果遇到"and"，则将其后的3个单词作为3个终结符表达式
            //连成一个简单句子SentenceNode作为"and"的右表达式，而将从栈顶弹出的表达式作为"and"
            //的左表达式，最后将新的"and"表达式压入栈中
            String word1, word2, word3;
            if (words[i].equalsIgnoreCase("and")) {
                left = stack.pop();
                word1 = words[++i];
                direction = new DirectionNode(word1);
                word2 = words[++i];
                action = new ActionNode(word2);
                word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                word1 = words[i];
                direction = new DirectionNode(word1);
                word2 = words[++i];
                action = new ActionNode(word2);
                word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = stack.pop();    //将全部表达式从栈中弹出
    }

    public String output() {
        return node.interpret();
    }
}