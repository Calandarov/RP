package pages.forms;

import org.junit.jupiter.api.Test;

import constants.Constants;
import pages.base.BaseTest;

public class PracticeFormTest extends BaseTest {
    @Test
    public void validInput() {
        driver.get(Constants.URL);

        driver.findElement(PracticeFormSelectors.FORM).click();
        driver.findElement(PracticeFormSelectors.TITLE).click();
        driver.findElement(PracticeFormSelectors.FIRST_NAME).sendKeys(PracticeFormData.USER_FIRST_NAME);
        driver.findElement(PracticeFormSelectors.LAST_NAME).sendKeys(PracticeFormData.USER_LAST_NAME);
        driver.findElement(PracticeFormSelectors.EMAIL).sendKeys(PracticeFormData.USER_EMAIL);
        driver.findElement(PracticeFormSelectors.SUBMIT_BTN).click();
    }
}
