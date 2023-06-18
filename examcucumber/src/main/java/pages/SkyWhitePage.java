package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkyWhitePage {
	
	WebDriver driver;
	
	public SkyWhitePage(WebDriver driver) {
		
		this.driver = driver;
	}

	
	
	By skyWhite = By.xpath("//button[text() = 'Set White Background']");

	public void clickOnSkyBWhiteBackgroundButton() {
		
		driver.findElement(skyWhite);
		
	}

}
