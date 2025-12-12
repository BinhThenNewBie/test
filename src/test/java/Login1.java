import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login1 {
    WebDriver driver;
    @BeforeClass
    public void SetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void TestLogin() throws InterruptedException{
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Logged In Successfully"));
        System.out.println("dang nhap thanh cong");
    }
    @AfterClass
    public void TearDown(){
        driver.quit();
    }
}
