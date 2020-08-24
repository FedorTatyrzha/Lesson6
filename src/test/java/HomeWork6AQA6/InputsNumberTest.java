package HomeWork6AQA6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsNumberTest {
    WebDriver driver;
//
    @Test

    public void validateInput() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("20");

        String text = input.getAttribute("value");
        Assert.assertEquals(text, "20");
        input.sendKeys(Keys.ARROW_DOWN);
        text = input.getAttribute("value");
        Assert.assertEquals(text, "19");
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        text = input.getAttribute("value");
        Assert.assertEquals(text, "9");
        input.sendKeys(Keys.ARROW_UP);
        text = input.getAttribute("value");
        Assert.assertEquals(text, "10");
        input.clear();
        text = input.getAttribute("value");
        Assert.assertEquals(text, "");
        driver.close();


    }
}
