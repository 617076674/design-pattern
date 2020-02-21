package structure.facade;

/**
 * @author qianyihui
 * @date 2019-06-29
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src//structure//facade//src.txt",
                "src//structure//facade//des.txt");
    }
}
