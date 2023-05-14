package objects.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/ru/subscriptions']")
    private WebElement test;

    public WebElement getTest() {
        return test;
    }

    public void setTest(WebElement test) {
        this.test = test;
    }
}
