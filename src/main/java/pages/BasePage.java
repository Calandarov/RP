package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", "/Users/dmitrijkalandarov/documents/programming/chromedriver/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver");
        this.driver = driver;

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void getTitle() {
        driver.getTitle();
    }

    public void closePage() {
        driver.quit();
    }
}
