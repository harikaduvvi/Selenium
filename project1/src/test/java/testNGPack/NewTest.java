package testNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void Execution() {
	  WebDriver driver;
	  driver = new ChromeDriver();
	System.setProperty("WebDriver.chrome.driver","D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64");
  driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
  }
}
