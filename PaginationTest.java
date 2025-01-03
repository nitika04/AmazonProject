package TestCases;

import org.testng.annotations.Test;

import PageObject.PaginationPage;
import PageObject.ScrollPage;
import PageObject.SearchPage;

    public class PaginationTest extends BaseClass {
    

	 @Test(priority=1)
	 public void testPaginationNextButton() {
		 SearchPage s= new SearchPage(driver);
 		
 		String searchTerm = "Laptop";
 		s.searchForItem(searchTerm);
 		s.clickFirstSearchResult();
 		
 		ScrollPage sp= new ScrollPage(driver);
 		sp.scrollDown();
 		sp.scrollToElement();
		 
		 PaginationPage p= new PaginationPage(driver);
		 p.clickNext();	
		 p.clickPrevious();
		   /*Assert.assertTrue(driver.getCurrentUrl().contains("page=1"));
		   p.clickPageNumber(3);
		   Assert.assertTrue(driver.getCurrentUrl().contains("page=3"));
		   }*/
    }}

		 


  
   
  
