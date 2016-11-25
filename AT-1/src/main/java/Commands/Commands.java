package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import static java.awt.SystemColor.text;
import static java.lang.Math.pow;

/**
 * commands, which will be completed
 * by any manner(XML or TXT)
 */
public class Commands implements Instructions {
    private double resTime;
    private String log = "";
    private String resultOpen;
    private String resultTitle;
    private int countTESTS;
    private int PASSED_TEST;
    private int FAILED_TEST;
    private String resultSource;
    private String resultLinkByName;
    private String resultLinkByHref;

    @Override
    public void command(WebDriver driver) {
        driver = new ChromeDriver();
    }

    /**
     * Open page, calculating time of loading
     * if test will passe - write "+" in log
     * if test failed - write "!" in log
     * calculating count of tests
     *
     * @param driver - object
     * @param url - String type, url of page
     * @param time - String type, time of loading of page
     */
    public void open(WebDriver driver, String url, String time) {
        double start = System.currentTimeMillis();
        driver.get(url);
        double res = (System.currentTimeMillis() - start) / 1000;
        String result = String.valueOf(res);
        if (res < Long.parseLong(time)) {
            log = "+";
            PASSED_TEST++;
        } else {
            log = "!";
            FAILED_TEST++;
        }
        resultOpen = log + " [open \"" + url + "\" \"" + time + "\"]" + " " + result + "\n";
        resTime += res;
        countTESTS++;
    }

    /**
     * getting title of page
     * if test will passe - write "+" in log
     * if test failed - write "!" in log
     * calculating count of tests
     *
     * @param driver - object
     */
    public void title(WebDriver driver) {
        double start = System.currentTimeMillis();
        driver.getTitle();
        double res = (System.currentTimeMillis() - start) / 1000;
        String result = String.valueOf(res);
        if (!driver.getTitle().equals("")) {
            log = "+";
            PASSED_TEST++;
        } else {
            log = "!";
            FAILED_TEST++;
        }
        resultTitle = log + " [checkPageTitle \"" + driver.getTitle() + "\"]" + " " + result + "\n";
        resTime += res;
        countTESTS++;
    }

    /**
     * searching element by linkText
     * if test will passe - write "+" in log
     * if test failed - write "!" in log
     * calculating count of tests
     *
     * @param driver - object
     * @param text1 - String type, text in link
     */
    public void linkByName(WebDriver driver, String text1) {
        double start = System.currentTimeMillis();
        double res = (System.currentTimeMillis() - start) / 1000;
        String result = String.valueOf(res);
        if (!driver.findElement(By.linkText(text1)).getText().equals("")) {
            log = "+";
            PASSED_TEST++;
        } else {
            log = "!";
            FAILED_TEST++;
        }
        resultLinkByName = log + " [checkLinkPresentByName \"" + driver.findElement(By.linkText(text1)).getText() + "\"]" + " " + result + "\n";
        resTime += res;
        countTESTS++;
    }

    /**
     * searching element in page
     * if test will passe - write "+" in log
     * if test failed - write "!" in log
     * calculating count of tests
     *
     * @param driver - object
     * @param text - String type, text on page
     */
    public void contains(WebDriver driver, String text) {
        double start = System.currentTimeMillis();
        double res = (System.currentTimeMillis() - start) / 1000;
        String result = String.valueOf(res);
        if (driver.getPageSource().contains(text)) {
            log = "+";
            PASSED_TEST++;
        } else {
            log = "!";
            FAILED_TEST++;
        }
        resultSource = log + " [checkPageContains \"" + driver.getPageSource().contains(text) + "\"]" + " " + result + "\n";
        resTime += res;
        countTESTS++;
    }

    /**
     * searching element by xpath(href)
     * if test will passe - write "+" in log
     * if test failed - write "!" in log
     * calculating count of tests
     *
     * @param driver - object
     * @param text2 - String type, link by href
     */
    public void linkByHref(WebDriver driver, String text2) {
        double start = System.currentTimeMillis();
        double res = (System.currentTimeMillis() - start) / 1000;
        String result = String.valueOf(res);
        if (!driver.findElement(By.xpath("//a[@href='" + text2 + "']")).getText().equals(driver.findElement(By.xpath("//a[@href='" + "" + "']")))) {
            log = "+";
            PASSED_TEST++;
        } else {
            log = "!";
            FAILED_TEST++;
        }
        resultLinkByHref = log + " [checkLinkPresentByHref \"" + driver.findElement(By.xpath("//a[@href='" + text2 + "']")).getText() + "\"]" + " " + result + "\n";
        resTime += res;
        countTESTS++;
    }

    /**
     * print log of tests
     */
    public void logResult() {
        resTime = resTime * 1000;
        int b = (int) Math.round(resTime);
        resTime = (double) b / 1000;
        double averageTime = resTime / countTESTS;
        averageTime = averageTime * 1000;
        int i = (int) Math.round(averageTime);
        averageTime = (double) i / 1000;
        try (FileWriter writer = new FileWriter(".//result.txt")) {
            writer.write(resultOpen);
            writer.write(resultTitle);
            writer.write(resultSource);
            writer.write(resultLinkByName);
            writer.write(resultLinkByHref);
            writer.write("Total tests: " + countTESTS + "\n");
            writer.write("Passed/Failed: " + PASSED_TEST + "/" + FAILED_TEST + "\n");
            writer.write("Total time: " + resTime + "\n");
            writer.write("Average time: " + averageTime + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}