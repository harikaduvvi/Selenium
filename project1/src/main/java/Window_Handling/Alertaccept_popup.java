package Window_Handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alertaccept_popup {
static WebDriver driver;
	
	WebElement clickButton1;
	WebElement clickButton2;
	WebElement clickButton3;
	WebElement clickButton4;
		
	WebDriverWait wait;
	Alert simpleAlert;
	
           
	public static void main(String []args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Drivers\\\\Chrome Driver\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		new Alertaccept_popup().popUpHandling(); // calling popup method

	}

	
void popUpHandling() throws InterruptedException{
		wait = new WebDriverWait(driver,Duration.ofSeconds(70));

		scrolltoTabButton();
// ------------------------Accept------------------------------------------------
//		clickButton1 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("alertButton"))));
//		clickButton1.click();
//		Thread.sleep(2000);
//        alertMethod().accept(); //simpleAlert.accept();
//        System.out.println("click on " +clickButton1.getText());
        
//        clickButton2 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("timeAlertButton")))); 
//		clickButton2.click();
//		Thread.sleep(4000); 
//		alertMethod().accept();
//		
//	
//		clickButton3 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("confirmButton")))); 
//		clickButton3.click();
//		Thread.sleep(4000);
//		alertMethod().dismiss(); //simpleAlert.dismiss();
//		alertMethod().accept();

		clickButton4 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("promtButton")))); 
		clickButton4.click();
		Thread.sleep(4000);
		alertMethod().sendKeys("Harika");
		alertMethod().accept();	
		}

	Alert alertMethod() {
		 simpleAlert = driver.switchTo().alert();
		return simpleAlert;
	}

	public static void scrolltoTabButton() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("alertButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
		Thread.sleep(1000);
}
}
