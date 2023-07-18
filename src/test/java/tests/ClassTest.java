package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FirstPage;
import pages.HomePage;
import pages.SeconedPage;

import java.util.List;

public class ClassTest extends BasePage{





	@Test
	public void TestScenario() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.searchProcess("vodafone");
		FirstPage first = new FirstPage(driver);
		Thread.sleep(5000);
		By searchResultLocator = new By.ByCssSelector("a h3");
		List<WebElement> elements = driver.findElements(searchResultLocator);
		int searchResult = (int) elements.stream().filter(WebElement::isDisplayed).count();
		logger.log(LogStatus.INFO, "First Page count :::"+searchResult);
		first.navigatnextpage();
		Thread.sleep(3000);
		SeconedPage seconed = new SeconedPage(driver);
		int secondSearchResults = (int) driver.findElements(searchResultLocator).stream().filter(WebElement::isDisplayed).count();
		logger.log(LogStatus.INFO, "Seconed Page count :::"+secondSearchResults);
		logger.log(LogStatus.INFO, "Checking if result first page  is equal to seconed page " );
		if (searchResult == secondSearchResults){
			logger.log(LogStatus.INFO,"Passed");
		}

		else if (searchResult != secondSearchResults){
			logger.log(LogStatus.INFO,"Failed");

		}

		}
	}

