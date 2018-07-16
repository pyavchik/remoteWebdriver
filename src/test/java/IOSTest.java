import io.appium.java_client.remote.MobileCapabilityType;
import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class IOSTest {
    private TrueAutomationDriver driver;
    private By loginBtn = By.cssSelector(ta("loginBtn", "a.login-btn"));
    private By signupBtn = By.cssSelector(ta("signupBtn", "div.sign-up-container > a"));
    private By emailFl = By.name(ta("emailFl", "email"));

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X (11.4)");
        capabilities.setCapability(MobileCapabilityType.UDID, "1DA711FE-C66B-4538-9147-10852CF5F1ED");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");

        driver = new TrueAutomationDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://trueautomation.io");

        WebElement myDynamicElementLoginBtn = (new WebDriverWait(driver, 18)).until(ExpectedConditions.presenceOfElementLocated(loginBtn));
        driver.findElement(loginBtn).click();

        WebElement myDynamicElementSignupBtn = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(signupBtn));
        driver.findElement(signupBtn).click();

        WebElement myDynamicElementEmailFl = (new WebDriverWait(driver, 8)).until(ExpectedConditions.presenceOfElementLocated(emailFl));
        driver.findElement(emailFl).sendKeys("your@mail.com");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
