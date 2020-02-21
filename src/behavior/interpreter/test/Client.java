package behavior.interpreter.test;

public class Client {
    public static void main(String[] args) {
        InstructionHandler handler = new InstructionHandler();
        handler.handle("3*4/2%4");
        System.out.println(handler.output());

    }
}
