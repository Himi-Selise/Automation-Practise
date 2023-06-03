import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class amazon {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver(option);
        d.get("https://www.amazon.com/");
        Actions a = new Actions(d);
        a.moveToElement(d.findElement(By.cssSelector("span[class=\"icp-nav-link-inner\"]"))).build().perform();
        a.moveToElement(d.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    }
}
