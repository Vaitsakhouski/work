import Commands.Commands;
import Commands.Readd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Scanner;

/**
 * entry point in the
 * application
 */
public class Main {

    /**
     * switch method of parsing
     * getting instructions from XML or TXT file
     * and show result log file
     *
     * @param args - command line argument
     */
    public static void main(String[] args) throws Exception {
        //System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        int choose = 0;
        System.out.println("make your choose:1-XML,2-TXT");
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                ReaderXML a = new ReaderXML();
                a.Read();
                ParserXML b = new ParserXML();
                b.parseXML();
                Readd bb = new Readd();
                bb.read();
                break;
            case 2:
                ReaderTXT q = new ReaderTXT();
                q.crod();
                //ParserTXT qq = new ParserTXT();
                //qq.parseTXT("");
                Readd qw = new Readd();
                qw.read();
                break;
        }
    }
}

