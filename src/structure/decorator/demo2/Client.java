package structure.decorator.demo2;

public class Client {
    public static void main(String[] args) {
        EncryptionAlgorithm encryptionAlgorithm1 = new SimpleEncryption(), encryptionAlgorithm2 = new ReverseEncryptionDecorator(encryptionAlgorithm1), encryptionAlgorithm3 = new ModEncryptionDecorator(encryptionAlgorithm2);
        encryptionAlgorithm3.encryption();
    }
}