package home_tasks.diana.hw8;


import home_tasks.diana.hw6.pages.HomePage;
import home_tasks.diana.hw6.Config;
import home_tasks.diana.hw6.pages.ModalWindow;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class Task1and2 extends Config {

    HomePage homePage = new HomePage();
    ModalWindow modalWindow = new ModalWindow();

    @Test
    public void verifyEmailAfterRegistration() {

        homePage.clickLoginBtn();
        modalWindow.switchToSignUp();
        modalWindow.enterEmail();
        modalWindow.enterPassword();
        modalWindow.enterPasswordConf();
        modalWindow.clickCreateBtn();
        homePage.verifyUserSignedUp();
        homePage.verifyEmailMatchPattern();
    }

    @Test
    public void verifyDropDownOptions() {
        homePage.clickLoginBtn();
        modalWindow.switchToSignUp();
        modalWindow.enterEmail();
        modalWindow.enterPassword();
        modalWindow.enterPasswordConf();
        modalWindow.clickCreateBtn();
        homePage.verifyUserSignedUp();
        List<String> expectedDropdownOptions = Arrays.asList(
                "Messages", "Details", "Orders list", "Log out");
        homePage.verifyDropDownOptions(expectedDropdownOptions);
    }

}
