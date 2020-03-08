package structure.facade;

public class Client {
    public static void main(String[] args) {
        new EncryptFacade().fileEncrypt("src//structure//facade//src.txt",
                "src//structure//facade//des.txt");
    }
}