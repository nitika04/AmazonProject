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

public class AddAddress {
	
	WebDriver driver;
	@Given("User should be signed in after entering url {string}")
	public void user_should_be_signed_in_after_entering_url(String string) {
		System.setProperty("WebDriver.Chrome.driver", "Chromedriver.exe");
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
	    
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"nav-link-accountList\\\"]/div"))).perform();
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span")).click();
		
		
		
	}

	@When("Click on add address button")
	public void click_on_add_address_button() {
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/ul[2]/li[1]/span/a/div/div/div/div[2]/h2")).click();
	}

	@Then("Your should navigate to add a new address page")
	public void your_should_navigate_to_add_a_new_address_page() {
	    driver.findElement(By.xpath("//*[@id=\"ya-myab-plus-address-icon\"]")).click();
	    boolean actual=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[1]/div/ul/li[5]/span/span")).isDisplayed();
		Assert.assertEquals(true, actual);
	}




}
