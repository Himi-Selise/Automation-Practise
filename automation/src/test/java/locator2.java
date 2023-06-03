import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator2 {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver(option);
        d.get("https://chaldal.com/");
        d.findElement(By.cssSelector("div[data-reactid=\".eyil0z0eiu.b.2.0.0.2.0.1.$categoryBlock-0.0.0\"]")).click();
        d.findElement(By.xpath("//div[@data-reactid=\".eyil0z0eiu.b.2.0.0.0.0.2.4.0.$12.0.0\"]")).click();
    }
}
