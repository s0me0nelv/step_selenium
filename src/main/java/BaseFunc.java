import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseFunc {

    public WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void getToUrl(String url) {
        driver.get(url);
    }

    public WebElement getElement(By locator) {

        return driver.findElement(locator);

    }

    public void quitBrowser() {
        driver.quit();
    }
}
