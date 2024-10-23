package testNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class annotations_hw {
	 WebDriver driver;
  @Test
  public void Openbrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
  }
  @AfterTest
  public void Closebrowser() {
	  driver.close();
  }
  public void Openwebsite() {
	  driver.get("https://www.myntra.com/");
	  }
  }
