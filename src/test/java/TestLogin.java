import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.dashboard.LoginPageSteps;
import steps.dashboard.SlideShowsSteps;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TestLogin extends BaseTest{


    @Test()
    public void testPositiveLogin(){
        LoginPageSteps loginPageSteps = new LoginPageSteps(driver);
        loginPageSteps.goToSmartsLides();
        loginPageSteps.enterEmailAddressFromConfProperties(ConfProperties.getProperty("login"));
        loginPageSteps.clickContinueButton();
        loginPageSteps.enterPasswordFromConfProperties(ConfProperties.getProperty("password"));
        SlideShowsSteps slideShowsSteps = loginPageSteps.clickLoginInButton();
        assertThat(slideShowsSteps.getHeader(),containsString("Slideshows"));

    }



}
