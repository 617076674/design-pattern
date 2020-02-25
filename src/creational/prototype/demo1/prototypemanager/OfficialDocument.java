package creational.prototype.demo1.prototypemanager;

public interface OfficialDocument extends Cloneable {
    OfficialDocument clone();

    void display();
}