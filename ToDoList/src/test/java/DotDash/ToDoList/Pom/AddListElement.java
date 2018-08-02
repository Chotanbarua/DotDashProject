package DotDash.ToDoList.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddListElement {
	
	WebDriver driver;
	
	public AddListElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="data")
	WebElement listAdd;
	
	public WebElement AList() {
	 return listAdd;
 }
	@FindBy(xpath="//input[@value=\"Add\"]")
	WebElement Addbutton;
	
	public WebElement AddB() {
	 return Addbutton;
 }


}
