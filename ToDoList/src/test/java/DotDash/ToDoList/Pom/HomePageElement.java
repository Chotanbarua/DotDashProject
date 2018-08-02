package DotDash.ToDoList.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElement {
	
		WebDriver driver;
		
		public HomePageElement(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="label-first")
		WebElement title;
		
		public WebElement Title() {
		 return title;
	 }
	

	}
