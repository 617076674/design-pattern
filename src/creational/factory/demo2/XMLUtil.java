package creational.factory.demo2;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean() {
        try {
            return Class.forName(DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new File("src//creational//factory//demo2//config.xml"))
                    .getElementsByTagName("className").item(0).getFirstChild().getNodeValue().trim())
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}