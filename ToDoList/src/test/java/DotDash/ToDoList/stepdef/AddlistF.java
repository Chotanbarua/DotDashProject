package DotDash.ToDoList.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DotDash.ToDoList.Pom.AddListElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddlistF{
	WebDriver driver;
	
	@When("^User enter list name$")
	public void user_enter_list_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/dotdash-project/index.php");
		AddListElement AL = new AddListElement(driver);
		AL.AList().sendKeys("First Item");
	    
	}

	@When("^User hit add button$")
	public void user_hit_add_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AddListElement AL = new AddListElement(driver);
		AL.AddB().click();
	    
	}

	@Then("^User should see the added item in the list$")
	public void user_should_see_the_added_item_in_the_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.getPageSource().contains("First Item");
		driver.quit();
		
		
	    
	}

}
