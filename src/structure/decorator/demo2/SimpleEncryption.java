package structure.decorator.demo2;

public class SimpleEncryption extends EncryptionAlgorithm {
    @Override
    public void encryption() {
        System.out.println("简单加密");
    }
}