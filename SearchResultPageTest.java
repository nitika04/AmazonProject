package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.SearchPage;
import PageObject.SearchResultPage;

public class SearchResultPageTest extends BaseClass {
	
	@Test
    public void testSearchResultsPage() {
		String searchTerm = "Laptop";
		SearchPage s= new SearchPage(driver);
		SearchResultPage srp=new SearchResultPage(driver);
		s.searchForItem(searchTerm);
		  Assert.assertTrue(srp.areSearchResultsDisplayed(),"No search results displayed.");

		  int numberOfResults =srp.getNumberOfSearchResults();
		  Assert.assertTrue(numberOfResults > 0, "Search results are empty.");
		  
		  String pageTitle = driver.getTitle();
	        Assert.assertTrue(pageTitle.contains(searchTerm), "Search page title does not contain search term.");
	        srp.sortBy("Price: Low to High");
	        
	        srp.goToNextPage();
	        String currentPageUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentPageUrl.contains("page=2"), "Next page did not load.");
	    }

	

}
