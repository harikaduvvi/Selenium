package objectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class objectRepository {
	public static void main(String[] args) throws IOException {
		try {
			Properties prop = new Properties();
			FileInputStream objfile = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\project1\\src\\main\\java\\objectRepository");
			prop.load(objfile);
			objfile.close();
			WebDriver d = new FirefoxDriver();
			d.get(prop.getProperty("url"));
			d.findElement(By.id(prop.getProperty("usernameID"))).sendKeys("harika");
			d.findElement(By.id(prop.getProperty("passwordID"))).sendKeys("harika456");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
