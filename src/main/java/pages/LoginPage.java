package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "passp-field-login")
    private WebElement loginField;

    @FindBy(id = "passp-field-passwd")
    private WebElement passwdField;

    @FindBy(id = "passp:sign-in")
    private WebElement signInBtn;


}
