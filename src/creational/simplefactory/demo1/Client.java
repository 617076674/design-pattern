package creational.simplefactory.demo1;

public class Client {
    public static void main(String[] args) {
        ChartFactory.getChart(XMLUtil.getCharType()).display();
    }
}