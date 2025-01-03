package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Signin {
	
	WebDriver driver;
	@Given("User should be on homepage after clicking on url {string}")
	public void user_should_be_on_homepage_after_clicking_on_url(String string) {
		System.setProperty("WebDriver.Chrome.driver", "Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);	
		
	}
	@Given("Mouse should move to hello<Username>Accounts & list")
	public void mouse_should_move_to_hello_username_accounts_list() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
	}

	@Then("Sign in dialogue box should be opened")
	public void sign_in_dialogue_box_should_be_opened() {
		 boolean actual=driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div")).isDisplayed();
			Assert.assertEquals(true, actual);
	    
	}



}
