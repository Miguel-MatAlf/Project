package testScenarios;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import pageObjects.FinancialsTab;
import pageObjects.LandingPage;

public class FinancialsScenario extends Base {
	
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
	public void verifyFinancialsTab() {
		LandingPage LP = new LandingPage(driver);
		FinancialsTab FT = new FinancialsTab(driver);
				
		LP.financialsTab().click();
		Assert.assertEquals(FT.header().getText(), getProperty("financialsTab", "headerText"));
	}

}
