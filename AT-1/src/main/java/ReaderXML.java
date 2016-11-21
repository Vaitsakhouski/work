import Commands.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

/**
 * reading XML file
 */
public class ReaderXML {

    /**
     * reading instructions
     * in XML file
     */
    public void Read() throws Exception {
        File inputFile = new File("./CommandsXML.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputFile);
        NodeList nodeList = document.getElementsByTagName("commands");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                System.out.println("open \"" + element.getElementsByTagName("open").item(0).getAttributes().getNamedItem("url").getNodeValue() + "\" \""
                        + element.getElementsByTagName("open").item(0).getAttributes().getNamedItem("time").getNodeValue() + "\"" + "\n"
                        + "checkPageTitle \"" + element.getElementsByTagName("checkPageTitle").item(0).getAttributes().getNamedItem("title").getNodeValue() + "\"" + "\n"
                        + "checkPageContains \"" + element.getElementsByTagName("checkPageContains").item(0).getAttributes().getNamedItem("text").getNodeValue() + "\"" + "\n"
                        + "checkLinkPresentByName \"" + element.getElementsByTagName("checkLinkPresentByName").item(0).getAttributes().getNamedItem("text1").getNodeValue() + "\"" + "\n"
                        + "checkLinkPresentByHref \"" + element.getElementsByTagName("checkLinkPresentByHref").item(0).getAttributes().getNamedItem("text2").getNodeValue() + "\"" + "\n");
            }
        }
    }
}