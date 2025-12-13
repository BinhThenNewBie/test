package com.example.i1thang12;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.time.Duration;


public class testVitamex {

    WebDriver driver;
    WebDriverWait wait;

            String email = "toilaai12312312322@gmail.com";
            String pass = "Password123!";


            @BeforeClass
            public void setUp() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.manage().window().maximize();
            }
        @Test
        public void testdangkidangnhap()throws InterruptedException{
            driver.get("https://vitimex.com.vn/");


            String loginIconXpath = "//a[@href='/account/login']";
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginIconXpath))).click(); // wait dùng để đợi cho đến khi một thành phần có thể sử dụng được
            // 2. Chuyển sang tab "Đăng ký"
            String registerTabXpath = "//a[normalize-space()='Đăng ký']";
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(registerTabXpath))).click();


            driver.findElement(By.id("last_name")).sendKeys("Do");
            driver.findElement(By.id("first_name")).sendKeys("Binh");


            driver.findElement(By.id("radio1")).click();

            WebElement locngaysinh = driver.findElement(By.id("birthday"));
            locngaysinh.sendKeys("12/12/1990");
            locngaysinh.sendKeys(Keys.TAB);


            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("password")).sendKeys(pass);
            Thread.sleep(10000);
            driver.findElement(By.className("btn-primary")).click();

            // 5. Chờ chuyển đến trang "Tài khoản của tôi" (Xác nhận đăng ký thành công)
            Thread.sleep(6000);
            WebElement username =  driver.findElement(By.className("member-name"));
            System.out.println("Dang ky thanh cong: " + username.getText());
            driver.findElement(By.className("btn-logout")).click();
            System.out.println("Dang xuat thanh cong");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginIconXpath))).click();
            driver.findElement(By.id("customer_email")).sendKeys(email);
            driver.findElement(By.id("customer_password")).sendKeys(pass);
            driver.findElement(By.className("btn-signin")).click();


        }
    @AfterClass
    public void tearDown() {
//        driver.quit();
    }
}




