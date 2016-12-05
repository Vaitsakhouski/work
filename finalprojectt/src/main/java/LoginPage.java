import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Methods, for testing site
 *
 * @created by Vaitsakhouski Raman
 */
public class LoginPage {
    private static final String LOGIN_PAGE_URL = "http://localhost:8888/wp-login.php";
    private static final String LOG_OUT = "http://localhost:8888/wp-login.php?action=logout&_wpnonce=086a85469c";
    private static final By USERNAME_INPUT = By.name("log");
    private static final By PASSWORD_INPUT = By.name("pwd");
    private static final By SIGN_IN_BUTTON = By.name("wp-submit");
    private WebDriver driver;

    /**
     * open window on max size
     *
     * @param driver - driver
     */
    public LoginPage(WebDriver driver) {
        driver.manage().window().maximize();
        this.driver = driver;
    }

    /**
     * open page with fields:Log and pass
     */
    public LoginPage open() {
        driver.get(LOGIN_PAGE_URL);
        return this;
    }

    /**
     * login on the site
     *
     * @param username - string type, name of user
     * @param password - string type, password of user
     */
    public HomePage loginAs(String username, String password) {
        driver.findElement(USERNAME_INPUT)
                .sendKeys(username);
        driver.findElement(PASSWORD_INPUT)
                .sendKeys(password);
        driver.findElement(SIGN_IN_BUTTON)
                .click();
        return new HomePage(driver);
    }

    /**
     * segue to the main page
     */
    public HomePage goToMainPage() {
        driver.findElement(By.id("wp-admin-bar-site-name")).findElement(By.className("ab-item")).click();
        return new HomePage(driver);
    }

    /**
     * find field "search" and write
     * text, which want to find
     */
    public HomePage searchTopic() {
        WebElement element = driver.findElement(By.name("s"));
        element.sendKeys("Hello");
        element.submit();
        driver.findElement(By.xpath("//a[@href='http://localhost:8888/?p=1']")).click();
        return new HomePage(driver);
    }

    /**
     * adding comment in topic
     *
     * @param text - string type, comment's text
     */
    public HomePage addComment(String text) {
        text = "Comment";
        driver.findElement(By.xpath("//*[@id='comment']")).sendKeys(text);
        WebElement element1 = driver.findElement(By.name("submit"));
        element1.submit();
        return new HomePage(driver);
    }

    /**
     * adding comment on comment
     *
     * @param text - string type, coment's text
     */
    public HomePage addCommentOnComment(String text) {
        text = "Еще немного доработать-и будет неплохо";
        driver.get("http://localhost:8888/?p=1&replytocom=1#respond");
        driver.findElement(By.xpath("//*[@id='comment']")).sendKeys(text);
        WebElement element2 = driver.findElement(By.name("submit"));
        element2.submit();
        return new HomePage(driver);
    }

    /**
     * log out from site
     */
    public LoginPage logOut() {
        driver.get(LOG_OUT);
        driver.findElement(By.linkText("log out")).click();
        return this;
    }

    /**
     * suggest post at the site
     */
    public HomePage suggestPost() {
        driver.get("http://localhost:8888/wp-admin/post-new.php");
        driver.findElement(By.name("post_title")).sendKeys("Величайший");
        driver.findElement(By.id("content_ifr")).sendKeys("Необходимая информация");
        driver.findElement(By.id("publish")).click();
        return new HomePage(driver);
    }

    /**
     * confirm post,which was suggest
     */
    public HomePage confirmationPost() {
        driver.get("http://localhost:8888/wp-admin/edit.php?post_type=post");
        driver.findElement(By.xpath("//a[@href='http://localhost:8888/wp-admin/post.php?post=125&action=edit']")).click();
        driver.findElement(By.linkText("Take over")).click();
        driver.findElement(By.id("publish")).click();
        return new HomePage(driver);
    }

    /**
     * adding topic by author
     */
    public HomePage byAthor() {
        driver.get("http://localhost:8888/wp-admin/post-new.php");
        driver.findElement(By.name("post_title")).sendKeys("Все про Босса и Пимпа");
        driver.findElement(By.id("content_ifr")).sendKeys(" Они лучшие друзья");
        driver.findElement(By.id("publish")).click();
        return new HomePage(driver);
    }
}