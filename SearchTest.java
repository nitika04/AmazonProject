package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.SearchPage;

public class SearchTest extends BaseClass {
	


	@Test (priority=1)
    public void testSearchFunctionality() {
		
	SearchPage s= new SearchPage(driver);
	
	String searchTerm = "Laptop";
	s.searchForItem(searchTerm);
	s.clickFirstSearchResult();
	String productTitle = driver.getTitle();
    Assert.assertTrue(productTitle.contains("Laptop"), "Product details page did not load correctly.");
}
	
	@Test (priority=2)
	public void Filter(){
		
		SearchPage s1= new SearchPage(driver);
		s1.searchForItem("Laptop");
		s1.applyBrandFilter();
		Assert.assertTrue(s1.isPriceFilterApplied(), "Price filter was not applied correctly.");
		
		
	}
/*
 * @Test public void testSearchWithNoResults() { String searchTerm =
 * "nonexistingitem12345"; SearchPage s1= new SearchPage(driver);
 * s1.searchForItem("nonexistingitem12345");
 * 
 * boolean noResultsMessageDisplayed =
 * driver.getPageSource().contains("No results for");
 * Assert.assertTrue(noResultsMessageDisplayed,
 * "No results message is not displayed."); }
 */
	}
	
     
	 
	 
	 
	 
	 
	 
	 
	 
	 
		/*
		 * @Test (priority=2) public void DropdownSearch() { SearchPage s1=new
		 * SearchPage(driver); s1.selectOptionByVisibleText("Electronics");
		 * s1.SetSearch("blender"); s1.ClickSearchbutton(); }
		 */
	 

