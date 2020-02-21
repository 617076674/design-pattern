package creational.singleton;

/**
 * @author qianyihui
 * @date 2019-06-25
 */
public class LazySingleton {
    //如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile
    //被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK1.5及以上版本中
    //才能正确执行。由于volatile关键字防止指令重排，可能会导致系统的运行效率降低，因此即使使用双
    //重检查锁定来实现单例模式也不是一种完美的实现方式。
    private volatile static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }
}
