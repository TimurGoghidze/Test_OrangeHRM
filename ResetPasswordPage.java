

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static junit.framework.TestCase.assertTrue;

public class ResetPasswordPage {
    private SelenideElement resetPasswordButton = $(byCssSelector("[type='submit']"));

    public void resetPasswordButtonIsDisplayed() {
        resetPasswordButton.shouldBe(visible);
    }

    public void urlIsCorrect() {

//        WebDriverRunner.getWebDriver().getCurrentUrl();
        String currentURL = WebDriverRunner.getWebDriver().getCurrentUrl(); // проверка куска url
        assertTrue(currentURL.contains("requestPasswordResetCode"));


    }

}
