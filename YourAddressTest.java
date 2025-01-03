package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.SigninPage;
import PageObject.YourAccountPage;
import PageObject.YourAddressPage;

public class YourAddressTest extends BaseClass {
	
	
	@Test
	public void youraddress() {
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
		boolean targetPage=ad.isYourAddressesPageExists();
		Assert.assertEquals(targetPage, true);
	}

}
