package lessons.l6.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NewsPage_PO {

    protected SelenideElement pageTitle = $x("//div[@id='update-feed']/following-sibling::h2");
    protected SelenideElement searchInput = $x("//input[@id='search-input']");
    protected SelenideElement searchSubmit = $x("//input[@id='search-input']/../following-sibling::div/input");
}
