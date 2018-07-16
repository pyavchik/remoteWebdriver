import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {
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
}
