package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Search {
	WebDriver driver;
	@Given("User should be on Homepage {string}")
	public void user_should_be_on_homepage(String string) {
		System.setProperty("WebDriver.Chrome.driver", "Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("User enters productname on searchbar & click on searchbutton")
	public void user_enters_productname_on_searchbar_click_on_searchbutton() {
	    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("laptop");
	    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}

	@Then("User should navigate to search result page and show relavant product")
	public void user_should_navigate_to_search_result_page_and_show_relavant_product() {
		String actualresult =driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.ca/s?k=laptop&crid=14GVXCLD86T4K&sprefix=la%2Caps%2C152&ref=nb_sb_ss_ts-doa-p_1_2", actualresult);   
	}


}
