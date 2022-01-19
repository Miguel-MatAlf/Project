package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class StatisticsTab extends Base {
	
	public WebDriver driver;
	
	By title = By.xpath(getProperty("statisticsTab", "valuationMeasures"));
	
	public StatisticsTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement validationMeasuresTitle() {
		return driver.findElement(title);
	}

}
