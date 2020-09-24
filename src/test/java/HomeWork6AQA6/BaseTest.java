package HomeWork6AQA6;

import HomeWork6AQA6.utils.CapabilitiesGenerator;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;

public class BaseTest {
  public   WebDriver driver;
    public void createDriver(ITestContext context) {

        try {
            driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        } catch (SessionNotCreatedException ex) {
            Assert.fail("Браузер не был открыт. Проверьте, что используется корректная версия драйвера");

        }
}}
