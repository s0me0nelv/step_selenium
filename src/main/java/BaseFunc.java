import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseFunc {

    public static final String WEBDRIVER_PATH = "C:\\Program Files\\JetBrains\\chromedriver.exe";
    public static final String PROPERTIES_PATH = "C:\\Users\\s0me0ne\\IdeaProjects\\step_selenium\\src\\datafile.properties";
    public WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", WEBDRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public Properties getProperties() {
        File file = new File(PROPERTIES_PATH);
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        try {
            prop.load(fileInput);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return prop;
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
