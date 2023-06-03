import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown{
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver(option);
        d.get("https://rahulshettyacademy.com/dropdownsPractise");
        WebElement staticDropdown = d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select s = new Select(staticDropdown);
       // s.selectByIndex(3);
       // System.out.println(s.getFirstSelectedOption().getText());
        s.deselectByVisibleText("INR");
        System.out.println(s.getFirstSelectedOption().getText());
        s.selectByValue("AED");
        System.out.println(s.getFirstSelectedOption().getText());



    }

}
