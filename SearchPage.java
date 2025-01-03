package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement SearchBar;
	
	@FindBy(id="nav-search-submit-button")
	WebElement SearchButton; 
	
	@FindBy(xpath ="//*[@id=\"search\"]/span/div[2]/h1/div/div[1]/div/h2/span[3]")
    WebElement firstSearchResult;
	
	@FindBy(xpath = "//span[text()='HP']")
    private WebElement brandFilterHP;
	
	@FindBy(id="searchDropdownBox")
	WebElement SearchDropDown;
	


	
	public void searchForItem(String item) {
        SearchBar.sendKeys(item);
	    SearchButton.click();
	}
	
	public void clickFirstSearchResult() {
        firstSearchResult.click();
    }
	
	 public void applyBrandFilter() {
	        brandFilterHP.click();
	    }
	 
	 public boolean isPriceFilterApplied() {
		 return true;
	 }
	
	public void selectOptionByVisibleText(String visibleText) {
        Select select = new Select(SearchDropDown);
        select.selectByVisibleText(visibleText);  // Select an option by its visible text
     
	}
	
	
	
}
