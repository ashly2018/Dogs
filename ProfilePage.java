package automationFramework.dice.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationFramework.dice.base.BasePageObject;

public class ProfilePage extends BasePageObject<ProfilePage> {
	private By editProfileButton = By.xpath("//button[@id = 'editProfile']");
	private By advancedSearchButton = By.xpath("//a[@class = 'dice-btn-link']");
//	private By profileContactNameText = By.xpath("//h1[@class = 'profile-contact-name']");
	public ProfilePage(WebDriver driver, Logger log) {
		super(driver, log);
		
	}
	public void waitForProfilePageToLoad(){
		log.info("Waiting For Profile Page To Load");
		waitForVisibilityOf(editProfileButton);
		waitForVisibilityOf(advancedSearchButton, 10);
	}
	
//	public boolean isCorrectProfileLoaded(String correctProfileName){
//		if  (getText(profileContactNameText).equals(correctProfileName)){
//			return true;
//		}
//		return false;
//	}

}
//parallel = "tests"  thread-count="2"