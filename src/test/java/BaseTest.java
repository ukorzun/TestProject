import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterClass
    public static void cleanUpEnvironment() {
        driver.quit();
    }
}

