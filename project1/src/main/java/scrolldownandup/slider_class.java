package scrolldownandup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_class {
	static WebDriver driver;
	
    public static void main(String[] args) throws InterruptedException {

             System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().maximize();

             // Launch the URL
             driver.get("https://demoqa.com/slider/");
             
             System.out.println("demoqa webpage displayed");
             //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
           
             // Instantiate Action Class
             Actions actions = new Actions(driver);
             
             //Retrieve WebElement to perform right click
            WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));

            //Move mouse to x offset 50 i.e in horizontal direction
            actions.dragAndDropBy(slider, 50, 0).build().perform();
            slider.click();

             // Close the browser
            //driver.close();
             }
   
}
