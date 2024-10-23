package SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox {
static WebDriver driver;
public static void main(String[] args) {
	driver = new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chrome.zip\\chrome-win64\\chromedriver.exe");
	//driver.get("https://www.google.com/search?client=firefox-b-d&q=Maven+dependencies");
}
}
