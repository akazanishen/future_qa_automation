package home_tasks.diana.hw6.pages;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;
import static org.unitils.reflectionassert.ReflectionComparatorMode.LENIENT_ORDER;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import home_tasks.diana.hw6.page_objects.HomePage_PO;
import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class HomePage extends HomePage_PO {

    Logger log = Logger.getLogger("Modal Window");

    public void clickLoginBtn() {
        signInSignUpBtn.click();
    }

    public void verifyUserSignedUp() {
        myAccountDropdown.shouldBe(Condition.visible);
    }

    public void verifyEmailMatchPattern() {
        myAccountDropdown.click();
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(email.getText()).matches("^[^\\s]+@[^\\s]+\\.\\w{2,3}$");
        });
    }

    public List<String> getDropdownOptions() {
        List<String> dropdownOptions = options.stream()
                .map(SelenideElement::getText)
                .collect(Collectors.toList());
        dropdownOptions.removeAll(Collections.singletonList(""));
        log.info(String.format("categories names: '%s'", dropdownOptions));
        return dropdownOptions;
    }

    public void verifyDropDownOptions() {
        myAccountDropdown.click();
        List<String> actualDropdownOptions = getDropdownOptions();

        List<String> expectedDropdownOptions = Arrays.asList(
                "Messages", "Details", "Orders list", "Log out");
        assertReflectionEquals(expectedDropdownOptions, actualDropdownOptions, LENIENT_ORDER);


    }
}
