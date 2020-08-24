package HomeWork6AQA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//
public class TyposTest {
    WebDriver driver;


    @Test
    public void typosTestText() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");
        String test = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(driver.findElement(By.xpath("//div[2]//p[2]")).getText(),test);
        driver.quit();
    }
}