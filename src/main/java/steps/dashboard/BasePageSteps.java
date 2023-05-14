package steps.dashboard;

import objects.dashboard.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageSteps {

    private BasePage basePage;
    protected WebDriver driver;
    public WebDriverWait wait;

    public BasePageSteps(WebDriver driver) {
        this.driver = driver;
        basePage = PageFactory.initElements(driver, BasePage.class);
        wait = new WebDriverWait(driver, 30);
    }




}
