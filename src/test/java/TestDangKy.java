import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDangKy {
    WebDriver driver;
    @BeforeClass
    public void SetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void TestLogin() throws InterruptedException{
        driver.get("https://vitimex.com.vn/account/register");
        Thread.sleep(3000);
        driver.findElement(By.id("field-lastname")).sendKeys("Binh");
        driver.findElement(By.id("field-firstname")).sendKeys("Do");
        driver.findElement(By.id("radio1")).click();
        driver.findElement(By.id("field-birthday")).sendKeys("22/08/2008");
        driver.findElement(By.id("field-email")).sendKeys("binhdath06811@gmail.com");
        driver.findElement(By.id("field-password")).sendKeys("toilaai");
        driver.findElement(By.className("btn btn-primary")).click();
        Thread.sleep(2000);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

