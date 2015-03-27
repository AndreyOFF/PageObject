import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GitHubTest {

    private String login;
    private String password;
    private String repository;
    private String URL;
    private WebDriver driver;

    @BeforeTest
    public void Init() {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\chromedriver.exe");
        this.login = "BreakingMad";
        this.password = "hunterx27";
        this.repository = "Repository";
        this.URL = "https://github.com/login";
        this.driver = new ChromeDriver();
    }

    @Test
    public void SignUp() {
        this.driver.get(this.URL);
        GitHubLoginPage page = new GitHubLoginPage(this.driver);
        page.SignUp(this.login, this.password);
        assertEquals(this.driver.getCurrentUrl(), "https://github.com/");
    }



}