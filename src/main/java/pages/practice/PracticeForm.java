package pages.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {
    protected WebDriver driver;

    public PracticeForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='category-cards']/div[2]/div/div[@class='avatar mx-auto white']")
    private WebElement forms;

    @FindBy(xpath = "//div[@class='accordion']/div[2]/div[@class='element-list collapse show']")
    private WebElement practiceForm;

    @FindBy(className = "main-header")
    private WebElement mainHeader;

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "userEmail")
    private WebElement emailField;

//    @FindBy(id = "gender-radio-1")
    @FindBy(xpath = "//div[@id='genterWrapper']/div[2]/div[1]/label")
    private WebElement genderCheckbox;

    @FindBy(id = "userNumber")
    private WebElement userMobileField;

//    @FindBy(id = "hobbies-checkbox-3")
    @FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div[1]/label")
    private WebElement hobbiesCheckbox;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;

    @FindBy(id = "state")
    private WebElement stateList;

    @FindBy(id = "city")
    private WebElement cityList;

    @FindBy(id = "submit")
    private WebElement submitBtn;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement modalTitle;

    public void open(String url) {
        driver.get(url);
        forms.click();
        practiceForm.click();
    }

    public boolean atPage() {
         if(mainHeader.getText().equals(PracticeFormData.EXPECTED_MAIN_HEADER)) {
             return true;
        } else {
             return false;
        }
    }

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setGenderCheckbox() {
        genderCheckbox.click();
    }

    public void inputMobile(String mobile) {
        userMobileField.sendKeys(mobile);
    }

    public void inputAddress(String address) {
        currentAddressField.sendKeys(address);
    }

    public void setHobbiesCheckbox() {
        hobbiesCheckbox.click();
    }

    public void clickSubmitBtn() {
        submitBtn.click();
    }

    public String getModalTitle() {
        return modalTitle.getText();
    }

    public void waitElement() {

    }
}
