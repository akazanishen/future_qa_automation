package lessons.l6.pages;

import com.codeborne.selenide.Condition;
import lessons.l6.page_objects.NewsPage_PO;
import org.apache.log4j.Logger;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

public class NewsPage extends NewsPage_PO {

     Logger log = Logger.getLogger("News page");

    public void verifyTitle(String expectedText) {
        assertThat(pageTitle.shouldBe(Condition.visible).getText()).isEqualTo(expectedText);
        log.info(format("title '%s' is visible ", expectedText));
    }

    public void searchForNews(String certainNews) {
        searchInput.setValue(certainNews);
        searchSubmit.click();
        log.info(format("searched for '%s' news", certainNews));
    }

}
