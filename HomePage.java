package automationFramework.dice.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationFramework.dice.base.BasePageObject;

public class HomePage extends BasePageObject<LoginPage> {

	
	private static final String URL = "https://www.merieuxnutrisciences.com/us/";
	private By firstNameField = By.xpath("//input[@id='edit-submitted-first-name']");
	private By lastNameField = By.xpath("//input[@id='edit-submitted-last-name']");
	private By emailField = By.xpath("//input[@id='edit-submitted-email-address']");
	private By companyNameField = By.xpath("//*[@id='edit-submitted-company-name']");
	private By stateNameField = By.xpath("//*[@id='edit-submitted-state-province']");
	private By postalCodeField = By.xpath("//input[@id='edit-submitted-postal-code']");
	private By submitButton = By.xpath("//*[@id='webform-client-form-32']/div/div[14]/input");
	//search
	private By searchButton = By.xpath("//*[@id='edit-keys-27']");

	public HomePage(WebDriver driver, Logger log) {
		super(driver, log);

	}

	public void openHomePage() {
		getPage(URL);
	}

	public void fillUpContactForm(String firstName, String lastName, String email, String companyName, String stateName,
			String postalCode) {
		log.info("Filling up Contact Form.");
		type(firstName, firstNameField);
		type(lastName, lastNameField);
		type(email, emailField);
		type(companyName, companyNameField);
		type(stateName, stateNameField);
		type(postalCode, postalCodeField);
	}
	
	public void pushSubmitButton(){
		 log.info("Clicking on submit button.");
		 click(submitButton);
	}
	
	public void pushSearchButton(){
		log.info("Clicking on search button.");
		click(searchButton);
	}

	// public ProfilePage pushSignInButton(){
	// log.info("Clicking on sign in button.");
	// click(submitButton);
	// return new ProfilePage(driver, log);

	// }

}
