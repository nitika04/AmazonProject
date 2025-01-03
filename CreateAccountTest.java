package TestCases;



	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import PageObject.CreatAccountPage;

	public class CreateAccountTest extends BaseClass {

		

	    
			@Test
			public void createAccount() {
				CreatAccountPage ca= new CreatAccountPage(driver);
				ca.hoverOverElement();
				ca.Starthere();
				ca.SetName("Nitika");
				ca.setemail("runitikash");
				ca.setpassword("1234567");
				ca.setpasswordagain("1234567");
				ca.continuebttn();
				
				String expectedMessage = "Enter email id ";
				String actualMessage=ca.errmessage();
				Assert.assertEquals("Wrong or invalid e-mail address or mobile phone number. Please correct it and try again.", expectedMessage, actualMessage);
			}
				
		
		
	}


