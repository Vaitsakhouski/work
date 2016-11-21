package Commands;

import org.openqa.selenium.WebDriver;

/**
 * opening browser
 */
public interface Instructions {

    /**
     * entity declaration
     *
     * @param driver - object
     */
    public abstract void command(WebDriver driver);
}
