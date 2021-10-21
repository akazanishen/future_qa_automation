package lessons.l6.pages;

import com.codeborne.selenide.Condition;
import lessons.l6.page_objects.HomePage_PO;

import java.time.Duration;

public class HomePage extends HomePage_PO {

    public void verifyLogoIsVisible() {
        pageLogo.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldHave(Condition.attribute("alt", "новини"));
    }

    public void clickNewsSection(String sectionName) {
        newsContainer.findBy(Condition.text(sectionName)).shouldBe(Condition.visible).click();
    }
}
