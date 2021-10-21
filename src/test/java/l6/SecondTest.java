package l6;

import lessons.l6.Config;
import lessons.l6.pages.HomePage;
import lessons.l6.pages.NewsPage;
import org.testng.annotations.Test;

public class SecondTest extends Config {

    HomePage homePage = new HomePage();
    NewsPage newsPage = new NewsPage();

    @Test
    public void verifySearchInput() {

        homePage.verifyLogoIsVisible();
        homePage.clickNewsSection("Головне");

        newsPage.verifyTitle("Головні події України та світу");
        newsPage.searchForNews("футбол");
        newsPage.verifyTitle("футбол");

    }

}
