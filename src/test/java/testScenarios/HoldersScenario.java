package testScenarios;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import pageObjects.HoldersTab;
import pageObjects.LandingPage;

public class HoldersScenario extends Base {
	
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
	public void verifyHoldersTab() {
		LandingPage LP = new LandingPage(driver);
		HoldersTab HoldTab = new HoldersTab(driver);
		
		LP.holdersTab().click();
		Assert.assertEquals(HoldTab.majorHoldersTab().getText(), getProperty("holdersTab", "majorHoldersTabText"));
	}

}
