package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    protected WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "text")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='search3__button mini-suggest__button']")
    private WebElement findBtn;

    public void inputText(String text) {
        searchField.sendKeys(text);
    }

    public void clickFindBtn() {
        findBtn.click();
    }
}
