package creational.abstractfactory.demo1;

public interface SkinFactory {
    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}