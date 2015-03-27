import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import static org.testng.Assert.*;

public class GitHubLoginPage {

    private WebDriver driver;

    @FindBy(id = "login_field")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "commit")
    private WebElement commit;

    public GitHubLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void SignUp(String log, String pass) {
        login.sendKeys(log);
        password.sendKeys(pass);
        commit.click();
    }

}
