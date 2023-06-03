import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 public class firstTest {
    ChromeDriver driver;
     @BeforeTest
    public void setbrowser()
    {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://www.saucedemo.com/");
    }
    @Test()
    public void login()
    {
        driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
    @AfterTest
     public  void browserCLose()
    {
        driver.close();
    }
}
