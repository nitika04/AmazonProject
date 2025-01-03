package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Filter {
	
	WebDriver driver;
	@Given("User should be on homepage after clicking on url {string}")
	public void user_should_be_on_homepage_after_clicking_on_url(String string) {
		System.setProperty("WebDriver.Chrome.driver", "Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);	
	}
	
	@When("User enter product name on searchbar and press search button")
	public void user_enter_product_name_on_searchbar_and_press_search_button() {
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("laptop");
		    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}

	@When("User applys filter")
	public void user_applys_filter() {
	    driver.findElement(By.xpath("//*[@id=\"p_123/308445\"]/span/a/div/label/i")).click();
	}

	@Then("Product resulut shows relevant product based on filter")
	public void product_resulut_shows_relevant_product_based_on_filter() {
	    String actual=driver.findElement(By.xpath("//*[@id=\"7130585a-6fe1-4189-b8d2-832fdef0b5dd\"]/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span/text()")).getText();
	    Assert.assertEquals("HP 15 inch Laptop, HD Display, Intel Processor N100, 4 GB RAM, 128 GB UFS, Intel UHD Graphics, Windows 11 Home in S Mode, 15-fd0000ca", actual);
	}


}
