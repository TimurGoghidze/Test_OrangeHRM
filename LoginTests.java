

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.Test;


import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginTests extends BaseTest {
    @Test
    public void successLogin() {
        //     open(BASE_URL); перенесли в TestBase

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

        dashboardPage.dashboardPageIsOpen();
    }

    @Test
    public void elementsAreVisible() {
        //     open(BASE_URL); перенесли в TestBase

        loginPage.logoIsDisplayed();
        loginPage.logoImageIsCorrect();
        loginPage.credSectionIsDisplayed();
    }

    @Test
    public void forgotYourPasswordLink() {
        //     open(BASE_URL); перенесли в TestBase
//        LoginPage loginPage = new LoginPage(); перенесли в TestBase
        loginPage.followTheForgotPasswordLink();
        // ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
        resetPasswordPage.resetPasswordButtonIsDisplayed();
        resetPasswordPage.urlIsCorrect();
    }


}
