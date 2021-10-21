package lessons.l6;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Config {

    @BeforeMethod
    public void openHomePage() {
        Selenide.open("https://www.ukr.net/");
    }

    @AfterMethod
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

}
