package pl.trello.workshop.base;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;

	@BeforeClass
	public static void SetUpClass() {
		WebDriverManager.chromedriver().setup(); //Konfiguracja sterownika
	}
	@Before
	public void setUpTest() {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();  // maksymalizacja okna przegl�darki przed ka�dym testem
	}
	@After
	public void TearDown() {
		if (driver!= null)     // je�eli przegl�darka jest uruchumiona zamykamy j� po zako�czeniu ka�dego testu
			driver.quit();
	} 

}