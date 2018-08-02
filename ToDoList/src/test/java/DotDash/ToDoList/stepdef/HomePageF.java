package DotDash.ToDoList.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import DotDash.ToDoList.Pom.HomePageElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageF {
	WebDriver driver;

@Given("^NSS-TODO Address$")
public void nss_TODO_Address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions  
	
}

@When("^User enters webaddress in url and hit enter$")
public void user_enters_webaddress_in_url_and_hit_enter() throws Throwable {
    // Invoking Browser and navigating to url.
	System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost/dotdash-project/index.php");
}

@Then("^User lands NSS-TODO home page$")
public void user_lands_NSS_TODO_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	HomePageElement  HE = new HomePageElement(driver);
	Assert.assertTrue(HE.Title().isDisplayed());
	driver.getCurrentUrl().compareTo("http://localhost/dotdash-project/index.php");
	driver.close();
}
	

}
