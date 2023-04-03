package pages.forms;

import config.Config;
import pages.base.BaseTest;

import org.junit.jupiter.api.Test;
import pages.practice.PracticeFormData;

public class PracticeFormTest extends BaseTest {
    @Test
    public void validInput() throws InterruptedException {
        practiceForm.open(PracticeFormData.URL);
        practiceForm.inputFirstName(PracticeFormData.FIRST_NAME);
        practiceForm.inputLastName(PracticeFormData.LAST_NAME);
        practiceForm.inputEmail(PracticeFormData.EMAIL);
        practiceForm.setGenderCheckbox();
        practiceForm.inputMobile(PracticeFormData.MOBILE);
        practiceForm.setHobbiesCheckbox();
        practiceForm.inputAddress(PracticeFormData.ADDRESS);
        practiceForm.clickSubmitBtn();
        Thread.sleep(5000);
    }
}
