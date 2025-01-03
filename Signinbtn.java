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

public class Signinbtn {
	
	WebDriver driver;
	@Given("User should be on homepage after entering url {string}")
	public void user_should_be_on_homepage_after_entering_url(String string) {
		System.setProperty("WebDriver.Chrome.driver", "Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);	
	}

	@When("User clicks on Sign in button and enter valid credentials")
	public void user_clicks_on_sign_in_button_and_enter_valid_credentials() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"nav-link-accountList\\\"]/div"))).perform();
		
		driver.findElement(By.xpath("//*[@id=\\\"nav-flyout-ya-signin\\\"]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\\\"continue\\\"]")).click();
		driver.findElement(By.xpath("txt_password")).sendKeys("dec@2024");
		driver.findElement(By.xpath("//*[@id=\\\"signInSubmit\\\"]")).click();
	
	    
	}

	@Then("User should be signed in and navigated to homepage")
	public void user_should_be_signed_in_and_navigated_to_homepage() {
		boolean actual=driver.findElement(By.xpath("//*[@id=\\\"nav-link-accountList-nav-line-1\\\"]")).isDisplayed();
		Assert.assertEquals(true, actual);
	}

}
