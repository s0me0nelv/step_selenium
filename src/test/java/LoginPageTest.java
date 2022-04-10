import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    String driverPath = "C:\\Program Files\\JetBrains\\chromedriver.exe";
    WebDriver driver;
    LoginScreen loginScreen = new LoginScreen(driver);
    private static final String LOGIN_PAGE = "http://localhost:8080/";



    @Before
    public void openUrl() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(LOGIN_PAGE);
    }

    @After
    public void closeBrowser() {
        loginScreen.quitBrowser();
    }

    @Test
    public void successfulLogin() {

        loginScreen.clearLoginDetails();
        loginScreen.login("admin", "init");

    }


}
