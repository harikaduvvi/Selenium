package drag_Anddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover_class {
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/menu/");
			System.out.println("demoqa webpage displayed");
			//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
			
			Actions actions = new Actions(driver);
			WebElement menuElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));
			actions.moveToElement(menuElement).perform();
			WebElement MainItem2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
			actions.moveToElement(MainItem2).perform();
			WebElement subsublist = driver.findElement(By.xpath(""));
			actions.moveToElement(subsublist).perform();
			
		}
		catch(Exception ex) {
			System.out.println(ex);
}
	}
}
