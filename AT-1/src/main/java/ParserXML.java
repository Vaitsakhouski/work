import Commands.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * parsing XML file
 */
public class ParserXML extends Commands {

    /**
     * getting XML file with instructions
     * parsing of XML file
     */
    public void parseXML() throws Exception {
        WebDriver driver = new ChromeDriver();
        File inputFile = new File("./CommandsXML.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputFile);
        NodeList nodeList1 = document.getElementsByTagName("open");
        for (int j = 0; j < nodeList1.getLength(); j++) {
            NamedNodeMap nodeMap = nodeList1.item(j).getAttributes();
            String url = nodeMap.getNamedItem("url").getNodeValue();
            String time = nodeMap.getNamedItem("time").getNodeValue();
            open(driver, url, time);
            title(driver);
        }
        NodeList nodeList2 = document.getElementsByTagName("checkPageContains");
        for (int j = 0; j < nodeList2.getLength(); j++) {
            NamedNodeMap nodeMap1 = nodeList2.item(j).getAttributes();
            String text = nodeMap1.getNamedItem("text").getNodeValue();
            contains(driver, text);
        }
        NodeList nodeList3 = document.getElementsByTagName("checkLinkPresentByName");
        for (int j = 0; j < nodeList3.getLength(); j++) {
            NamedNodeMap nodeMap2 = nodeList3.item(j).getAttributes();
            String text1 = nodeMap2.getNamedItem("text1").getNodeValue();
            linkByName(driver, text1);
        }
        NodeList nodeList4 = document.getElementsByTagName("checkLinkPresentByHref");
        for (int j = 0; j < nodeList4.getLength(); j++) {
            NamedNodeMap nodeMap2 = nodeList4.item(j).getAttributes();
            String text2 = nodeMap2.getNamedItem("text2").getNodeValue();
            linkByHref(driver, text2);
            logResult();
            driver.quit();
        }
    }
}