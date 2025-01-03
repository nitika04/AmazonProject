package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage {

	 public SigninPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath ="//*[@id=\"nav-link-accountList\"]/div")
    private WebElement hoverElement;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signin;
	

	@FindBy(xpath="//*[@id=\"ap_email\"]")
    WebElement txt_email; 
	
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton;
	
	
    @FindBy(xpath="//*[@id=\"ap_password\"]")
    WebElement txt_password;
    
    @FindBy(xpath="//*[@id=\"signInSubmit\"]")
    WebElement sigin_button;
    
    @FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement Greetingmessage;
    
    
    public void hoverOverElement() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
    }
    
    public void signin() {
    	signin.click();
    }
    
    public void SetEmail(String user)
    {
    	txt_email.sendKeys(user);
    }
    public void Clickcontinuebutton() {
    	continuebutton.click();
    }
    public void SetPassword(String pswd ){
    	txt_password.sendKeys(pswd);
    }
    public void clicksignin() {
        sigin_button.click();
    
    }
 
	public String Greeting() {
		return Greetingmessage.getText();
	}
}
    
    
