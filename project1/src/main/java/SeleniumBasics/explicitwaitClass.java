package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitClass {
//	static WebDriver driver;
//	static WebDriverWait wait;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
		        
		//WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.lightinthebox.com/index.php?main_page=index");
		        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));

		        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='unit_header']")));
		        e.click();
		        driver.findElement(By.xpath("//a[@my='favorites']")).click();
		        driver.findElement(By.id("Other_emailAddress")).sendKeys("Harika@gmail.com");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
}
}


