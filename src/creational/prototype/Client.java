package creational.prototype;

/**
 * @author qianyihui
 * @date 2019-06-24
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous, log_new;
        log_previous = new WeeklyLog();                 //创建原型对象
        Attachment attachment = new Attachment();    //创建附件对象
        log_previous.setAttachment(attachment);
        log_new = log_previous.clone();
        //比较周报
        System.out.println("周报是否相同？" + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？" + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
