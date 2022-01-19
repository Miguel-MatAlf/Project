package testScenarios;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import pageObjects.AnalysisTab;
import pageObjects.LandingPage;

public class AnalysisScenario extends Base {
	
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
	public void verifyAnalysisTab() {
		LandingPage LP = new LandingPage(driver);
		AnalysisTab AT = new AnalysisTab(driver);
				
		LP.analysisTab().click();
		Assert.assertEquals(AT.earningsEstimate().getText(), getProperty("analysisTab", "earningsEstimateText"));
	}

}
