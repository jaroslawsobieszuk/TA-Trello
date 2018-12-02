package pl.trello.workshops.scripts;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import pl.trello.workshop.base.BaseTest;
import pl.trello.workshop.pages.MainPage;
import pl.trello.workshop.pages.RegistrationPage;

public class TA_registration_on_existing_account extends BaseTest {

	@Test
	public void registrationUser() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickInRegistrationBtn();
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.fillOutNameField("Test");
		registrationPage.fillOutEmailField("jaroslawsobieszuk94@gmail.com");
		registrationPage.fillOutPasswordField("12345678");
		registrationPage.clickCreateBtn();
		
		String expectedMessage = "E-mail jest ju¿ w u¿yciu";
		String message = driver.findElement(By.className("error-message")).getText();
		Assert.assertTrue("Your error message", message.contains(expectedMessage));
	}

}
