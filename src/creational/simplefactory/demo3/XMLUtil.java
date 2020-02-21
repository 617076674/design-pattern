package creational.simplefactory.demo3;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static String getShapeType() {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new File("src//creational//simplefactory//demo3//config.xml"))
                    .getElementsByTagName("shapeType").item(0).getFirstChild().getNodeValue().trim();
        } catch (Exception e) {
            return null;
        }
    }
}
