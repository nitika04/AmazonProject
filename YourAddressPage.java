package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAddressPage extends BasePage {

	public YourAddressPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement YourAddresses;
	
	@FindBy(xpath="//*[@id=\"ya-myab-plus-address-icon\"]")
	WebElement AddAddresses;
	
    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div/h1")
    WebElement msgHeading;

    public void clickYourAddrs() {
      YourAddresses.click();
    }
      
    public boolean isYourAddressesPageExists() {
    	  try {
    		  return(msgHeading.isDisplayed());
    	 }
    	  catch(Exception e) {
    		   
    	  return false;
    				 
      }}
    
    	  public void ClickAddAddress() {
    		  AddAddresses.click();
    	  
      
    }
}
