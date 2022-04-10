import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunc {

    public WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void getToUrl(String url) {
        driver.get(url);
    }

    public void quitBrowser() {
        driver.quit();
    }

}
