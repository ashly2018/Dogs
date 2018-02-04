package automationFramework.dice.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationFramework.dice.base.BasePageObject;

public class LoginPage extends BasePageObject<LoginPage> {
	private static final String URL = "https://www.dice.com/dashboard/logout";
	private By emailField = By.xpath("//input[@id = 'email']");
	private By passwordField = By.xpath("//input[@id ='password']");
	private By submitButton = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver, Logger log) {
		super(driver, log);
		
	}
	
	public void openLoginPage(){
		getPage(URL);
	}
	
	public void fillUpEmailAndPassword(String email, String password){
		log.info("Filling up email and password.");
		type(email, emailField);
		type(password, passwordField);
	}
	
	public ProfilePage pushSignInButton(){
		log.info("Clicking on sign in button.");
		click(submitButton);
		return new ProfilePage(driver, log);
		
		
	}
	
}
