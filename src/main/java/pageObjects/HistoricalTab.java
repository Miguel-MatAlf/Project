package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class HistoricalTab extends Base {
	
	public WebDriver driver;
	
	By curr = By.xpath(getProperty("historicalTab", "currency"));
	
	public HistoricalTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement currencyText() {
		return driver.findElement(curr);
	}

}
