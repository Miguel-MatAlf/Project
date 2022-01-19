package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClasses.Base;

public class ConversationsTab extends Base {
	
	public WebDriver driver;
	
	By btn = By.xpath(getProperty("conversationsTab", "startConvButton"));
	
	public ConversationsTab(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement startConversationBtn() {
		return driver.findElement(btn);
	}

}
