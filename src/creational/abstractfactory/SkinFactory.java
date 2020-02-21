package creational.abstractfactory;

/**
 * @author qianyihui
 * @date 2019-06-22
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
