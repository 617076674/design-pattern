package creational.prototype.demo1.prototypemanager;

import java.util.Hashtable;

public class PrototypeManager {
    private Hashtable ht = new Hashtable();      //定义一个Hashtable，用于存储原型对象
    private static PrototypeManager pm = new PrototypeManager();

    //为Hashtable增加公文对象 private PrototypeManager()
    {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
        ht.put("ppr", new PPR());
    }

    //增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }
}