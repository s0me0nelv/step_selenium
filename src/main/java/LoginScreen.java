import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.log.Log;

public class LoginScreen {
    WebDriver driver;
    private By loginInput = By.name("username");
    private By passInput = By.name("password");
    private By enter = By.xpath("//button[@type='submit']");

    public LoginScreen(WebDriver driver) {
        this.driver = driver;
    }


//    WebElement loginInput = driver.findElement(By.name("username"));
//    WebElement passInput = driver.findElement(By.xpath("//input[@name='password']"));
//    WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));

    public void getToUrl(String url) {
        driver.get(url);
    }

    public void clearLoginDetails() {
        driver.findElement(loginInput).clear();
        driver.findElement(passInput).clear();
    }

    public void login(String login, String pass) {
        driver.findElement(loginInput).sendKeys(login);
        driver.findElement(passInput).sendKeys(pass);
        driver.findElement(enter).click();
    }

    public void quitBrowser() {
        driver.quit();
    }

}
