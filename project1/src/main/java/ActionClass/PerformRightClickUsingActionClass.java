package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClickUsingActionClass {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Launch the URL
        driver.get("https://demoqa.com/buttons");
        System.out.println("demoqa webpage displayed");

        // Instantiate Action Class
        Actions actions = new Actions(driver);
        
        //Retrieve webelement to perform right click
        WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

        // Right-click on the button
        actions.contextClick(btnElement).perform();
        System.out.println("Right click Context Menu displayed");

        // Close the browser
        driver.close();
        }
   static void rightClickBtn() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("doubleClickBtn"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
		Thread.sleep(8000);
		//driver.close();
}
}
