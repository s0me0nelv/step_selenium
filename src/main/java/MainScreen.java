import org.openqa.selenium.By;

public class MainScreen {

    BaseFunc baseFunc;
    By loginDetails = By.id("sessionDropdown");
    By plans = By.linkText("Plans");
    By newPlanBtn = By.xpath("//button[@ng-click='addPlan()']");
    By keywords = By.linkText("Keywords");
    By newKeywordBtn = By.xpath("//button[@ng-click='addFunction()']");
    By parameters = By.linkText("Parameters");
    By newParameterBtn = By.xpath("//button[@ng-click='addParameter()']");
    By executions = By.linkText("Executions");
    By executionListTab = By.xpath("//*[text()=' Execution list ']");
    By scheduler = By.linkText("Scheduler");
    By newTaskBtn = By.xpath("//button[@ng-click='addSchedulerEntry()']");
    By grid = By.linkText("Grid");
    By gridAgentsTab = By.xpath("//*[@heading='Agents']");
    By admin = By.linkText("Admin");
    By adminUsersTab = By.xpath("//button[@ng-click='addUser()']");

    public MainScreen(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void switchTab(By tabName) {
        baseFunc.getElement(tabName).click();
    }
}
