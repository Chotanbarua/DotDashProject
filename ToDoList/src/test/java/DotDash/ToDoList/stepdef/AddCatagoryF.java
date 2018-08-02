package DotDash.ToDoList.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DotDash.ToDoList.Pom.AddCatagoryElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCatagoryF {
    WebDriver driver;
	
	@Given("^Home page TODO is open$")
	public void Home_page_TODO_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/dotdash-project/index.php");
	    
	}

	@When("^User enter catagory name in catagory text field$")
	public void user_enter_catagory_name_in_catagory_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AddCatagoryElement AC = new AddCatagoryElement(driver);
		AC.AddCat().clear();
		AC.AddCat().sendKeys("First Cat");
	    
	}

	@When("^User hit addcatagory button$")
	public void user_hit_addcatagory_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AddCatagoryElement AC = new AddCatagoryElement(driver);
		AC.AddCB().click();
	    
	}

	@Then("^User should see the added item in the catagory section$")
	public void user_should_see_the_added_item_in_the_catagory_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.getPageSource().contains("First Cat");
		driver.close();
		
	}

	
}
