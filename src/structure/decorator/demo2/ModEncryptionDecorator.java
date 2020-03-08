package structure.decorator.demo2;

public class ModEncryptionDecorator extends EncryptionAlgorithmDecorator {
    public ModEncryptionDecorator(EncryptionAlgorithm encryptionAlgorithm) {
        super(encryptionAlgorithm);
    }

    @Override
    public void encryption() {
        super.encryption();
        again();
    }

    private void again() {
        System.out.println("求模加密");
    }
}