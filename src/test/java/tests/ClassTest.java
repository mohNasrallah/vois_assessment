package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FirstPage;
import pages.HomePage;

import java.util.List;

public class ClassTest extends BasePage{
	@Test
	public void TestScenario() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		//// search on google with vodafone
		homePage.searchProcess("vodafone");
		FirstPage first = new FirstPage(driver);
		Thread.sleep(5000);
		//// count the first page results and save into variable then print the number
		By searchResultLocator = new By.ByCssSelector("a h3");
		List<WebElement> elements = driver.findElements(searchResultLocator);
		int searchResult = (int) elements.stream().filter(WebElement::isDisplayed).count();
		logger.log(LogStatus.INFO, "First Page count :::"+searchResult);
		//// navigste to next page
		first.navigatnextpage();
		//// count the Second page results and save into variable then print the number
		Thread.sleep(5000);
		int secondSearchResults = (int) driver.findElements(searchResultLocator).stream().filter(WebElement::isDisplayed).count();
		logger.log(LogStatus.INFO, "Seconed Page count :::"+secondSearchResults);
		//// validate if the two pages result are equal or not
		logger.log(LogStatus.INFO, "Checking if result first page results  is equal to seconed page results  " );
		if (searchResult == secondSearchResults){
			logger.log(LogStatus.INFO,"Passed :::: results are equal = " );
		}

		else if (searchResult != secondSearchResults){
			logger.log(LogStatus.INFO,"Failed :::: results not equal " );

		}

		}
	}

