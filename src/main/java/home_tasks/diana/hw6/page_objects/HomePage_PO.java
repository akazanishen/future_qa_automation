package home_tasks.diana.hw6.page_objects;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class HomePage_PO {

    protected SelenideElement signInSignUpBtn = $x(".//div[@class='header_bar-sign_in']//button");
    protected SelenideElement myAccountDropdown = $x(".//a[text()='My account']");
    protected SelenideElement email = $x("(.//li[@class='account-email']/span)[1]");
    protected ElementsCollection options = $$x(".//li[@class='account-email']/following-sibling::li");

}
