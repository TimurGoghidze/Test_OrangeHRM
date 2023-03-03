import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class SideBarTests extends BaseTest {

    @Test
    public void allItemsAreDisplayed() {
        loginPage.successLogin("Admin", "admin123");
        sleep();
        List<SelenideElement> elements = $$("#myCollection .myClass");
        checkElementsVisible(elements, Condition.visible);


    }

    private void checkElementsVisible(List<SelenideElement> elements, Condition visible) {
    }

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
