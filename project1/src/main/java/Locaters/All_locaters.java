package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_locaters {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String exePath = "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		scrolltoElement("//*[@id=\"firstName\"]");
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("Harika");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Harika12@gmail.com");
//		driver.findElement(By.className("");
		
		/** Locate  by Link text and PartialLink text attribute
		 * URL - https://demoqa.com/links
		 */
		driver.get("https://demoqa.com/links");
		//Link text
		scrolltoElement("//*[@id=\"bad-request\"]");
		driver.findElement(By.linkText("Home")).click();
		WebElement badRequestLink = driver.findElement(By.xpath("//a[contains@id,'bad-request']"));
		badRequestLink.click();
		// //<HTML tag>[contains(@attribute_name,'attribute_value']
		//PartialLinktext
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Ho")).click();
		//CSS Selector
		driver.findElement(By.cssSelector("input[id= 'userName']"));
		//Locate by xpath attribute
		driver.get("https://demoqa.com/links");
		driver.findElement(By.xpath("//input[@id='userName']"));
	}
		public static String scrolltoElement(String name) throws InterruptedException {
			WebElement ele = driver.findElement(By.xpath(name));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",ele);
			Thread.sleep(8000);
			return name;
		}
			
	}
