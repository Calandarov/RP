package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "passp-field-login")
    private WebElement loginField;

    @FindBy(id = "passp-field-passwd")
    private WebElement passwdField;

    @FindBy(id = "passp:sign-in")
    private WebElement signInBtn;

    @FindBy(xpath = "//div[@class='usermenu-redesign__user-name']")
    private WebElement userName;

    public void openPage(String url) {
        driver.get(url);
    }

    public boolean atPage() {
        if(getUserName().equals("test2023user")) {
            return true;
        } else {
            return false;
        }
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPasswd(String pass) {
        passwdField.sendKeys(pass);
    }

    public void clickSignInBtn() {
        signInBtn.click();
    }

    public String getUserName() {
        return userName.getText();
    }
}
