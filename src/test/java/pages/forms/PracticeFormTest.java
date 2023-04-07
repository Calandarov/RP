package pages.forms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.base.BaseTest;
import pages.practice.PracticeFormData;

public class PracticeFormTest extends BaseTest {
    @Test
    public void validInput() throws InterruptedException {
        practiceForm.open(PracticeFormData.URL);
        Assertions.assertTrue(practiceForm.atPage());
        practiceForm.inputFirstName(PracticeFormData.FIRST_NAME);
        practiceForm.inputLastName(PracticeFormData.LAST_NAME);
        practiceForm.inputEmail(PracticeFormData.EMAIL);
        practiceForm.setGenderCheckbox();
        practiceForm.inputMobile(PracticeFormData.MOBILE);
        practiceForm.setHobbiesCheckbox();
        practiceForm.inputAddress(PracticeFormData.ADDRESS);
        practiceForm.clickSubmitBtn();
        Assertions.assertEquals(PracticeFormData.EXPECTED_MODAL_TITLE, practiceForm.getModalTitle());
//        Thread.sleep(1000);
    }
}
