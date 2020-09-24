package HomeWork6AQA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;////
import static org.testng.Assert.assertEquals;

public class NotificationMessageTest extends BaseTest {
    WebDriver driver;

    @Test
    public void notificationValidate() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        WebElement button = driver.findElement(By.id("content"));
        button.findElement(By.cssSelector("[href=\"/notification_message\"]")).click();
        String str = driver.findElement(By.id("flash")).getText();
        String result = "Action successful\n×";
        assertEquals(str, result);
        driver.quit();


    }
}
