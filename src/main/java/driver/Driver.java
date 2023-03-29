package driver;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    public static WebDriver driver;
    static ChromeOptions options = new ChromeOptions();
    public static ChromeOptions setOptions() {
        options.addArguments("--remote-allow-origins=*");

        return options;
    }
    public static WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", Constants.MAC_PATH);
        driver = new ChromeDriver(setOptions());

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        return driver;
    }
}
