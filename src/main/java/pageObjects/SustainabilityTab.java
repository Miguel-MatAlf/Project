package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class SustainabilityTab extends Base{
	
	public WebDriver driver;
	
	By header = By.xpath(getProperty("sustainabilityTab", "header"));
	
	public SustainabilityTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement header() {
		return driver.findElement(header);
	}

}
