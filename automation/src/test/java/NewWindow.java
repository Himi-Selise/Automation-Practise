import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class NewWindow {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver(option);
        d.get("https://rahulshettyacademy.com/loginpagePractise/#");
        d.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = d.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String parentId = it.next();
        String childtId = it.next();
        d.switchTo().window(childtId);
        System.out.println(d.findElement(By.cssSelector(".im-para.red")).getText());
        String emailid = d.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        d.switchTo().window(parentId);
        d.findElement(By.id("username")).sendKeys(emailid);
    }
}
