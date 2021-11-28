package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	WebElement loginPage;
	
	List<WebElement> bottomFormLink;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getEnterEmailLbl() {
		return driver.findElement(By.id("user"));
	}
	
	public void navigateToEnterEmailLbl() {	
		getEnterEmailLbl().click();
	}
	
	public WebElement getEnterPasswordLbl() {
		return driver.findElement(By.id("password"));
	}
	
	public void navigateToEnterPasswordLbl() {	
		getEnterPasswordLbl().click();
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(By.id("login"));
	}
	
	public void navigateToLoginBtn() {	
		getLoginBtn().click();
	}
	
	public WebElement getLoginSubmitBtn() {
		return driver.findElement(By.id("login-submit"));
	}
	
	public void navigateToLoginSubmitBtn() {	
		getLoginSubmitBtn().click();
	}
	
	public WebElement getErrorMsg() {
		return driver.findElement(By.id("error"));
	}
	
	public WebElement getLoginErrorMsg() {
		return driver.findElement(By.id("login-error"));
	}
	
	public List<WebElement> getBottomFormLink() {
		
		return driver.findElements(By.className("bottom-form-link"));
	}
	
	public void navigateToCantLoginBtn() {	
		getBottomFormLink().get(0).click();
	}
	
	public WebElement getRecoveryEmailLbl() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getSendRecoveryBtn() {
		return driver.findElement(By.id("submit"));
	}
	
	public void navigateToSendRecoveryBtn() {	
		getSendRecoveryBtn().click();
	}
	
	public WebElement getAtlassianAccountBtn() {
		return driver.findElement(By.id("aa-forgot-link"));
	}
	
	public void navigateToAtlassianAccountBtn() {	
		getAtlassianAccountBtn().click();
	}
	
	public WebElement getSendRecoveryLinkBtn() {
		return driver.findElement(By.id("reset-password-email-submit"));
	}
	
	public void navigateToSendRecoveryLinkBtn() {	
		getSendRecoveryLinkBtn().click();
	}
	
	public WebElement getResndRecoveryLinkBtn() {
		return driver.findElement(By.id("reset-password-resend"));
	}
}
