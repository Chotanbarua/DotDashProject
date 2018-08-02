package DotDash.ToDoList.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCatagoryElement {
	WebDriver driver;
	
	public AddCatagoryElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="categorydata")
	WebElement CatAdd;
	
	public WebElement AddCat() {
	 return CatAdd;
 }
	@FindBy(xpath="//input[@value=\"Add category\"]")
	WebElement AddCatbutton;
	
	public WebElement AddCB() {
	 return AddCatbutton;
 }

}
