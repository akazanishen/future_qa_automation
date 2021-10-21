package lessons.l6.pages;

import com.codeborne.selenide.Condition;
import lessons.l6.page_objects.NewsPage_PO;

public class NewsPage extends NewsPage_PO {

    public void verifyTitle(String expectedText) {
        pageTitle.shouldBe(Condition.visible).shouldHave(Condition.text(expectedText));
    }

    public void searchForNews(String certainNews) {
        searchInput.setValue(certainNews);
        searchSubmit.click();
    }
}
