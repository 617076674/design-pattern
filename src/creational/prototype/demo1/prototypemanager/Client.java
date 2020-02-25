package creational.prototype.demo1.prototypemanager;

public class Client {
    public static void main(String args[]) {
        PrototypeManager pm = PrototypeManager.getPrototypeManager(); //获取原型管理器对象
        OfficialDocument doc1 = pm.getOfficialDocument("far");
        doc1.display();
        OfficialDocument doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2); //false
        OfficialDocument doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        OfficialDocument doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4); //false
        OfficialDocument doc5 = pm.getOfficialDocument("ppr");
        doc5.display();
        OfficialDocument doc6 = pm.getOfficialDocument("ppr");
        doc6.display();
        System.out.println(doc3 == doc4); //false
    }
}