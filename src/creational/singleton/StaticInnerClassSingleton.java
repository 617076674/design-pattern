package creational.singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        if (null != HolderClass.instance) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class HolderClass {
        private final static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return HolderClass.instance;
    }
}