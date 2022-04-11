import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginScreenTest {
    private static final String AUTHENTICATION_FAILED = "Authentication failed: Invalid username/password";
    private static final String LOGIN_PAGE = "http://localhost:8080/";
    private BaseFunc baseFunc = new BaseFunc();
    private LoginScreen loginScreen = new LoginScreen(baseFunc);
    private MainScreen mainScreen = new MainScreen(baseFunc);


    @Before
    public void openUrl() {
        baseFunc.getToUrl(LOGIN_PAGE);

    }

    @After
    public void closeBrowser() {
        baseFunc.quitBrowser();
    }

    @Test
    public void checkSuccessfulLogin() {
        enterLoginDetails("admin", "init");
        assertTrue(baseFunc.getElement(mainScreen.loginDetails).isDisplayed());
    }

    @Test
    public void checkWrongPassword() {
        enterLoginDetails("admin", "initt");
        assertEquals(AUTHENTICATION_FAILED, baseFunc.getElement(loginScreen.error).getText());
    }

    @Test
    public void checkAllTabs() {
        enterLoginDetails("admin", "init");
        mainScreen.switchTab(mainScreen.plans);
        assertTrue(baseFunc.getElement(mainScreen.newPlan).isDisplayed());
        mainScreen.switchTab(mainScreen.keywords);
        assertTrue(baseFunc.getElement(mainScreen.newKeyword).isDisplayed());
    }

    private void enterLoginDetails(String login, String password) {
        loginScreen.clearLoginDetails();
        loginScreen.login(login, password);
    }
}
