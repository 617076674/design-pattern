package behavior.interpreter.demo1;

public class Client {
    public static void main(String[] args) {
        String expression = "5 + 2 - 3";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(expression);
        System.out.println(handler.output());
    }
}