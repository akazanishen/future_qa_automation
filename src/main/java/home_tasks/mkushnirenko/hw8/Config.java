package home_tasks.mkushnirenko.hw8;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Config {

    private static Logger log = LoggerFactory.getLogger("Config");
    public static final String MAIL_REGEX = "^\\S+@\\S+\\.\\S+$";


    @BeforeMethod
    public void openHomePage() {
        Selenide.open("https://www.demoblaze.com");
        log.info("Home page is opened");
    }

    @AfterMethod
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

}
