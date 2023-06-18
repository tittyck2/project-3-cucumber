package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src\\test\\resources\\features",
	glue ="steps",
	tags = "@WhiteBackgroundFeature",
	monochrome = true,
	dryRun = false,
	plugin = {
			"pretty",
			
			
	}
		
		
		)

public class ExamRunner {
	
	

}
