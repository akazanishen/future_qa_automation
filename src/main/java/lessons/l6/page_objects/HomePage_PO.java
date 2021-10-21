package lessons.l6.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage_PO {

    protected SelenideElement pageLogo = $x("//section[@class='header__logo']/a/img");
    protected ElementsCollection newsContainer = $$x("//section[@class='feed__section']/h2/a");

}
