package objects.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//nav//span[text()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//li//a[@href=\"https://smartslides.com/login\"]")
    private WebElement linkSmartsLides;


    @FindBy(xpath = "//input[@autocomplete='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    private WebElement continueButton;




    @FindBy(xpath = "//input[@autocomplete='current-password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//div[contains(text(),'Log In')]")
    private WebElement logInButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        this.loginButton = loginButton;
    }

    public WebElement getLinkSmartsLides() {
        return linkSmartsLides;
    }

    public void setLinkSmartsLides(WebElement linkSmartsLides) {
        this.linkSmartsLides = linkSmartsLides;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(WebElement inputEmail) {
        this.inputEmail = inputEmail;
    }


    public WebElement getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(WebElement inputPassword) {
        this.inputPassword = inputPassword;
    }


    public WebElement getLogInButton() {
        return logInButton;
    }

    public void setLogInButton(WebElement logInButton) {
        this.logInButton = logInButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public void setContinueButton(WebElement continueButton) {
        this.continueButton = continueButton;
    }
}
