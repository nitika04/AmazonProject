package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CreateAccount {
	
	WebDriver driver;
	@Given("User should be on Creat account Page after entering Url {string}")
	public void user_should_be_on_creat_account_page_after_entering_url(String string) {
		System.setProperty("WebDriver.Chrome.driver", "Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);	
	}

	@When("Click on verify after entering the valid Name, email or mobile number, password and Again Password")
	public void click_on_verify_after_entering_the_valid_name_email_or_mobile_number_password_and_again_password() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"nav-link-accountList\\\"]/div"))).perform();
			
	}

	@When("Click on verify email")
	public void click_on_verify_email() {
		driver.findElement(By.xpath("//*[@id=\\\"nav-flyout-ya-newCust\\\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\\\"ap_customer_name\\\"]")).sendKeys("Nitika Sharma");
		driver.findElement(By.xpath("//*[@id=\\\"ap_email\\\"]")).sendKeys("runitikasharma214@gmail.com");
		driver.findElement(By.xpath("//*[@id=\\\"ap_password\\\"]")).sendKeys("dec@2024");
		driver.findElement(By.xpath("//*[@id=\\\"ap_password_check\\\"]")).sendKeys("dec@2024");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

	}

	@Then("Message should be dispalyed that user is alreay registered")
	public void message_should_be_dispalyed_that_user_is_alreay_registered() {
		
		String actualmessage=driver.findElement(By.xpath("//*[@id=\"register-mase-inlineerror\"]/div/div")).getText();
		
		String expectedmessage="Account already exists";
		
		Assert.assertEquals(actualmessage, expectedmessage, "The expected message doesn't match the actual message!");
	    
        	}

}
