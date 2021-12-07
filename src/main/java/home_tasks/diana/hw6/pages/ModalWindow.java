package home_tasks.diana.hw6.pages;

import static home_tasks.diana.hw6.Config.generateUniqueEmail;

import home_tasks.diana.hw6.page_objects.ModalWindow_PO;
import org.apache.log4j.Logger;

public class ModalWindow extends ModalWindow_PO {

    Logger log = Logger.getLogger("Modal Window");

    public void switchToSignUp() {
        createAccountLink.click();
    }

    final String email = generateUniqueEmail();

    public void enterEmail() {
        emailInput.setValue(email);
        log.info(String.format("email %s has been entered",
                email));
    }

    public void enterPassword() {
        passwordInput.setValue("Passw0rd");
    }

    public void enterPasswordConf() {
        passwordConfInput.setValue("Passw0rd");
    }

    public void clickCreateBtn() {
        createBtn.click();
    }
}
