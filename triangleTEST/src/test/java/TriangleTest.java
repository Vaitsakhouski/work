
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
    private static final String POSITIVE = "positive";
    private static final String EXPECTED = "expected";

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
            double SIDE_A;
            double SIDE_B;
            double SIDE_C;
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            if (attrs.getNamedItem("side_a").getNodeValue().equals("MAX_VALUE")) {
                SIDE_A = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("side_a").getNodeValue().equals("MIN_VALUE")) {
                SIDE_A = Double.MIN_VALUE;
            } else {
                SIDE_A = Double.parseDouble(attrs.getNamedItem("side_a").getNodeValue());
            }
            if (attrs.getNamedItem("side_b").getNodeValue().equals("MAX_VALUE")) {
                SIDE_B = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("side_b").getNodeValue().equals("MIN_VALUE")) {
                SIDE_B = Double.MIN_VALUE;
            } else {
                SIDE_B = Double.parseDouble(attrs.getNamedItem("side_b").getNodeValue());
            }
            if (attrs.getNamedItem("side_c").getNodeValue().equals("MAX_VALUE")) {
                SIDE_C = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("side_c").getNodeValue().equals("MIN_VALUE")) {
                SIDE_C = Double.MIN_VALUE;
            } else {
                SIDE_C = Double.parseDouble(attrs.getNamedItem("side_c").getNodeValue());
            }
            result[i] = new Double[]{SIDE_A, SIDE_B, SIDE_C};
        }
        return result;
    }

    @Test(dataProvider = "negative", expectedExceptions = Exception.class)
    public void testGetNegativeValue(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        tr.valid();
        Assert.assertEquals(tr.getType(), Exception.class);
    }

    @DataProvider(name = "positive")
    public Object[][] positive() throws Exception {
        File inputFile = new File("./triangle.data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputFile);
        NodeList nodes = document.getElementsByTagName(POSITIVE);
        Object[][] result = new Object[nodes.getLength()][];
        for (int i = 0; i < nodes.getLength(); i++) {
            double SIDE_A;
            double SIDE_B;
            double SIDE_C;
            String expected;
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            if (attrs.getNamedItem("side_a").getNodeValue().equals("MAX_VALUE")) {
                SIDE_A = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("side_a").getNodeValue().equals("MIN_VALUE")) {
                SIDE_A = Double.MIN_VALUE;
            } else {
                SIDE_A = Double.parseDouble(attrs.getNamedItem("side_a").getNodeValue());
            }
            if (attrs.getNamedItem("side_b").getNodeValue().equals("MAX_VALUE")) {
                SIDE_B = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("side_b").getNodeValue().equals("MIN_VALUE")) {
                SIDE_B = Double.MIN_VALUE;
            } else {
                SIDE_B = Double.parseDouble(attrs.getNamedItem("side_b").getNodeValue());
            }
            if (attrs.getNamedItem("side_c").getNodeValue().equals("MAX_VALUE")) {
                SIDE_C = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("side_c").getNodeValue().equals("MIN_VALUE")) {
                SIDE_C = Double.MIN_VALUE;
            } else {
                SIDE_C = Double.parseDouble(attrs.getNamedItem("side_c").getNodeValue());
            }
            expected = attrs.getNamedItem(EXPECTED).getNodeValue();
            result[i] = new Object[]{expected, SIDE_A, SIDE_B, SIDE_C};
        }
        return result;
    }

    @Test(dataProvider = "positive")
    public void testGetPositiveValue(String excepted, double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        tr.valid();
        Assert.assertEquals(tr.getType(), excepted);
    }
}