package structure.flyweight.demo2;

import java.util.Hashtable;

public class ResourceFactory {
    private static ResourceFactory instance = new ResourceFactory();

    private static Hashtable ht;

    private ResourceFactory() {
        ht = new Hashtable();
        Resource picture = new PictureResource(), video = new VideoResource();
        ht.put("p", picture);
        ht.put("v", video);
    }

    public static ResourceFactory getInstance() {
        return instance;
    }

    public Resource getResource(String type) {
        return (Resource) ht.get(type);
    }
}