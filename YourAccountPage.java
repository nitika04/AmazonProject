package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage{

	public YourAccountPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement YourAccount;
	
	
	public void ClickYourAccount() {
		YourAccount.click();

}}