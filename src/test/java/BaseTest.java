import io.appium.java_client.remote.MobileCapabilityType;
import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class BaseTest {
    TrueAutomationDriver driver;

    public By loginBtn = By.cssSelector(ta("ta:mainPage:loginBtn", "a.login-btn"));
    public By signupBtn = By.cssSelector(ta("ta:mainPage:signupBtn", "div.sign-up-container > a"));
    public By emailFl = By.name(ta("ta:loginPage:email", "email"));

    @Parameters({"webdriver"})
    @BeforeClass
    public void before(@Optional("gecko") String webdriver) throws MalformedURLException {
        DesiredCapabilities cap;

        if(webdriver.equals("gecko")){
            driver = new TrueAutomationDriver(new URL("http://localhost:4444"), new DesiredCapabilities());
            driver.manage().window().maximize();
        } else if (webdriver.equals("chrome")){
            driver = new TrueAutomationDriver(new URL("http://localhost:9515"), new DesiredCapabilities());
            driver.manage().window().maximize();
        } else if (webdriver.equals("safari")) {
            driver = new TrueAutomationDriver(new URL("http://localhost:2345"), new DesiredCapabilities());
            driver.manage().window().maximize();
        } else if (webdriver.equals("edge")) {
            driver = new TrueAutomationDriver(new URL("http://localhost:17556"), new DesiredCapabilities());
            driver.manage().window().maximize();
        } else if (webdriver.equals("ios")) {
            cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X (11.4)");
            cap.setCapability(MobileCapabilityType.UDID, "1DA711FE-C66B-4538-9147-10852CF5F1ED");
            cap.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
            driver = new TrueAutomationDriver(new URL("http://localhost:4723/wd/hub"), cap);
        } else if (webdriver.equals("android")) {
            cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
            cap.setCapability(MobileCapabilityType.UDID, "53f4c898");
            driver = new TrueAutomationDriver(new URL("http://localhost:4723/wd/hub"), cap);
        } else {
            throw new WebDriverException("Unknown webdriver: " + webdriver);
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}