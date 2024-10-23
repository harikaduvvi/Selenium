package screen_shot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class screen_shot {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Suriya images", Keys.ENTER);
        Thread.sleep(2000);
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
        	FileUtils.copyFile(scr, new File ("C:\\Users\\HP\\eclipse-workspace\\project1\\src\\main\\java\\objectRepository"));
        }
        catch (IOException e) {
        	e.printStackTrace();
        }
	}
}
