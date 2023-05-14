package objects.dashboard.smartsLides;

import objects.dashboard.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SlideShowsPage extends BasePage {


    public SlideShowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//header[h1]")
    private WebElement headerSlideShows;


    public WebElement getHeaderSlideShows() {
        return headerSlideShows;
    }

    public void setHeaderSlideShows(WebElement headerSlideShows) {
        this.headerSlideShows = headerSlideShows;
    }
}
