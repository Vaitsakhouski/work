
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import static org.testng.Assert.*;

/**
 * Created by NotePad.by on 05.11.2016.
 */
public class TriangleTest {
    private Triangle tr;
    private static final String NEGATIVE = "negative";
    private static final String ISOSCELES = "isosceles";
    private static final String EQUILATERAL = "equilateral";
    private static final String SIMPLE = "simple";
    private static final String SIDE_A = "side_a";
    private static final String SIDE_B = "side_b";
    private static final String SIDE_C = "side_c";

    @BeforeMethod
    public void setUp() throws Exception {
        tr = new Triangle();
    }

    @DataProvider(name = "negative")
    public Object[][] negative() throws Exception {
        File inputFile = new File("./triangle.data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputFile);
        NodeList nodes = document.getElementsByTagName(NEGATIVE);
        Object[][] result = new Double[nodes.getLength()][];
        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            result[i] = new Double[]{
                    Double.parseDouble(attrs.getNamedItem(SIDE_A).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_B).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_C).getNodeValue())
            };
        }
        return result;
    }

    @Test(dataProvider = "negative", expectedExceptions = Exception.class)
    public void testGetNegativeValue(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        tr.valid();
        Assert.assertEquals(tr.getType(), Exception.class);
    }

    @DataProvider(name = "positive Isosceles")
    public Object[][] positiveIsoscelesValue() throws Exception {
        File inputFile = new File("./triangle.data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputFile);
        NodeList nodes = document.getElementsByTagName(ISOSCELES);
        Object[][] result = new Double[nodes.getLength()][];
        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            result[i] = new Double[]{
                    Double.parseDouble(attrs.getNamedItem(SIDE_A).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_B).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_C).getNodeValue())
            };
        }
        return result;
    }

    @Test(dataProvider = "positive Isosceles")
    public void testGetPositiveIsoscelesValue(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        tr.valid();
        Assert.assertEquals(tr.getType(), Triangle.ISOSCELES);
    }


    @DataProvider(name = "positive Equilateral")
    public Object[][] positiveEquilateralValue() throws Exception {
        File inputFile = new File("./triangle.data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputFile);
        NodeList nodes = document.getElementsByTagName(EQUILATERAL);
        Object[][] result = new Double[nodes.getLength()][];
        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            result[i] = new Double[]{
                    Double.parseDouble(attrs.getNamedItem(SIDE_A).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_B).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_C).getNodeValue())
            };
        }
        return result;
    }

    @Test(dataProvider = "positive Equilateral")
    public void testGetPositiveEquilateralValue(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        tr.valid();
        Assert.assertEquals(tr.getType(), Triangle.EQUILATERAL);
    }

    @DataProvider(name = "positive Simple")
    public Object[][] positiveSimpleValue() throws Exception {
        File inputFile = new File("./triangle.data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputFile);
        NodeList nodes = document.getElementsByTagName(SIMPLE);
        Object[][] result = new Double[nodes.getLength()][];
        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            result[i] = new Double[]{
                    Double.parseDouble(attrs.getNamedItem(SIDE_A).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_B).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_C).getNodeValue())
            };
        }
        return result;
    }

    @Test(dataProvider = "positive Simple")
    public void testGetPositiveSimpleValue(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        tr.valid();
        Assert.assertEquals(tr.getType(), Triangle.SIMPLE);
    }
}