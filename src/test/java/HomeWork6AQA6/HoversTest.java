package HomeWork6AQA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest {
    WebDriver driver;

//
    @Test
    public void hoversTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//img[@alt='User Avatar']"))).build().perform();
        Assert.assertEquals(driver.findElement(By.xpath("//h5[text()='name: user1']")).getText(),"name: user1");
        driver.findElement(By.xpath("//a[@href='/users/1']")).click();
        String error = driver.findElement(By.xpath("//h1['Not Found']")).getText();
        Assert.assertEquals(error,"Not Found");
        driver.navigate().back();
        actions.moveToElement(driver.findElement(By.xpath("//body//div[2]//div[1]//div[2]//img"))).build().perform();
        Assert.assertEquals(driver.findElement(By.xpath("//h5[text()='name: user2']")).getText(),"name: user2");
        driver.findElement(By.xpath("//a[@href='/users/2']")).click();
        Assert.assertEquals(error,"Not Found");
        driver.navigate().back();
        actions.moveToElement(driver.findElement(By.xpath("//body//div[2]//div[1]//div[3]//img"))).build().perform();
        Assert.assertEquals(driver.findElement(By.xpath("//h5[text()='name: user3']")).getText(),"name: user3");
        driver.findElement(By.xpath("//a[@href='/users/3']")).click();
        Assert.assertEquals(error,"Not Found");
        driver.navigate().back();
        driver.quit();

    }
}

