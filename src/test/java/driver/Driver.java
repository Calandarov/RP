package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    static WebDriver driver;

    public Driver(ChromeOptions options) {
        driver = new ChromeDriver(options);
    }

    public static void clearCoockies() {
        driver.manage().deleteAllCookies();
    }
}
