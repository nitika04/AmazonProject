package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SortingPage extends BasePage {

	public SortingPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "s-result-sort-select")
    WebElement sortDropdown;
	
	public void sortProducts(String sortBy) {
        Select sortSelect = new Select(sortDropdown);
        sortSelect.selectByVisibleText(sortBy);  // You can use "Price: Low to High", "Price: High to Low", etc.
    }


}
