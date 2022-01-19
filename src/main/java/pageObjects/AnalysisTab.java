package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class AnalysisTab extends Base{
	
	public WebDriver driver;
	
	By earnings = By.xpath(getProperty("analysisTab", "earningsEstimate"));
	
	public AnalysisTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement earningsEstimate() {
		return driver.findElement(earnings);
	}

}
