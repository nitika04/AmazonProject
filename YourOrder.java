package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class YourOrder {
	WebDriver driver;
	@Given("User should be logged in  after entering the url {string}")
	public void user_should_be_logged_in_after_entering_the_url(String string) {
		driver=new ChromeDriver();
		driver.get(string);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"nav-link-accountList\\\"]/div"))).perform();
		
		driver.findElement(By.xpath("//*[@id=\\\"nav-flyout-ya-signin\\\"]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\\\"continue\\\"]")).click();
		driver.findElement(By.xpath("txt_password")).sendKeys("dec@2024");
		driver.findElement(By.xpath("//*[@id=\\\"signInSubmit\\\"]")).click();
	    
		
	}

	@When("Move mouse on Hello,Username Account & list and click on Your orders from the list option")
	public void move_mouse_on_hello_username_account_list_and_click_on_your_orders_from_the_list_option() {
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"nav-link-accountList\\\"]/div"))).perform();
		driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span")).click();
	}

	@Then("User should be able to navigate to Your orders page")
	public void user_should_be_able_to_navigate_to_your_orders_page() {
	    String actualresult =driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.ca/gp/css/order-history?ref_=nav_AccountFlyout_orders", actualresult);                   
	}

}
