package scrolldownandup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_class {
	static WebDriver driver;
	
public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	Thread.sleep(2000);
	
	scroll_class obj = new scroll_class();
	
	//obj.scrolldown();
	//obj.scrolltoElement();
	obj.scrollTillEnd();
	
}

public void scrolldown() throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(8000);
	driver.close();
}

	public void scrolltoElement() throws InterruptedException {
		WebElement ele = driver.findElement(By.name("uploadfile"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(8000);
		driver.close();
		
	}
	
	public void scrollTillEnd() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(8000);
		driver.close();
}
}
