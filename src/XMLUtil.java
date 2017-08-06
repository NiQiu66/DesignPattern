package Bridge;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by NiQiu on 2017/8/6.
 */
public class XMLUtil {
    public  static Object getBean(String args){

        try {
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder=dFactory.newDocumentBuilder();
            org.w3c.dom.Document doc=dBuilder.parse(new File("config.xml"));
            NodeList nl=null;
            Node classNode=null;
            String cName=null;
            nl=doc.getElementsByTagName("className");
            if (args.equals("image")){
                classNode=nl.item(0).getFirstChild();
            }else  if (args.equals("os")){
                classNode=nl.item(1).getFirstChild();
            }
            cName=classNode.getNodeValue();
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return  obj;
        }catch (Exception ex){
            return null;
        }
    }
}
