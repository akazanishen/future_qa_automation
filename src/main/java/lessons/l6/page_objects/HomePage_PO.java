package lessons.l6.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage_PO {

    protected SelenideElement pageLogo = $x("//section[@class='header__logo']/a/img");
    protected String newsContainer = "//section[@class='feed__section']";
    protected String newsContainerLink = ("./h2/a");
    protected String newsContainerItemTime = ("./div/time");

}
