package driver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    @BeforeAll
    public static void beforeAll() {
        ChromeOptions options = new DriverOptions().setOptions();
        Driver driver = new Driver();
    }

    @BeforeEach
    public void beforeEach() {

    }

    @AfterAll
    public static void afterAll() {

    }

    @AfterEach
    public void afterEach() {

    }
}
