package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAccountPage extends BasePage{
	
	public CreatAccountPage(WebDriver driver){
		
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/div")
    private WebElement hoverElement;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-newCust\"]/a")
	WebElement Starthere ;
	
	@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	WebElement txt_Name ;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement txt_email;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement txt_password;
	
	@FindBy(xpath="//*[@id=\"ap_password_check\"]")
	WebElement txt_Passwordagain;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton; 
	
	@FindBy(xpath="//*[@id=\"auth-email-invalid-claim-alert\"]/div/div")
	WebElement errormessage;
	
	

    public void hoverOverElement() {
    Actions actions = new Actions(driver);
    actions.moveToElement(hoverElement).perform();
        }

        public void Starthere() {
	    Starthere.click();
        }
        public void SetName(String name) {
        	txt_Name.sendKeys(name);
        }
        public void setemail(String email) {
        	txt_email.sendKeys(email);
        }
        public void setpassword(String pswd) {
        	txt_password.sendKeys(pswd);
        }
        public void setpasswordagain(String pswdagain) {
        	txt_Passwordagain.sendKeys(pswdagain);
        }
       		
        public void continuebttn()
        {
        	continuebutton.click();
        }
	
		public String errmessage() {
		
			return errormessage.getText();
		}
        		
     
}