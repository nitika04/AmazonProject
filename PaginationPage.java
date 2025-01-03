package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginationPage extends BasePage {

	public PaginationPage(WebDriver driver) {
		super(driver);
	}
	

	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/ul/li[4]/span/a") // Assuming the 'Next' button text is "Next"
    WebElement nextButton;

	 @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/ul/li[1]/span/a") // Assuming the 'Previous' button text is "Previous"
	 WebElement previousButton;
	 
	 @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/ul/li[4]/span/span") // Page number items in pagination
	 WebElement pageNumber;
	 
	 public void clickNext() {
	        nextButton.click();
	    }

	    public void clickPrevious() {
	        previousButton.click();
	    }

	    public void clickPageNumber(int pageIndex) {
	        // Assuming that page numbers can be clicked to go directly to that page
	        WebElement page = driver.findElement(By.xpath("//li[contains(@class, 's-pagination-item') and text()='" + pageIndex + "']"));
	        page.click();
	    }

}
