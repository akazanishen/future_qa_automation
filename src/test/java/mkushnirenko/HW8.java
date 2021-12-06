package mkushnirenko;

import home_tasks.mkushnirenko.hw8.Config;
import home_tasks.mkushnirenko.hw8.pages.Home;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.unitils.reflectionassert.ReflectionAssert.assertLenientEquals;


public class HW8 extends Config {
    private Home home = new Home();

    private SoftAssertions softAssert = new SoftAssertions();

    @Test
    public void softAssertTestEmail() {
        softAssert.assertThat(home.getEmail()).matches(MAIL_REGEX);
        softAssert.assertAll();
    }

    @Test
    public void verifyCategories() {

        List<String> actualCategories = home.getCategories();

        List<String> expected = Arrays.asList(
                "Monitors", "Laptops", "Phones");
        assertLenientEquals(expected, actualCategories);
        //assertReflectionEquals(expected, actualCategories, LENIENT_ORDER);
    }
}
