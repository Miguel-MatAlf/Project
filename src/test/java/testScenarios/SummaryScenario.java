package testScenarios;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import pageObjects.LandingPage;
import pageObjects.SummaryTab;

public class SummaryScenario extends Base{
	
	@BeforeMethod
	public void goToURL() {
		driver = initializeDriver();
		driver.manage().window().maximize();
		String URL = getProperty("configuration", "url");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@AfterMethod
	public void tearDown() { 
		driver.quit(); 
	}
	
	@Test
	public void verifyURLTitle() {
		LandingPage LP = new LandingPage(driver);
		String actual = LP.getTitle();
		String expected = getProperty("landingPage", "title");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyHeader() {
		LandingPage LP = new LandingPage(driver);
		String actual = LP.header().getText();
		String expected = getProperty("landingPage", "headerText");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifySummaryTabOpens() {
		SummaryTab ST = new SummaryTab(driver);
		
		Assert.assertTrue(ST.summaryTable().isDisplayed());
	}
	
	@Test
	public void verifyFullScreenAndBack() {
		LandingPage LP = new LandingPage(driver);
		SummaryTab ST = new SummaryTab(driver);
		ST.fullScreenBtn().click();
		String actual = ST.header().getText();
		String expected = getProperty("summaryTab", "headerText");
		ST.backBtn().click();
		String actual2 = LP.header().getText();
		String expected2 = getProperty("landingPage", "headerText");
		Assert.assertTrue(actual.equals(expected) && actual2.equals(expected2));
	}
	
	@Test
	public void verifySummaryTable() {
		SummaryTab ST = new SummaryTab(driver);
		Assert.assertTrue(ST.verifyTableRows());
	}

}