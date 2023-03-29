package pages.base;

import driver.Driver;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver = Driver.initDriver();

    @AfterAll
    public static void close() {
        driver.quit();
    }
}
