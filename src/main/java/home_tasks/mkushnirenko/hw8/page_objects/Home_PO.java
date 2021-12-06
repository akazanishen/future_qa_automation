package home_tasks.mkushnirenko.hw8.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$x;


public class Home_PO {

    protected SelenideElement contactEmail = $x("//div[@class='caption']/p[contains(text(), 'Email')]");
    protected ElementsCollection categories = $$x("//div[@class='list-group']/a[@id='itemc']");
}
