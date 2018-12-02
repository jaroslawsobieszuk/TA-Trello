package pl.trello.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	
	private By weLogin = By.id("user");
	private By wePassword = By.id("password");
	private By weLoginBtn = By.id("login");
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void fillOutUserField(String user) {
		setTextField(weLogin, user);
	}
	public void fillOutPasswordField(String password) {
		setTextField(wePassword, password);
	}
	public DashboardPage clickLoginBtn () {
		click(weLoginBtn);
		return new DashboardPage(driver);
	}

}
