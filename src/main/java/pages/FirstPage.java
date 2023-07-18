package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FirstPage {

	By Page2Navigator = By.xpath("//*[@id=\"botstuff\"]/div/div[3]/table/tbody/tr/td[3]/a");

	WebDriver driver;
	WebDriverWait wait;
	
	public FirstPage(WebDriver driver) { // create a constructor and pass the driver instance
		this.driver=driver; 
		wait = new WebDriverWait(driver, 10);
	}
	By searchResultLocator = new By.ByCssSelector("a h3");

	public List<WebElement> countLinks()

	{
		driver.findElement(searchResultLocator);


		//List<WebElement> elements = driver.findElements(searchResultLocator);
		//int searchResult = (int) elements.stream().filter(WebElement::isDisplayed).count();
		//int secondSearchResults = (int) driver.findElements(searchResultLocator).stream().filter(WebElement::isDisplayed).count();
		return null;
	}


	public void navigatnextpage() {
		driver.findElement(new By.ByCssSelector("[role=navigation] #pnnext")).click();
	}

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Page2Navigator);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	
	public void navigatToPage2() {
		driver.findElement(Page2Navigator).click();
	}
	
	/*public boolean wait() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Page2Navigator)).isDisplayed();
	}
	
	public boolean verifyNewPage() {
		wait.until(ExpectedConditions.urlToBe("https://www.oculus.com/"));
		return driver.getTitle().contains("Oculus | VR Headsets & Equipment");
	}*/

}
