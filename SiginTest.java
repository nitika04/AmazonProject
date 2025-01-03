package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import PageObject.SigninPage;

public class SiginTest {
	
		
		WebDriver driver;
		
	    @BeforeMethod
		public void Setup() {
			
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.amazon.ca/");
			driver.manage().window().maximize();
				
			
	}
	    
	  @Test 
	  public void signin() {
	  
	  SigninPage s=new SigninPage(driver);
	  s.hoverOverElement();
	  s.signin();
	  s.SetEmail("runitikasharma@gmail.com");
	  s.Clickcontinuebutton(); 
	  s.SetPassword("dec@2024");
	  s.clicksignin();
	  
	  //Assert.assertEquals(driver.getTitle(),"amazon");
	 
	  }
	  @Test
	  public void VerifyGreetingmessage() {
		  SigninPage s1=new SigninPage(driver); 
		  String greeting =s1.Greeting();
		  Assert.assertTrue(greeting.contains("Hello"));
	  }
	  
	  @AfterMethod public void teardown() 
	  { driver.close();
	  }
	 
		 
	}


