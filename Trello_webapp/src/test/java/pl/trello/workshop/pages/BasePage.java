package pl.trello.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected WebElement element;
		
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	protected void click(By location) {
		driver.findElement(location).click();
		
	}
	protected void waitForElementClicable(By location) {  //metoda do oczekiwania a¿ element na stronie zostanie wczytany i mo¿liwy do klikniêcia
		wait = new WebDriverWait(driver,30); 
		element = wait.until(ExpectedConditions.elementToBeClickable(location));
	}
	protected void setTextField(By location, String value) {
		driver.findElement(location).sendKeys(value);
	}

}
