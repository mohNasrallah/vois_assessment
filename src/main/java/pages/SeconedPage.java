package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeconedPage {
    WebDriver driver;
    WebDriverWait wait;

    public SeconedPage(WebDriver driver) { // create a constructor and pass the driver instance
        this.driver=driver;
        wait = new WebDriverWait(driver, 10);
    }

    public String noOfLinks2() { //pass a parameter so we don't hardcode values in the object class.
        List<WebElement> links1 = driver.findElements(By.tagName("a"));
        driver.get(String.valueOf(links1.size()));
        return null;
    }
    By searchResultLocator = new By.ByCssSelector("a h3");
    public List<WebElement> countPage2(){
        driver.findElement(searchResultLocator);
        return null;
    }

}
