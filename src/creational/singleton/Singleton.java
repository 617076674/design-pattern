package creational.singleton;

/**
 * @author qianyihui
 * @date 2019-06-25
 */
public class Singleton {
    private Singleton() {}

    //静态内部类
    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

