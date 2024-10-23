package testNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	
	
  @Test
  public void getUrl() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  }
  @AfterTest
  public void Enter_valid_URL() {
	  Actions actions = new Actions(driver);
	  
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	  search.sendKeys("https://www.myntra.com/login?referer=https://www.myntra.com/");
	  actions.sendKeys(Keys.ENTER);
  }
}
