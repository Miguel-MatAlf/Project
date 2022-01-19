package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class HoldersTab extends Base {
	
	public WebDriver driver;
	
	By mjt = By.xpath(getProperty("holdersTab", "majorHoldersTab"));
	
	public HoldersTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement majorHoldersTab() {
		return driver.findElement(mjt);
	}

}
