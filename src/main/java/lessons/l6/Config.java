package lessons.l6;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Config {
    private static Logger log = LoggerFactory.getLogger("Config");

    @BeforeMethod
    public void openHomePage() {
        Selenide.open("https://www.ukr.net/");
        log.info("Home page is opened");
    }

    @AfterMethod
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

}
