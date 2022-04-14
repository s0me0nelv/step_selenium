import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainScreenTest {

    private BaseFunc baseFunc = new BaseFunc();
    private LoginScreen loginScreen = new LoginScreen(baseFunc);
    private MainScreen mainScreen = new MainScreen(baseFunc);

    @Before
    public void openUrl() {
        baseFunc.getToUrl(loginScreen.LOGIN_PAGE);
    }

    @After
    public void closeBrowser() {
        baseFunc.quitBrowser();
    }

    @Test //all in one test to save time and not to open separate entity each time and make same steps
    public void checkTabsSwitching() {
        loginScreen.clearLoginDetails();
        loginScreen.login(baseFunc.getProperties().getProperty("username"), baseFunc.getProperties().getProperty("password"));
        mainScreen.switchTab(mainScreen.plans);
        assertTrue(baseFunc.getElement(mainScreen.newPlanBtn).isDisplayed());
        mainScreen.switchTab(mainScreen.keywords);
        assertTrue(baseFunc.getElement(mainScreen.newKeywordBtn).isDisplayed());
        mainScreen.switchTab(mainScreen.parameters);
        assertTrue(baseFunc.getElement(mainScreen.newParameterBtn).isDisplayed());
        mainScreen.switchTab(mainScreen.executions);
        assertTrue(baseFunc.getElement(mainScreen.executionListTab).isDisplayed());
        mainScreen.switchTab(mainScreen.scheduler);
        assertTrue(baseFunc.getElement(mainScreen.newTaskBtn).isDisplayed());
        mainScreen.switchTab(mainScreen.grid);
        assertTrue(baseFunc.getElement(mainScreen.gridAgentsTab).isDisplayed());
        mainScreen.switchTab(mainScreen.admin);
        assertTrue(baseFunc.getElement(mainScreen.adminUsersTab).isDisplayed());
    }
}
