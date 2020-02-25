package creational.singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        if (null != instance) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}