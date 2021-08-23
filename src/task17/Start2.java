package task17;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Start2 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("task17.xml"));

        Element element = document.getDocumentElement();
        printElements(element.getChildNodes());

    }
    static  void printElements(NodeList nodeList){
        for (int i =0;i<nodeList.getLength();i++){
            if(nodeList.item(i)instanceof Element)
            System.out.println(((Element) nodeList.item(i)).getTagName());
           if (((Element) nodeList.item(i)).hasAttribute("name" )) {
               System.out.println(((Element)  nodeList.item(i)).getAttributes());
           }
            if (nodeList.item(i).hasChildNodes()){
                printElements(nodeList.item(i).getChildNodes());
            }
        }
    }
    }
