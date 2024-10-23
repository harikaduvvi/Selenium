package drag_Anddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_1 {
static WebDriver driver;
public static void main(String[] args) {
	try {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		WebElement sourceLocatorBank= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement targetLocator_DebitSide_Account= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement source_5000= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement target_DebitSide_Amount= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
				
				//Using Action class for drag and drop
			 Actions act = new Actions(driver);
				act.dragAndDrop(sourceLocatorBank,targetLocator_DebitSide_Account).build().perform();
				Thread.sleep(2000);
				act.dragAndDrop(source_5000, target_DebitSide_Amount).build().perform();
				
	}
	catch(Exception ex) {
		System.out.println(ex);
	}
}

}
