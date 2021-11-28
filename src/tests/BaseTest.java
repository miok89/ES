package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
import pages.TrelloHomePage;

public class BaseTest {
	
	WebDriver driver;
	
	//pages:
	LoginPage loginPage;
	TrelloHomePage trelloHomePage;
	
	//variables:
	String email;
	String password;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		this.driver = new ChromeDriver();
		
		this.loginPage = new LoginPage(driver);
		
		this.trelloHomePage = new TrelloHomePage(driver);

		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
		System.out.println("The end");
	}
	
}
