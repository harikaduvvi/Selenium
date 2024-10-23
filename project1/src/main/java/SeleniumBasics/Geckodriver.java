package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckodriver {
public static void main(String[] args) throws InterruptedException  {
WebDriver driver = new FirefoxDriver();
System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\GeckoDriver.exe");
driver.manage().window().maximize();
driver.get("https://www.google.com/");
Thread.sleep(2000);
//driver.close();
}
}

