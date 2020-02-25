package creational.prototype.demo1.prototypemanager;

public class PPR implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制!");
        }
        return far;
    }

    public void display() {
        System.out.println("《项目进展报告》");
    }
}