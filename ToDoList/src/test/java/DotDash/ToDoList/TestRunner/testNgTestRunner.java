package DotDash.ToDoList.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNgTestRunner {
	@CucumberOptions(
	        features = "Features",
	        glue="DotDash.ToDoList.stepdef",
	        tags= {"@Rlist"}
)
	public class TestRunner extends AbstractTestNGCucumberTests{}

}


