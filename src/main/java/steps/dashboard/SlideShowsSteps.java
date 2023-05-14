package steps.dashboard;

import objects.dashboard.BasePage;
import objects.dashboard.smartsLides.SlideShowsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SlideShowsSteps extends BasePageSteps{

    SlideShowsPage slideShowsPage;

    public SlideShowsSteps(WebDriver driver) {
        super(driver);
        slideShowsPage = PageFactory.initElements(driver, SlideShowsPage.class);


    }

    public String getHeader(){
        return wait.until(ExpectedConditions.visibilityOf(slideShowsPage.getHeaderSlideShows())).getText();
    }
}
