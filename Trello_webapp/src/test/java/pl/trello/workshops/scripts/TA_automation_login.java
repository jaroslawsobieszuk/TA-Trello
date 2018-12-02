package pl.trello.workshops.scripts;

import org.junit.Test;

import org.junit.Assert;
import pl.trello.workshop.base.BaseTest;
import pl.trello.workshop.pages.DashboardPage;
import pl.trello.workshop.pages.LoginPage;
import pl.trello.workshop.pages.MainPage;

public class TA_automation_login extends BaseTest{

	@Test
	public void loginUser() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickInLoginBtn();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.fillOutUserField("matrix_56@wp.pl");
		loginPage.fillOutPasswordField("12345678");
		loginPage.clickLoginBtn();
		DashboardPage dashBoard = new DashboardPage(driver);
		dashBoard.clickMainPage();
		
		String expected = "Tablice | Trello";
		String actual = driver.getTitle();
		Assert.assertEquals("Login correct",expected, actual);
	}

}
