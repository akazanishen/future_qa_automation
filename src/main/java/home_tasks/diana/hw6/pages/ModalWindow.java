package home_tasks.diana.hw6.pages;

import static home_tasks.diana.hw6.Config.generateUniqueEmail;

import home_tasks.diana.hw6.page_objects.ModalWindow_PO;

public class ModalWindow extends ModalWindow_PO {

    public void switchToSignUp() {
        createAccountLink.click();
    }

    public void enterEmail() {
        emailInput.setValue(generateUniqueEmail());
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
