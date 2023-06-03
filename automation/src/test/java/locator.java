import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver(option);

        d.get("https://pharmalys-corporate.slsweb.ch/admin/login");
        d.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("gyuerfy");//// css selector with tag[attribute="value"]
        d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("hh");
        d.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        d.findElement(By.tagName("button")).click();
        //d.findElement(By.cssSelector(String.valueOf(By.cssSelector("input#email")))).sendKeys("gyuerfy");

//        d.findElement(By.id("username")).sendKeys("17-3");
//        d.findElement(By.id("password")).sendKeys("H*");
//        d.findElement(By.cssSelector("button.p-lg-left-right")).click();
//        d.findElement(By.cssSelector("small.text-danger")).getText();

    }
}
