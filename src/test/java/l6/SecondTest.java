package l6;

import lessons.l6.Config;
import lessons.l6.pages.HomePage;
import lessons.l6.pages.NewsPage;
import lessons.l6.pages.NewsSidebar;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import java.util.Arrays;
import java.util.List;

import static org.unitils.reflectionassert.ReflectionAssert.assertLenientEquals;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;
import static org.unitils.reflectionassert.ReflectionComparatorMode.IGNORE_DEFAULTS;
import static org.unitils.reflectionassert.ReflectionComparatorMode.LENIENT_ORDER;

public class SecondTest extends Config {

    HomePage homePage = new HomePage();
    NewsPage newsPage = new NewsPage();
    NewsSidebar newsSidebar = new NewsSidebar();
    SoftAssertions softAssert = new SoftAssertions();


    @Test
    public void verifySearchInput() {

        homePage.verifyLogoIsVisible();
        homePage.clickNewsSection("Головне");

        newsPage.verifyTitle("Головні події України та світу");
        newsPage.searchForNews("футбол");
        newsPage.verifyTitle("футбол");

    }

    @Test
    public void verifyNewsSidebar() {
        homePage.verifyLogoIsVisible();

        homePage.clickNewsSection("Головне");
        newsPage.verifyTitle("Головні події України та світу");
        List<String> actualCategories = newsSidebar.getCategoriesContainer();

        List<String> expected = Arrays.asList(
                "В регіоні",
                "Головне",
                "Політика",
                "Lifestyle",
                "Економіка",
                "Відео",
                "Події",
                "Суспільство",
                "Фоторепортаж",
                "COVID-19",
                "Курйози",
                "Технології",
                "За кордоном",
                "Наука",
                "Шоу-бізнес",
                "Авто",
                "Здоров’я",
                "Спорт");
        assertLenientEquals(expected, actualCategories);
//        assertReflectionEquals(expected, actualCategories, LENIENT_ORDER);


    }

    @Test
    public void softAssertTestVariant1() {
        homePage.verifyLogoIsVisible();

        List<String> actualResult = homePage.getSectionItemTimestamps("Політика");

        softAssert.assertThat(actualResult.get(0)).matches("^\\d{2}:\\d{3}$"); // этот ассерт фейлится, но тест идет дальше
        for (String item : actualResult) {
            softAssert.assertThat(item).matches("^\\d{2}:\\d{2}$");
        }
        System.out.println("Эта строчка выполняется несмотря на фейл ассерта");
        softAssert.assertAll(); // тут все фейлы собираются и если они есть, тест прекратит работу
        System.out.println("Эта строчка не выполняется");

    }

    @Test
    public void softAssertTestVariant2() {
        homePage.verifyLogoIsVisible();

        List<String> actualResult = homePage.getSectionItemTimestamps("Політика");

        //Variant 1
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(actualResult.get(0)).matches("^\\d{2}:\\d{3}$");
            System.out.println("First assert passed");
            actualResult.forEach(item -> softly.assertThat(item).matches("^\\d{2}:\\d{2}$"));
            System.out.println("Second ");
        });
        System.out.println("we shouldn't see this");
    }

}
