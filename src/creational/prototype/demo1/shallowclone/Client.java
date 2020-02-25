package creational.prototype.demo1.shallowclone;

public class Client {
    public static void main(String[] args) {
        WeeklyLog log1 = new WeeklyLog();
        log1.setName("小Q");
        log1.setNumber(25);
        log1.setAttachment(new Attachment());
        WeeklyLog log2 = log1.clone();
        System.out.println(log1 == log2); //false
        System.out.println(log1.getAttachment() == log2.getAttachment()); //true
        System.out.println(log1.getName() == log2.getName());   //true
        System.out.println(log1.getNumber() == log2.getNumber());   //true
    }
}