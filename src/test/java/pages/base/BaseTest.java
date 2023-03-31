package pages.base;

import driver.Driver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver = Driver.initDriver();

    @BeforeAll
    public static void waitDownload() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterAll
    public static void close() {
        driver.quit();
    }
}
