package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

//        System.setProperty("webdriver.chrome.driver", "/Users/dmitrijkalandarov/documents/programming/chromedriver/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void closePage() {
        driver.close();
    }
}
