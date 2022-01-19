package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class LandingPage extends Base{
	
	public WebDriver driver;
	
	By header = By.xpath(getProperty("landingPage", "header"));
	By summaryTab = By.xpath(getProperty("landingPage", "summaryTab"));
	By chartTab = By.xpath(getProperty("landingPage", "chartTab"));
	By conversationsTab = By.xpath(getProperty("landingPage", "conversationsTab"));
	By statisticsTab = By.xpath(getProperty("landingPage", "statisticsTab"));
	By historicalTab = By.xpath(getProperty("landingPage", "historicalTab"));
	By profileTab = By.xpath(getProperty("landingPage", "profileTab"));
	By financialsTab = By.xpath(getProperty("landingPage", "financialsTab"));
	By analysisTab = By.xpath(getProperty("landingPage", "analysisTab"));
	By optionsTab = By.xpath(getProperty("landingPage", "optionsTab"));
	By holdersTab = By.xpath(getProperty("landingPage", "holdersTab"));
	By sustainabilityTab = By.xpath(getProperty("landingPage", "sustainabilityTab"));

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}
	
	public WebElement header() {
		return driver.findElement(header);
	}
	
	public WebElement summaryTab() {
		return driver.findElement(summaryTab);
	}
	
	public WebElement chartTab() {
		return driver.findElement(chartTab);
	}
	
	public WebElement conversationsTab() {
		return driver.findElement(conversationsTab);
	}
	
	public WebElement statisticsTab() {
		return driver.findElement(statisticsTab);
	}
	
	public WebElement historicalTab() {
		return driver.findElement(historicalTab);
	}
	
	public WebElement profileTab() {
		return driver.findElement(profileTab);
	}
	
	public WebElement financialsTab() {
		return driver.findElement(financialsTab);
	}
	
	public WebElement analysisTab() {
		return driver.findElement(analysisTab);
	}
	
	public WebElement optionsTab() {
		return driver.findElement(optionsTab);
	}
	
	public WebElement holdersTab() {
		return driver.findElement(holdersTab);
	}
	
	public WebElement sustainabilityTab() {
		return driver.findElement(sustainabilityTab);
	}

}
