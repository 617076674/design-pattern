package structure.bridge.demo1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法从XML配置文件中提取具体类的类名，并返回一个实例对象
    public static Object getBean(String args) {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("src//structure//bridge//demo1//config.xml"));
            Node classNode = null;
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            if (args.equals("image")) {
                classNode = nl.item(0).getFirstChild();
            } else if (args.equals("os")) {
                classNode = nl.item(1).getFirstChild();
            }
            return Class.forName(classNode.getNodeValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}