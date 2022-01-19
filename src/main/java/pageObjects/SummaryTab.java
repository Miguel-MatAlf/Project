package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class SummaryTab extends Base{
	
	public WebDriver driver;
	
	By summaryTable = By.xpath(getProperty("summaryTab", "summaryTable"));
	By previousClose = By.xpath(getProperty("summaryTab", "previousClose"));
	By open = By.xpath(getProperty("summaryTab", "open"));
	By bid = By.xpath(getProperty("summaryTab", "bid"));
	By ask = By.xpath(getProperty("summaryTab", "ask"));
	By daysRange = By.xpath(getProperty("summaryTab", "daysRange"));
	By weekRange = By.xpath(getProperty("summaryTab", "weekRange"));
	By volume = By.xpath(getProperty("summaryTab", "volume"));
	By avgVolume = By.xpath(getProperty("summaryTab", "avgVolume"));
	By marketCap = By.xpath(getProperty("summaryTab", "marketCap"));
	By betaMonthly = By.xpath(getProperty("summaryTab", "betaMonthly"));
	By PERatioTTM = By.xpath(getProperty("summaryTab", "PERatioTTM"));
	By EPSTTM = By.xpath(getProperty("summaryTab", "EPSTTM"));
	By earningsDate = By.xpath(getProperty("summaryTab", "earningsDate"));
	By forwardDividendYield = By.xpath(getProperty("summaryTab", "forwardDividendYield"));
	By exDividendDate = By.xpath(getProperty("summaryTab", "exDividendDate"));
	By targetEst = By.xpath(getProperty("summaryTab", "targetEst"));
	By fullScreenBtn = By.xpath(getProperty("summaryTab", "fullScreenBtn"));
	By backBtn = By.xpath(getProperty("summaryTab", "backBtn"));
	By header = By.xpath(getProperty("summaryTab", "header"));
	
	public SummaryTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement summaryTable() {
		return driver.findElement(summaryTable);
	}
	
	public boolean verifyTableRows() {
		return (driver.findElement(previousClose).isDisplayed() && driver.findElement(marketCap).isDisplayed() &&
				driver.findElement(open).isDisplayed() && driver.findElement(betaMonthly).isDisplayed() &&
				driver.findElement(bid).isDisplayed() && driver.findElement(PERatioTTM).isDisplayed() &&
				driver.findElement(ask).isDisplayed() && driver.findElement(EPSTTM).isDisplayed() &&
				driver.findElement(daysRange).isDisplayed() && driver.findElement(earningsDate).isDisplayed() &&
				driver.findElement(weekRange).isDisplayed() && driver.findElement(forwardDividendYield).isDisplayed() &&
				driver.findElement(volume).isDisplayed() && driver.findElement(exDividendDate).isDisplayed() &&
				driver.findElement(avgVolume).isDisplayed() && driver.findElement(targetEst).isDisplayed()
				);
	}
	
	public WebElement fullScreenBtn() {
		return driver.findElement(fullScreenBtn);
	}
	
	public WebElement backBtn() {
		return driver.findElement(backBtn);
	}
	
	public WebElement header() {
		return driver.findElement(header);
	}

}
