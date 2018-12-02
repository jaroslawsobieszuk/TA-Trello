package pl.trello.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{
	private By weNameField = By.id("name");
	private By weEmailField = By.id("email");
	private By wePasswordField = By.id("password");
	private By weBtnCreateAccount = By.id("signup");
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	public void fillOutNameField(String name) {
		setTextField(weNameField, name);
	}
	public void fillOutEmailField(String email) {
		setTextField(weEmailField, email);
	}
	public void fillOutPasswordField(String password) {
		setTextField(wePasswordField, password);
	}
	public RegistrationPage clickCreateBtn() {
		click(weBtnCreateAccount);
		return this;
	}

}
