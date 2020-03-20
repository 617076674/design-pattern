package behavior.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("股票价格目前为" + (Double) arg);
    }
}