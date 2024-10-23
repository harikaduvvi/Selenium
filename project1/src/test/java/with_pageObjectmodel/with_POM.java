package with_pageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class with_POM {
	WebDriver driver;
	
	public with_POM(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath="//*[contains(@id,'identifierId')]")
	WebElement username;
	
	@FindBy(xpath="//*[contains(@id, 'Next')]")
	WebElement next;
  @Test
  public void enter_username(String uname) {
	  username.sendKeys(uname);
  }
	  public void clicknext() {
	  next.click();
  }
}

