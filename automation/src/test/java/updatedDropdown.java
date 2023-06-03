import com.sun.source.tree.WhileLoopTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class updatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver(option);
        d.get("https://rahulshettyacademy.com/dropdownsPractise");
        d.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        //int i =1;
       /* while(i<5)
        {
            d.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/

        for (int i =1; i<5; i++)
            d.findElement(By.id("hrefIncAdt")).click();

        d.findElement(By.id("btnclosepaxoption")).click();



    }
}
