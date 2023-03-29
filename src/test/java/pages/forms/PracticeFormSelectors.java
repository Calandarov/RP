package pages.forms;

import org.openqa.selenium.By;

public class PracticeFormSelectors {
    static final By FORM = By.xpath("//div[@class='category-cards']/div[2]");
    static final By TITLE = By.xpath("//div[@class='accordion']/div[2]/div/ul/li");
    static final By FIRST_NAME = By.id("firstName");
    static final By LAST_NAME = By.id("lastName");
    static final By EMAIL = By.id("userEmail");
    static final By SUBMIT_BTN = By.cssSelector(".btn.btn-primary");
}
