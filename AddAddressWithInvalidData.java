package TestCases;

import org.testng.annotations.Test;

import PageObject.AddAddress;
import PageObject.SigninPage;
import PageObject.YourAccountPage;
import PageObject.YourAddressPage;

public class AddAddressWithInvalidData extends BaseClass

{
	@Test
	public void TestAddAddressWithInvalidData() {
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
		add.SetFullName(null);
		add.SetPh(null);
		add.ClickAddAddress();
		
	}
	
	

}
