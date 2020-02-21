package behavior.template;

/**
 * @author qianyihui
 * @date 2019-06-15
 */
public class Client {

    public static void main(String[] args) {
        Account account;
        account = (Account) XMLUtil.getBean();
        account.handle("张无忌", "123456");
    }

}
