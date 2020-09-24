package HomeWork6AQA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTablesTest extends BaseTest {
    WebDriver driver;

    @Test
    public void dataTables(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        Assert.assertEquals(driver.findElement(By.xpath("//table[1]//tr[2]//td[2]")).getText(),"Frank");
        Assert.assertEquals(driver.findElement(By.xpath("//table[1]//tr[3]//td[4]")).getText(),"$100.00");
        Assert.assertEquals(driver.findElement(By.xpath("//table[1]//tr[4]//td[5]")).getText(),"http://www.timconway.com");
        driver.quit();
    }
}
////