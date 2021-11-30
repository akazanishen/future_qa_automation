package lessons.l6.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lessons.l6.page_objects.HomePage_PO;
import org.apache.log4j.Logger;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static java.lang.String.format;

public class HomePage extends HomePage_PO {

    Logger log = Logger.getLogger("Home page");

    public void verifyLogoIsVisible() {
        pageLogo.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldHave(Condition.attribute("alt", "новини"));
        log.info("logo is visible");
    }

    public void clickNewsSection(String sectionName) {
        getNewsSectionByName(sectionName).$x(newsContainerLink).shouldBe(Condition.visible).click();
        log.info(format("section '%s' clicked", sectionName));
    }

    public List<String> getSectionItemTimestamps(String sectionName) {
        List<String> actualNews = getNewsSectionByName(sectionName).$$x(newsContainerItemTime).texts();
        log.info(String.format("collected timestamps for '%s' news section %s", sectionName, actualNews));
        return actualNews;
    }

    private SelenideElement getNewsSectionByName(String sectionName) {
        return $$x(newsContainer).findBy(Condition.text(sectionName)).shouldBe(Condition.visible);
    }
}
