package multi_selectElement_list;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drop_down {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	    driver.navigate().refresh();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    WebElement mySelectElement = driver.findElement(By.name("dropdown"));
		wait.until(ExpectedConditions.visibilityOf(mySelectElement));
		Actions actions = new Actions(driver);
		actions.build().perform();
		  mySelectElement.click();
}
}


