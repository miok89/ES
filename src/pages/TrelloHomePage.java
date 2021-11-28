package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrelloHomePage {
	
	WebDriver driver;
	
	WebElement TrelloHomePage;

	public TrelloHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//custom x-path:
	//button[@data-test-id="header-member-menu-logout"]
	public WebElement getLogoutBtn() {
		return driver.findElement(By.xpath("//button[@data-test-id=\"header-member-menu-logout\"]"));
	}
		
	public void navigateToLogoutBtn() {	
		getLogoutBtn().click();
	}
		
	public WebElement getProfileBtn() {
		return driver.findElement(By.className("_2LKdO6O3n25FhC"));
	}
		
	public void navigateToProfileBtn() {	
		getProfileBtn().click();
	}
	
	public WebElement getLogoutSubmitBtn() {
		return driver.findElement(By.id("logout-submit"));
	}
	
	public void navigateToLogoutSubmitBtn() {	
		getLogoutSubmitBtn().click();
	}
}
