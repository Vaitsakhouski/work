import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by NotePad.by on 05.12.2016.
 */
public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;
    //System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

    @Test
    public void ANegativeLogin() throws Exception {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open().loginAs("user10", "user10");
        assert (driver.findElement(By.name("loginform")).isDisplayed());
        driver.quit();
    }

    @Test
    public void BUserLoginFindTopicAddCommentTest() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open().loginAs("user", "user");
        loginPage.goToMainPage();
        loginPage.searchTopic();
        loginPage.addComment("Comment");
        assertTrue(driver.findElement(By.id("main")).getText().contains("Comment"));
        loginPage.logOut();
        driver.quit();
    }

    @Test
    public void CUserAddCommentOnComment() throws Exception {
        driver = new ChromeDriver();
        String text = "Еще немного доработать-и будет неплохо";
        loginPage = new LoginPage(driver);
        loginPage.open().loginAs("user3", "user3");
        loginPage.goToMainPage();
        loginPage.searchTopic();
        loginPage.addCommentOnComment(text);
        loginPage.logOut();
        driver.quit();
    }

    @Test
    public void DContributorTest() throws Exception {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open().loginAs("user2", "user2");
        loginPage.suggestPost();
        driver.manage()
                .timeouts()
                .implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void EConfirmationPost() throws Exception {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open().loginAs("Editor", "editor");
        loginPage.confirmationPost();
        driver.manage()
                .timeouts()
                .implicitlyWait(2, TimeUnit.SECONDS);
        loginPage.goToMainPage();
        assertTrue(driver.findElement(By.id("main")).getText().contains("Величайший"));
        loginPage.logOut();
        driver.quit();
    }

    @Test
    public void FAddingNewsByAuthor() throws Exception {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open().loginAs("author", "author");
        loginPage.byAthor();
        driver.manage()
                .timeouts()
                .implicitlyWait(2, TimeUnit.SECONDS);
        loginPage.goToMainPage();
        loginPage.logOut();
        driver.quit();
    }

}