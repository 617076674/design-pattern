package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Multition {
    private Multition() {}

    private static final List<Multition> list;

    static {
        list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(new Multition());
        }
    }

    public static Multition getInstance() {
        return list.get((int) (Math.random() * 2));
    }
}