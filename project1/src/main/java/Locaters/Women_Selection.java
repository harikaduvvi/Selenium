package Locaters;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Women_Selection {
	
		public static void main(String[] args) throws InterruptedException {
			String exePath = "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.lightinthebox.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebElement Womens_Selection  = driver.findElement(By.xpath("//*[@id=\"mainNav\"]/div/div[2]/div[1]/div/a[4]"));
			Womens_Selection.click();
			System.out.println(Womens_Selection.getText());	
}
		}
	