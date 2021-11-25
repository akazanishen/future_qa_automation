package lessons.l6.pages;

import lessons.l6.page_objects.NewsSidebarPO;
import org.apache.log4j.Logger;

import java.util.List;

public class NewsSidebar extends NewsSidebarPO {

    final static Logger log = Logger.getLogger("News sidebar");

    public List<String> getCategoriesContainer() {
        List<String> actualNews = newsCategoriesContainer.texts();
        log.info("actual news categories " + actualNews);
        return actualNews;
    }
}
