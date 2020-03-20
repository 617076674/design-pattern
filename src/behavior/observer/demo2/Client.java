package behavior.observer.demo2;

public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.addObserver(new Person());
        stock.setPrice(3.0);
    }
}