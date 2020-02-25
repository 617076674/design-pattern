package creational.singleton;

public class LazySingleton {
    private volatile static LazySingleton instance;

    private LazySingleton() {
        if (null != instance) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static LazySingleton getInstance() {
        if (null == instance) { //第一次判断
            synchronized (LazySingleton.class) {    //锁定代码块
                if (null == instance) { //第二次判断
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }
}