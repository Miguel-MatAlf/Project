package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class FinancialsTab extends Base{
	
	public WebDriver driver;
	
	By header = By.xpath(getProperty("profileTab", "header"));
	
	public FinancialsTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement header() {
		return driver.findElement(header);
	}

}
