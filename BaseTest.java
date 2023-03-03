import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    //выводим отдельно сайт тестируемый
    public final String BASE_URL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

//
      @Before
       //открывать страницу каждый раз
        public void setUp(){
          SelenideLogger.addListener("AllureSelenide",new AllureSelenide());
            open(BASE_URL);
        }

    @After
    public void tearDown(){
        closeWebDriver();

    }
    LoginPage loginPage = new LoginPage();//
    DashboardPage dashboardPage = new DashboardPage();//
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();

}
