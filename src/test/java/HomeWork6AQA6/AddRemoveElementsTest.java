package HomeWork6AQA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddRemoveElementsTest {
    WebDriver driver;


    @Test
    public void elementsAddRemove(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement buttonAdd =  driver.findElement(By.className("example"));
        buttonAdd.findElement(By.cssSelector("[onclick=\"addElement()\"]")).click();
        buttonAdd.findElement(By.cssSelector("[onclick=\"addElement()\"]")).click();
        WebElement buttonDel = driver.findElement(By.id("elements"));
        buttonDel.findElement(By.cssSelector("[onclick=\"deleteElement()\"]")).click();


        Assert.assertEquals(driver.findElements(By.tagName("button")).size(),2);
        driver.quit();



//

    }
}
