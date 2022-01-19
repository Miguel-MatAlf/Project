package testScenarios;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import pageObjects.ConversationsTab;
import pageObjects.LandingPage;

public class ConversationsScenario extends Base {
	
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
	public void verifyConversationsTabs() {
		LandingPage LP = new LandingPage(driver);
		ConversationsTab ConvT = new ConversationsTab(driver);
				
		LP.conversationsTab().click();
		Assert.assertEquals(ConvT.startConversationBtn().getText(), getProperty("conversationsTab", "startConvText"));
	}

}
