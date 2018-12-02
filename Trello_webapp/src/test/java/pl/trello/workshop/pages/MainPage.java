package pl.trello.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
	private By weRegistrationBtn = By.xpath("//a[@class='global-header-section-button mod-primary']");
	private By weLoginBtn = By.xpath("//a[@class = 'global-header-section-button']");
	
	public MainPage(WebDriver driver) {
		super(driver);
		driver.get("https://trello.com/");
	}
	
	public RegistrationPage clickInRegistrationBtn() {
		waitForElementClicable(weRegistrationBtn);
		click(weRegistrationBtn);
		return new RegistrationPage(driver);
	}
	
	public LoginPage clickInLoginBtn() {
		waitForElementClicable(weLoginBtn);
		click(weLoginBtn);
		return new LoginPage(driver);
	}
}
