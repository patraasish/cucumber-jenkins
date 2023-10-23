package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace-new\\Phase2-End-Project1\\src\\test\\java\\features\\starHealth.feature",
glue= {"step"},
plugin= {"html:target/Cucumberreport.html",
		 "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"		
})
public class StarHealthTestRunner {
	
	
	
}
