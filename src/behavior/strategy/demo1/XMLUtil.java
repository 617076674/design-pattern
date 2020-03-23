package behavior.strategy.demo1;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean() {
        try {
            return Class.forName(DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new File("src//behavior//strategy//demo1//config.xml"))
                    .getElementsByTagName("className").item(0).getFirstChild().getNodeValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}