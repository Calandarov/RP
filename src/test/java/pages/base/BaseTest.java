package pages.base;

import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import pages.login.LoginPage;
import pages.practice.PracticeForm;
import pages.profile.ProfilePage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver = Driver.initDriver();
    protected LoginPage loginPage = new LoginPage(driver);
    protected ProfilePage profilePage = new ProfilePage(driver);
    protected PracticeForm practiceForm = new PracticeForm(driver);

    @BeforeAll
    public static void waitDownload() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterAll
    public static void close() {
        driver.quit();
    }
}
