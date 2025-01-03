package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AddAddress;
import PageObject.SigninPage;
import PageObject.YourAccountPage;
import PageObject.YourAddressPage;

public class ClickAddAddressTest extends BaseClass {
	@Test
	public void addaddress()
	{
		SigninPage s= new SigninPage(driver);
	    s.hoverOverElement();
		s.signin();
		s.SetEmail("runitikasharma@gmail.com");
		s.Clickcontinuebutton();
		s.SetPassword("dec@2024");
		s.clicksignin();
		s.hoverOverElement();
		
		YourAccountPage a= new YourAccountPage(driver);
		a.ClickYourAccount();
		
		YourAddressPage ad=new YourAddressPage(driver);
		ad.clickYourAddrs();
		ad.ClickAddAddress();
		
		AddAddress add=new AddAddress(driver);
		add.SetCountry();
		add.Setcountryname();
		add.SetFullName("Heena");
		add.SetPh("123456789");
		add.SetAddress("19 Mason Street");
		add.SetAddressline2(" ");
		add.SetCity("Montreal");
		add.SetProvince();
		add.SetProvinceName();
		add.SetPostalCode("L9W0S2");
		//add.Makethisdefault();
		add.ClickAddAddress();
		

			  
			  String Message =add.Setconfirmation();
			  Assert.assertTrue(Message.contains("Address saved"));
		  }
		  
		
	}
	
	
	



