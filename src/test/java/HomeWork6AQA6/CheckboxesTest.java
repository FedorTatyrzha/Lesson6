package HomeWork6AQA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest {
    WebDriver driver;


    @Test
    public void checkBoxes(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement boxes = driver.findElement(By.id("checkboxes"));
        Assert.assertFalse(boxes.findElements(By.xpath("//input[@type='checkbox']")).get(0).isSelected());
        boxes.findElements(By.xpath("//input[@type='checkbox']")).get(0).click();
        Assert.assertTrue(boxes.findElements(By.xpath("//input[@type='checkbox']")).get(0).isSelected());
        Assert.assertTrue(boxes.findElements(By.xpath("//input[@type='checkbox']")).get(1).isSelected());
        boxes.findElements(By.xpath("//input[@type='checkbox']")).get(1).click();
        Assert.assertFalse(boxes.findElements(By.xpath("//input[@type='checkbox']")).get(1).isSelected());
        driver.quit();

    }
}
