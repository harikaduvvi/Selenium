package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class actionkeyword {
	static WebDriver driver;
	  @Test
	  public static void openBrowser() 	{
		  driver = new ChromeDriver();
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver127\\chromedriver-win64\\chromedriver.exe");	  
	  }
	  public static void openURL() throws InterruptedException {
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/login/");
//		  driver.get("openURL");
		  Thread.sleep(2000);
	  }
	  public  static void Input_Username() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("duvviharika@gmail.com");
		  Thread.sleep(2000);
	  }
	  public static void Input_Password() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345678");
		  Thread.sleep(2000);
	  }
	  public static void Click_LogIn() {
		  driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	  }
	  public static void Close_Driver() {
		 driver.quit();
		 }
}
