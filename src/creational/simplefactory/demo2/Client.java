package creational.simplefactory.demo2;

public class Client {
    public static void main(String[] args) {
        Chart.getChart(XMLUtil.getCharType()).display();
    }
}