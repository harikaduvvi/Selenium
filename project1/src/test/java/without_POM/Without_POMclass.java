package without_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Without_POMclass {
	WebDriver driver;
	public Without_POMclass(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.xpath("//*[contains(@id,'identifierId')]");
	By next = By.xpath("//*[contains(@id, 'Next')]");
  @Test
  public void typeusername() {
	  driver.findElement(username).sendKeys("Harika");
  }
	  public void clicknext() {
	  driver.findElement(next).click();
  }
}
