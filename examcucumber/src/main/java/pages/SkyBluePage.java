package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBluePage {
	WebDriver driver;
	
	public SkyBluePage(WebDriver driver) {
		
		this.driver = driver;
	}

	
	

	static By sky = By.xpath("//button[text() = 'Set SkyBlue Background']");

	public void clickOnSkyBlueBackgroundButton() {
		
		driver.findElement(sky).click();
		
	}
}
