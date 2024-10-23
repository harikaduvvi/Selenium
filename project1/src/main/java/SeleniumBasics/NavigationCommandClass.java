package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Open ToolsQA web site
	String appUrl = "https://www.lightinthebox.com/";
	driver.navigate().to(appUrl);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@id='cartText']")).click();
	Thread.sleep(2000);
	//Go back  
	driver.navigate().back();
	//Go forward to Registration page
	driver.navigate().forward();
	//Refresh browser
	driver.navigate().refresh();
	//close browser
	driver.close();
}	
}
