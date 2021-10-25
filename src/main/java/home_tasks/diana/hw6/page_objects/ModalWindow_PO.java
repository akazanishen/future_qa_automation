package home_tasks.diana.hw6.page_objects;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class ModalWindow_PO {

    protected SelenideElement createAccountLink = $x(".//a[contains(@class,'create-account-link')]");
    protected SelenideElement emailInput = $x(".//input[@id='login']");
    protected SelenideElement passwordInput = $x(".//input[@id='password']");
    protected SelenideElement passwordConfInput = $x(".//input[@id='password-conf']");
    protected SelenideElement createBtn = $x(".//span[text()='Create']//parent::button[1]");

}
