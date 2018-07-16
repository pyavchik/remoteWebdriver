import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class EdgeTest {
    private WebDriver driver;
    private By loginBtn = By.cssSelector(ta("loginBtn", "a.login-btn"));
    private By signupBtn = By.cssSelector(ta("signupBtn", "div.sign-up-container > a"));
    private By emailFl = By.name(ta("emailFl", "email"));

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        driver = new TrueAutomationDriver(new URL("http://localhost:17556"), new DesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() {
        driver.get("https://trueautomation.io");

        (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(loginBtn));
        driver.findElement(loginBtn).click();

        (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(signupBtn));
        driver.findElement(signupBtn).click();

        (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(emailFl));
        driver.findElement(emailFl).sendKeys("your@mail.com");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}