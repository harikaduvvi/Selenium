package Performance_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Stopwatch {
	private String getTime;

	public static void main(String[]args) throws InterruptedException{
		Stopwatch pageLoad =new Stopwatch();  //StopWatch it measure the time taken for an activity of interest
		   //pageLoad.start(); //starting time 
			
		    Long starttime = System.currentTimeMillis();
		    System.out.println("start time :"+ starttime);
		    
		    WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement search = driver.findElement(By.name("q")); // search bar name 
			search.sendKeys("images"+ Keys.RETURN); // Keys.RETURN: it click on enter 
			//pageLoad.stop();                 //ending time 
			Long endTime = System.currentTimeMillis();
			Long diff = starttime-endTime;
			System.out.println("end Time :"+endTime+ "\n"+"start -end time :"+diff );
			System.out.println("Total page Load Time:"+pageLoad.getTime+"milli-seconds");
			driver.close();
			
		}
}
