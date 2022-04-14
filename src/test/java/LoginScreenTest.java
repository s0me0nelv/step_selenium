import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;


public class LoginScreenTest {

    private static final String AUTHENTICATION_FAILED = "Authentication failed: Invalid username/password";
    public static final String ADMIN_LOGIN_NAME = "admin [admin]";
    private BaseFunc baseFunc = new BaseFunc();
    private LoginScreen loginScreen = new LoginScreen(baseFunc);
    private MainScreen mainScreen = new MainScreen(baseFunc);




    @Before
    public void openUrl() {
        baseFunc.getToUrl(LoginScreen.LOGIN_PAGE);

    }

    @After
    public void closeBrowser() {
        baseFunc.quitBrowser();
    }

    @Test
    public void checkSuccessfulLogin() {
        enterLoginDetails(baseFunc.getProperties().getProperty("username"), baseFunc.getProperties().getProperty("password"));
        assertEquals(ADMIN_LOGIN_NAME, baseFunc.getElement(mainScreen.loginDetails).getText());
    }

    @Test
    public void checkWrongPassword() {
        enterLoginDetails(baseFunc.getProperties().getProperty("username"), "abc");
        assertEquals(AUTHENTICATION_FAILED, baseFunc.getElement(loginScreen.error).getText());
    }

    public void enterLoginDetails(String login, String password) {
        loginScreen.clearLoginDetails();
        loginScreen.login(login, password);
    }
}
