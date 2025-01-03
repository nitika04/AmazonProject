package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.SearchPage;
import PageObject.SortingPage;

public class SortingTest extends BaseClass {
	
	@Test
	public void ProductSorting() {
		SearchPage s= new SearchPage(driver);
		
		String searchTerm = "Laptop";
		s.searchForItem(searchTerm);
		s.clickFirstSearchResult();
		
		SortingPage sp=new SortingPage(driver);
		sp.sortProducts("Price: Low to High");
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
    //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("s-main-slot")));

        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        double firstPrice = Double.parseDouble(prices.get(0).getText().replace(",", ""));
        double secondPrice = Double.parseDouble(prices.get(1).getText().replace(",", ""));

        Assert.assertTrue(firstPrice <= secondPrice, "Products are not sorted correctly!");
	}
	
	
}
