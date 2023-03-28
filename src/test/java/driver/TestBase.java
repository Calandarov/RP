package driver;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    @BeforeAll
    public static void beforeAll() {
        ChromeOptions options = new DriverOptions().setOptions();
        Driver driver = new Driver(options);
    }
}
