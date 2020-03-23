package behavior.template.demo1;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {

    //该方法从XML配置文件中提取具体类的类名，并返回一个实例对象
    public static Object getBean() {
        try {
            return Class.forName(DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new File("src//behavior//template//demo1//config.xml"))
                    .getElementsByTagName("className").item(0).getFirstChild().getNodeValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
