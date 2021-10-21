package l6;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.time.Duration;

public class FirstTest {
    public static void main(String[] args) {
        Selenide.open("https://www.ukr.net/");
        Selenide.$x("//section[@class='header__logo']/a/img").shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldHave(Condition.attribute("alt", "новини"));
        Selenide.$$x("//section[@class='feed__section']/h2/a").findBy(Condition.text("Головне"))
                .shouldBe(Condition.visible).click();
        Selenide.$x("//div[@id='update-feed']/following-sibling::h2")
                .shouldHave(Condition.exactText("Головні події України та світу"));
        Selenide.$x("//input[@id='search-input']").shouldBe(Condition.visible)
                .sendKeys("футбол");
        Selenide.$x("//input[@id='search-input']/../following-sibling::div/input").click();
        Selenide.$x("//div[@id='update-feed']/following-sibling::h2")
                .shouldHave(Condition.text("футбол"));
        System.out.println("Test passed");
    }
}
