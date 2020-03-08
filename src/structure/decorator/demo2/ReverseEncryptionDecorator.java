package structure.decorator.demo2;

public class ReverseEncryptionDecorator extends EncryptionAlgorithmDecorator {
    public ReverseEncryptionDecorator(EncryptionAlgorithm encryptionAlgorithm) {
        super(encryptionAlgorithm);
    }

    @Override
    public void encryption() {
        super.encryption();
        againEncryption();
    }

    private void againEncryption() {
        System.out.println("逆向输出加密");
    }
}