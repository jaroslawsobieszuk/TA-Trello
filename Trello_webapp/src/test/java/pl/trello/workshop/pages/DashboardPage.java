package pl.trello.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

	private By weClickBtn = By.className("tab__tabText__212hs");
	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public void clickMainPage() {
		waitForElementClicable(weClickBtn);
		click(weClickBtn);
	}
}
