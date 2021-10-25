package home_tasks.diana.hw6;


import home_tasks.diana.hw6.pages.HomePage;
import home_tasks.diana.hw6.pages.ModalWindow;
import org.testng.annotations.Test;

public class TestDiana extends Config {

    HomePage homePage = new HomePage();
    ModalWindow modalWindow = new ModalWindow();

    @org.testng.annotations.Test
    public void verifyRegistration() {

        homePage.clickLoginBtn();
        modalWindow.switchToSignUp();
        modalWindow.enterEmail();
        modalWindow.enterPassword();
        modalWindow.enterPasswordConf();
        modalWindow.clickCreateBtn();
        homePage.verifyUserSignedUp();
    }

}
