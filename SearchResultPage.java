package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
		
		
		 @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
		 WebElement firstProduct;
		
		 @FindBy(xpath = "//div[@data-asin and @class='s-main-slot s-result-list s-search-results sg-row']")
		 WebElement searchResultsContainer;
		 
		 @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
		    List<WebElement> searchResults;
		
		 @FindBy(id = "s-result-sort-select")
		    WebElement sortDropdown;
		 
		 @FindBy(xpath = "//li[@class='a-last']/a")
		    WebElement nextPageButton;
		 
		 
		 
		 public String getFirstProductName() {
		        return firstProduct.getText();
		    }
		 
		 public boolean areSearchResultsDisplayed() {
		        return searchResults.size() > 0;
		    }
		 public int getNumberOfSearchResults() {
		        return searchResults.size();
		    }
		 public void sortBy(String option) {
		        sortDropdown.sendKeys(option);
		    }
		 public void goToNextPage() {
		        if (nextPageButton.isDisplayed()) {
		            nextPageButton.click();
		        }
}}
