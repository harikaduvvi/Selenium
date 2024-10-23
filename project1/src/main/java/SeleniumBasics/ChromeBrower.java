package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrower {
	
		static WebDriver driver;
		public static void main(String[] args) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chrome.zip\\chrome-win64\\chromedriver.exe");
			driver.get("https://www.google.com/search?q=maven+dependency&rlz=1C1ONGR_enIN1110IN1110&oq=maven+de&gs_lcrp=EgZjaHJvbWUqCggAEAAYsQMYgAQyCggAEAAYsQMYgAQyBggBEEUYOTIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIKCAYQABixAxiABDIHCAcQABiABDIHCAgQABiABDIHCAkQABiABKgCCLACAQ&sourceid=chrome&ie=UTF-8");
	}
}
