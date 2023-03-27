package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonActions {
    public static void createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", "/Users/dmitrijkalandarov/documents/programming/chromedriver/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
}
