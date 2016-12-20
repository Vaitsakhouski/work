import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;

public class LoginPageTest {

    private static final By USERNAME_INPUT = By.name("log");
    private static final By PASSWORD_INPUT = By.name("pwd");
    private WebDriver driver = new ChromeDriver();
    private LoginPage loginPage;
    //System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

    @BeforeMethod
    public void setUp() {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        loginPage.open();
        driver.findElement(USERNAME_INPUT).clear();
        driver.findElement(PASSWORD_INPUT).clear();
    }

    @BeforeGroups(groups = "two")
    public void before() {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        loginPage.open();
    }

    @Test
    public void ANegativeLogin() throws Exception {
        loginPage.loginAs("user10", "user10");
        assertTrue(driver.findElement(By.id("login")).getText().contains("ERROR: Invalid username."));
    }

    @Test
    public void BUserLoginFindTopicAddCommentTest() throws Exception {
        loginPage.loginAs("user", "user");
        loginPage.goToMainPage();
        loginPage.searchTopic();
        loginPage.addComment("Comment");
        assertTrue(driver.findElement(By.id("main")).getText().contains("Comment"));
        loginPage.logOut();
    }

    @Test
    public void CUserAddCommentOnComment() throws Exception {
        String text = "Еще немного доработать-и будет неплохо";
        loginPage.loginAs("user3", "user3");
        loginPage.goToMainPage();
        loginPage.searchTopic();
        loginPage.addCommentOnComment(text);
    }

    @Test
    public void DContributorTest() throws Exception {
        loginPage.loginAs("user2", "user2");
        loginPage.suggestPost();
        loginPage.goToMainPage();
    }

    @Test
    public void EConfirmationPost() throws Exception {
        loginPage.loginAs("Editor", "editor");
        loginPage.confirmationPost();
        loginPage.goToMainPage();
        assertTrue(driver.findElement(By.id("main")).getText().contains("Величайший"));
    }

    @Test
    public void FAddingNewsByAuthor() throws Exception {
        loginPage.loginAs("author", "author");
        loginPage.byAthor();
        loginPage.goToMainPage();
    }

    @Test(groups = "two")
    public void GLostPasswordInvalidEmail() throws Exception {
        loginPage.lostPassword("NotEmail");
        assertTrue(driver.findElement(By.id("login")).getText().contains("ERROR: Invalid username or email"));
    }

    @Test(groups = "two")
    public void HLostPasswordBackToLogIn() throws Exception {
        loginPage.lostPassword("OneMore");
        driver.findElement(By.xpath("//a[@href='http://localhost:8888/wp-login.php']")).click();
        assertTrue(driver.findElement(By.id("login")).getText().contains("Username or Email"));
    }
}