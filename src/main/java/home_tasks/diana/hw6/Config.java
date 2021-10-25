package home_tasks.diana.hw6;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Config {

    @BeforeMethod
    public void openHomePage() {
        Selenide.open("https://demostore.x-cart.com/");
    }

    public static String generateUniqueEmail() {
        String email = "automationqa@credible.com";
        return addTimeStampToEmail(email);
    }

    private static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10000) + 1;
    }

    public static String addTimeStampToEmail(String originalEmail) {
        String timeStamp = new SimpleDateFormat("MM_dd_HHmmss")
                .format(Calendar.getInstance().getTime());
        return originalEmail.replace("@",
                String.format("+%s_%s@", timeStamp, getRandomNumber()));
    }

    @AfterMethod
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

}
