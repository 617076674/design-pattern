package behavior.interpreter.demo2;

public class Client {
    public static void main(String[] args) {
        String instruction = "up move 5 and down run 10 and left move 20";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        System.out.println(handler.output());
    }
}