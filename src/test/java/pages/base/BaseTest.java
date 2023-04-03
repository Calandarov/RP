package pages.base;

import driver.Driver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;
import pages.profile.ProfilePage;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver = Driver.initDriver();

    public LoginPage loginPage = new LoginPage(driver);
    public ProfilePage profilePage = new ProfilePage(driver);

    @BeforeAll
    public static void waitDownload() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterAll
    public static void close() {
        driver.quit();
    }
}
