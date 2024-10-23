package with_pageObjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution {
	WebDriver driver;
	@BeforeTest
	 public void setup() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3DOGB%26utm_medium%3Dapp&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1192743886%3A1724308792471696&ddm=0");
	}	  
  @Test
  public void login() throws InterruptedException {
	  with_POM obj = PageFactory.initElements(driver, with_POM.class);
	  obj.enter_username("harika");
	  Thread.sleep(2000);
	  obj.next.click();
	  
  }
  }
