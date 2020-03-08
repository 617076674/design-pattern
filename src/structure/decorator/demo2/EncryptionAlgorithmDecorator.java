package structure.decorator.demo2;

public class EncryptionAlgorithmDecorator extends EncryptionAlgorithm {
    EncryptionAlgorithm encryptionAlgorithm;

    public EncryptionAlgorithmDecorator(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    @Override
    public void encryption() {
        encryptionAlgorithm.encryption();
    }
}