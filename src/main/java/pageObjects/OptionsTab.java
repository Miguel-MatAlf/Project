package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class OptionsTab extends Base{
	
	public WebDriver driver;
	
	By calls = By.xpath(getProperty("optionsTab", "calls"));
	
	public OptionsTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement calls() {
		return driver.findElement(calls);
	}

}
