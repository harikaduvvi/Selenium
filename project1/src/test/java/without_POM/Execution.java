package without_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Execution {
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3DOGB%26utm_medium%3Dapp&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1192743886%3A1724308792471696&ddm=0");
	 // driver.findElement(By.xpath("//*[contains(@id,'identifierId')]")).sendKeys();
	  //driver.findElement(By.xpath("//*[contains(@id, 'Next')]")).click();
	  Without_POMclass obj = new Without_POMclass(driver);
	  obj.typeusername();
	  obj.clicknext();
	  
  }
}
