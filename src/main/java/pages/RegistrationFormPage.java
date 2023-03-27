package pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RegistrationFormPage extends BasePage {
    public RegistrationFormPage(WebDriver driver) {
        super(driver);
    }

//    RegistrationFormPage rp = new RegistrationFormPage(WebDriver driver);
    @Test
    public void getTitle() {
        rp.openPage("http://85.192.34.140:8081/");
        rp.getTitle();
        rp.closePage();
    }
}
