package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton singleton1 = Singleton.getInstance();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(singleton1);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Singleton singleton2 = (Singleton) ois.readObject();
        System.out.println(singleton1 == singleton2);

//        Class objectClass = EagerSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        EagerSingleton singleton1 = EagerSingleton.getInstance();
//        EagerSingleton singleton2 = (EagerSingleton) constructor.newInstance();
//        System.out.println(singleton1 == singleton2);

//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton singleton1 = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton singleton2 = (StaticInnerClassSingleton) constructor.newInstance();
//        System.out.println(singleton1 == singleton2);

//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);

//        LazySingleton singleton1 = LazySingleton.getInstance();
//        LazySingleton singleton2 = (LazySingleton) constructor.newInstance();

//        LazySingleton singleton2 = (LazySingleton) constructor.newInstance();
//        LazySingleton singleton1 = LazySingleton.getInstance();
//        System.out.println(singleton1 == singleton2);

//        EnumSingleton singleton = EnumSingleton.getInstance();
//        singleton.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(singleton);
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumSingleton newSingleton = (EnumSingleton) ois.readObject();
//        System.out.println(singleton.getData() == newSingleton.getData());

//        Class objectClass = EnumSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        EnumSingleton singleton1 = EnumSingleton.getInstance();
//        EnumSingleton singleton2 = (EnumSingleton) constructor.newInstance("qyh", 666);
//        System.out.println(singleton1 == singleton2);
//        Singleton singleton = Singleton.getInstance();
//        System.out.println(singleton == Singleton.getInstance());
    }
}