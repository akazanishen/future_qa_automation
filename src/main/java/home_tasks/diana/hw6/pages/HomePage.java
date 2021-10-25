package home_tasks.diana.hw6.pages;

import com.codeborne.selenide.Condition;
import home_tasks.diana.hw6.page_objects.HomePage_PO;

public class HomePage extends HomePage_PO {

    public void clickLoginBtn() {
        signInSignUpBtn.click();
    }

    public void verifyUserSignedUp() {
        myAccountDropdown.shouldBe(Condition.visible);
    }
}
