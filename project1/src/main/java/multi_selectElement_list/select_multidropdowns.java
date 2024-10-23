package multi_selectElement_list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class select_multidropdowns {
	public static void captureScreenMethod() throws Exception {
			
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();
    driver.manage().window().maximize();
   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
    driver.navigate().refresh();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    WebElement mySelectElement = driver.findElement(By.name("multipleselect[]"));
	wait.until(ExpectedConditions.visibilityOf(mySelectElement));
    Select dropdown = new Select(mySelectElement);
    dropdown.selectByIndex(0);
    dropdown.selectByIndex(1);
    List<WebElement> options = dropdown.getOptions();
    for (WebElement option : options) {
    	System.out.println(option.getText());
}
}
		
		public static void main(String[] args) throws Exception{
	new select_multidropdowns().captureScreenMethod();
}
}