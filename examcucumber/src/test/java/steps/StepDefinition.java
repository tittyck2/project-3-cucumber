package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SkyBluePage;
import pages.SkyWhitePage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	
	SkyBluePage loginPage;

	
	@Given("Set Sky Blue Background button exists")

	public void set_Sky_Blue_Background_button_exists() {
		initDriver();
		driver.get("http://techfios.com/test/108/");

	}

	@When("I click on the button")
	public void i_click_on_the_button() {
		loginPage = PageFactory.initElements(driver, SkyBluePage.class);
		loginPage.clickOnSkyBlueBackgroundButton();
		
	}

	@Then("The background colour will change to Sky Blue")
	public void the_background_colour_will_change_to_Sky_Blue() {

	}
	
	@Given("Set SkyWhite Background")
	public void set_SkyWhite_Background() {
	    
	}

	@Then("The background colour will change to white")
	public void the_background_colour_will_change_to_white() {
	    
	}

}
