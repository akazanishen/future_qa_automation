package home_tasks.mkushnirenko.hw8.pages;

import com.codeborne.selenide.SelenideElement;
import home_tasks.mkushnirenko.hw8.page_objects.Home_PO;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class Home extends Home_PO {
    Logger log = Logger.getLogger("Home");

    public String getEmail() {
        String mail = contactEmail.getText();
        log.info(() -> format("email: '%s'", mail));
        return mail.split(" ")[1];
    }

    public List<String> getCategories() {
        List<String> categoriesNames = categories.stream()
                .map(SelenideElement::getText)
                .collect(Collectors.toList());
        log.info(() -> format("categories names: '%s'", categoriesNames));
        return categoriesNames;
    }
}
