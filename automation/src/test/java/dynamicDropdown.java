import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver(option);
        d.get("https://rahulshettyacademy.com/dropdownsPractise");
        d.findElement(By.cssSelector("input[id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        d.findElement(By.cssSelector("a[value=\"IXB\"]")).click();
        Thread.sleep(2000);
        d.findElement(By.cssSelector("(//a[@value='MAA])[2]")).click();

    }
}
