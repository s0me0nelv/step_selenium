import org.openqa.selenium.By;

public class LoginScreen {
    BaseFunc baseFunc;
    private By loginInput = By.name("username");
    private By passInput = By.name("password");
    public static final String LOGIN_PAGE = "http://localhost:8080/";
    private By enter = By.xpath("//button[@type='submit']");
    By error = By.xpath("//div[text()='Authentication failed: Invalid username/password']");

    public LoginScreen(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clearLoginDetails() {
        baseFunc.getElement(loginInput).clear();
        baseFunc.getElement(passInput).clear();
    }

    public void login(String login, String pass) {
        baseFunc.getElement(loginInput).sendKeys(login);
        baseFunc.getElement(passInput).sendKeys(pass);
        baseFunc.getElement(enter).click();
    }
}
