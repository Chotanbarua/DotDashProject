package DotDash.ToDoList.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DotDash.ToDoList.Pom.RemoveListElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveListF {
	WebDriver driver;
	
@Given("^NSS-TODO HomePage$")
public void NSS_TODO_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
}

@When("^User select list name from list field$")
public void user_select_list_name_from_list_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost/dotdash-project/index.php");
	RemoveListElement RL = new RemoveListElement(driver);
	RL.checkbox().click();
	RL.checkbox().isSelected();
}

@When("^User hit remove button$")
public void user_hit_remove_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RemoveListElement RL = new RemoveListElement(driver);
	RL.Rbutton().click();
    
}

@Then("^User should see the item removed from the list$")
public void user_should_see_the_item_removed_from_the_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.getPageSource().contains("First Item");
	driver.quit();
    
}



}
