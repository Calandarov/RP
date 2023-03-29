package pages.forms;


import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeFormTest {
    WebDriver driver;
    public static final String URL = "http://85.192.34.140:8081";
    protected By app = By.id("app");
    protected By firstName = By.id("firstName");
    protected By lastName = By.id("lastName");
    protected By email = By.id("userEmail");
    protected By btn = By.className("btn.btn-primary");

    public void initDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", "/Users/dmitrijkalandarov/documents/programming/chromedriver/chromedriver");
//    System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver");
        driver = new ChromeDriver(options);
    }

//    public void openPage(String url) {
//        driver.get(url);
//    }

    @Test
    public void validInput() {
        initDriver();
        driver.get(URL);
        driver.findElement(app).click();
//        driver.findElement(firstName).sendKeys("Name");
//        driver.findElement(lastName).sendKeys("Last Name");
//        driver.findElement(email).sendKeys("test@test.com");
//        driver.findElement(btn).click();
        driver.quit();
    }
}
