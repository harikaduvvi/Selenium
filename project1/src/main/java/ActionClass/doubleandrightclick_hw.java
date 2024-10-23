package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleandrightclick_hw {
	static WebDriver driver;
		static WebElement btnElement;
	    public static void main(String[] args) throws InterruptedException {

	             System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	             driver = new ChromeDriver();
	             driver.manage().window().maximize();

	             // Launch the URL
	             driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	             
	             System.out.println("demo guru webpage displayed");

	             // Instantiate Action Class
	             Actions actions = new Actions(driver);
	             
	             //Retrieve WebElement to perform right click and double click
	            btnElement = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	            //btnElement = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	       
	             actions.doubleClick(btnElement).perform();
	             System.out.println("Button is double clicked");
	             //actions.contextClick(btnElement).perform();
	            // System.out.println("Right click Context Menu displayed");

	             // Close the browser
	           driver.close();
	             }
}
