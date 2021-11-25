package lessons.l6.page_objects;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class NewsSidebarPO {

    protected ElementsCollection newsCategoriesContainer = $$x("//ul/li[contains(@class,'n-m_li')]/a");
}
