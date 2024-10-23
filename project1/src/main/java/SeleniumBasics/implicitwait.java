package SeleniumBasics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class implicitwait {
    // it tells the webdriver to wait a certain amount of time before
    // throwing a nosuchelementexception if not located on web page within that time
    
    static WebDriver driver;
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testingshastra.com/javascriptform.html");
        driver.findElement(By.id("acc")).click();
}
}
