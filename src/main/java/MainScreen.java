import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainScreen {
    BaseFunc baseFunc;
     By loginDetails = By.id("sessionDropdown");
     By plans = By.linkText("Plans");
     By newPlan = By.xpath("//button[@ng-click='addPlan()']");
     By keywords = By.linkText("Keywords");
     By newKeyword = By.xpath("//button[@ng-click='addFunction()']");

     By parameters = By.linkText("Parameteres");
     By executions = By.linkText("Scheduler");
     By grid = By.linkText("Grid");
     By admin = By.linkText("Admin");

//    WebElement parameters = baseFunc.getElement(By.xpath("//button[@type='submit']"));
//    WebElement executions = baseFunc.getElement(By.xpath("//button[@type='submit']"));
//    WebElement scheduler = baseFunc.getElement(By.xpath("//button[@type='submit']"));
//    WebElement grid = baseFunc.getElement(By.xpath("//button[@type='submit']"));
//    WebElement admin = baseFunc.getElement(By.xpath("//button[@type='submit']"));

    public MainScreen(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void switchTab(By tabName) {
        baseFunc.getElement(tabName).click();
    }

}
