package creational.builder.demo2;

public class Client {
    public static void main(String[] args) {
        Pattern pattern = ((PatternBuilder) XMLUtil.getBean()).construct();
        System.out.println(pattern.getMenu());
    }
}