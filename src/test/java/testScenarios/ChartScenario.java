package testScenarios;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import pageObjects.ChartTab;
import pageObjects.LandingPage;

public class ChartScenario extends Base{
	
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
	public void verifyChartTab() {
		LandingPage LP = new LandingPage(driver);
		ChartTab CT = new ChartTab(driver);
				
		LP.chartTab().click();
		Assert.assertTrue(CT.indicatorsBtn().isDisplayed() && CT.comparisonBtn().isDisplayed());		
	}

}
