package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FirstPage {


	WebDriver driver;
	WebDriverWait wait;
	
	public FirstPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		wait = new WebDriverWait(driver, 10);
	}

	public void navigatnextpage() {
		driver.findElement(new By.ByCssSelector("[role=navigation] #pnnext")).click();
	}


}
