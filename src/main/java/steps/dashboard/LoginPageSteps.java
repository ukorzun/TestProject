package steps.dashboard;

import objects.dashboard.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageSteps extends BasePageSteps {

    private LoginPage loginPage;

    public LoginPageSteps(WebDriver driver) {
        super(driver);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }



    //@Steps
    public void goToSmartsLides() {
        //TestLogger.logInfo();
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLoginButton())).click();
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLinkSmartsLides())).click();
    }


    //@Steps
    public void enterEmailAddressFromConfProperties(String email) {
        //TestLogger.logInfo("Enter your email address");
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInputEmail())).sendKeys(email);
    }

    //@Steps
    public void enterPasswordFromConfProperties(String password) {
        //TestLogger.logInfo("Enter your password");
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInputPassword())).sendKeys(password);
    }


    //@Steps
    public SlideShowsSteps clickLoginInButton() {
        //TestLogger.logInfo("Click Login Button");
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLogInButton())).click();
        return new SlideShowsSteps(driver);
    }



    public void clickContinueButton() {
        //TestLogger.logInfo("Enter your email address");
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.getContinueButton())).click();
    }


}
