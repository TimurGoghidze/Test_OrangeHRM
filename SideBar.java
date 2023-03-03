import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SideBar {

private SelenideElement searchInput = $(byCssSelector("[placeholder='Search']"));
    private ElementsCollection collection = $$(byCssSelector("a.oxd-main-menu-item.toggle"));

    public void checkElementsVisible() {
        for (SelenideElement element :
                collection) {
            try {
                element.shouldBe(Condition.visible);
            }
            catch (Exception e) {
                System.out.println("Element is not visible: " + element.toString());
                e.printStackTrace();

            }

        }
    }
}