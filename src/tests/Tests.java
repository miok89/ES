package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
	
	@BeforeMethod
	public void setup() throws InterruptedException {
	
		driver.navigate().to("https://trello.com/en/login");
	}
	
	@Test (priority = 0)
	public void LoginWithValidRegistratedCredentials() throws InterruptedException {
		
		loginPage.getEnterEmailLbl().sendKeys("marko.miok@yahoo.com");
		Thread.sleep(1000);
		
		loginPage.navigateToLoginBtn();
		Thread.sleep(1000);
		
		loginPage.getEnterPasswordLbl().sendKeys("Testing11");
		Thread.sleep(1000);
	
		loginPage.navigateToLoginSubmitBtn();
		Thread.sleep(4000);
		
		trelloHomePage.navigateToProfileBtn();
		Thread.sleep(1000);
		
		assertEquals(trelloHomePage.getLogoutBtn().isDisplayed(), true);
		Thread.sleep(1000);
		
		trelloHomePage.navigateToLogoutBtn();
		Thread.sleep(1000);
		
		trelloHomePage.navigateToLogoutSubmitBtn();
		Thread.sleep(3000);
	}
	
	@Test (priority = 5)
	public void LoginWithInvalidEmail() throws InterruptedException {
		
		loginPage.getEnterEmailLbl().sendKeys("marko.miok#yahoo");
		Thread.sleep(1000);
		
		loginPage.getEnterPasswordLbl().sendKeys("Testing11");
		Thread.sleep(1000);
	
		loginPage.navigateToLoginBtn();
		Thread.sleep(1000);
			
		Assert.assertEquals(loginPage.getErrorMsg().getText(), "There isn't an account for this username");
		Thread.sleep(1000);
	}
	
	@Test (priority = 10)
	public void LoginWithValidNotRegistratedEmail() throws InterruptedException {
		
		loginPage.getEnterEmailLbl().sendKeys("marko.miok12345@yahoo.com");
		Thread.sleep(1000);
		
		loginPage.getEnterPasswordLbl().sendKeys("Testing1M");
		Thread.sleep(1000);
	
		loginPage.navigateToLoginBtn();
		Thread.sleep(1000);
			
		Assert.assertEquals(loginPage.getErrorMsg().getText(), "There isn't an account for this email");
		Thread.sleep(1000);
	}
	
	@Test (priority = 15)
		public void LoginWithValidRegistratedEmailAndInvalidPassword() throws InterruptedException {
			
			loginPage.getEnterEmailLbl().sendKeys("marko.miok@yahoo.com");
			Thread.sleep(1000);
			
			loginPage.navigateToLoginBtn();
			Thread.sleep(3000);
			
			loginPage.getEnterPasswordLbl().sendKeys("Testing1MM");
			Thread.sleep(1000);
		
			loginPage.navigateToLoginSubmitBtn();
			Thread.sleep(1000);
			
			assertEquals(loginPage.getLoginErrorMsg().isDisplayed(), true);
			Thread.sleep(1000);
		}


	@AfterMethod
	public void afterTest() throws InterruptedException {
		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();	
	}
}
