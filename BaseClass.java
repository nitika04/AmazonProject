package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	
	public WebDriver driver;

    @BeforeMethod
	public void Setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
			
}
    @AfterMethod public void Closebrowser() 
	  { driver.quit();
	  }
    
}