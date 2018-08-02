package DotDash.ToDoList.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveListElement {
	
WebDriver driver;
	
	public RemoveListElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul//li[12]")
	WebElement check;
	
	public WebElement checkbox() {
	 return check;
 }
	
	@FindBy(xpath="//input[@value=\"Remove\"]")
	WebElement Remove;
	
	public WebElement Rbutton() {
	 return Remove;

}
}