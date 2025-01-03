package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.ScrollPage;
import PageObject.SearchPage;

public class ScrollTest extends BaseClass {
	
	@Test
    public void testScrollDown() {
		 SearchPage s= new SearchPage(driver);
	 		
	 		String searchTerm = "Laptop";
	 		s.searchForItem(searchTerm);
	 		s.clickFirstSearchResult();
	 		
	 		ScrollPage sp= new ScrollPage(driver);
	 		sp.scrollDown();
	 		sp.scrollToElement();
    }

	 		
	}


