package testrunner;


  import org.junit.runner.RunWith;
  
  import cucumber.api.CucumberOptions; import cucumber.api.junit.Cucumber;
 

  @RunWith(Cucumber.class)
  
  @CucumberOptions(features=
  "D:\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature",glue={
  "stepdefinition"}, plugin=
  {"pretty","json:target/HTmlreports.json"},monochrome=true, dryRun=true)
  
  public class Testrunner {
  
  }
 