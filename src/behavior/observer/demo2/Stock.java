package behavior.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class Stock extends Observable {
    private double price;

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        super.notifyObservers(price);
    }
}