import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainScreen {

    WebDriver driver = new ChromeDriver();

    WebElement plans = driver.findElement(By.name("//input[@name='username']"));
    WebElement keywords = driver.findElement(By.xpath("//input[@name='password']"));
    WebElement parameters = driver.findElement(By.xpath("//button[@type='submit']"));
    WebElement executions = driver.findElement(By.xpath("//button[@type='submit']"));
    WebElement scheduler = driver.findElement(By.xpath("//button[@type='submit']"));
    WebElement grid = driver.findElement(By.xpath("//button[@type='submit']"));
    WebElement admin = driver.findElement(By.xpath("//button[@type='submit']"));

}
