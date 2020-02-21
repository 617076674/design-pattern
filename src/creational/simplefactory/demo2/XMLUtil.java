package creational.simplefactory.demo2;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static String getCharType() {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new File("src//creational//simplefactory//demo2//config.xml"))
                    .getElementsByTagName("chartType").item(0).getFirstChild().getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}