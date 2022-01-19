package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class ChartTab extends Base {
	
	public WebDriver driver;
	
	By indicators = By.xpath(getProperty("chartTab", "indicators"));
	By comparison = By.xpath(getProperty("chartTab", "comparison"));
	
	public ChartTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement indicatorsBtn() {
		return driver.findElement(indicators);
	}
	
	public WebElement comparisonBtn() {
		return driver.findElement(comparison);
	}

}
