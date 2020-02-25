package creational.prototype.demo1.deepclone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog log1 = new WeeklyLog();
        log1.setName("小Q");
        log1.setNumber(25);
        log1.setAttachment(new Attachment());
        WeeklyLog log2 = log1.deepClone();
        System.out.println(log1 == log2); //false
        System.out.println(log1.getAttachment() == log2.getAttachment()); //false
        System.out.println(log1.getName() == log2.getName());   //false
        System.out.println(log1.getNumber() == log2.getNumber());   //true
    }
}