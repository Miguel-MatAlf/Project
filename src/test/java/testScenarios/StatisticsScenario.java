package testScenarios;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import pageObjects.LandingPage;
import pageObjects.StatisticsTab;

public class StatisticsScenario extends Base{
	
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
	public void verifyStatisticsTab() {
		LandingPage LP = new LandingPage(driver);
		StatisticsTab StatsTab = new StatisticsTab(driver);
		
		LP.statisticsTab().click();
		Assert.assertEquals(StatsTab.validationMeasuresTitle().getText(), getProperty("statisticsTab", "valuationMeasuresText"));	
	}

}
