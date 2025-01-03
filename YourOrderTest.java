package TestCases;

import org.testng.annotations.Test;

import PageObject.YourOrderPage;

public class YourOrderTest extends BaseClass {

    
    @Test
    public void signin() {
    	YourOrderPage order=new YourOrderPage(driver);
    	order.hoverOverElement();
    	order.signin();
    	order.SetEmail("runitikasharma@gmail.com");
    	order.Clickcontinuebutton();
    	order.SetPassword("dec@2024");
    	order.clicksignin();
    	order.clickyourorder();
    		
    }
}


