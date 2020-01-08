package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.LoginLogoutPage;
import properties.BrowserProperties;
import static utilities.urlAddress.*;


public class AdminLoginLogout {
	BrowserProperties bp = new BrowserProperties();
	WebDriver driver = bp.getChromeWebdriver();
	LoginLogoutPage onPage = new LoginLogoutPage(driver);
	
	@BeforeSuite
	private void openBrowser() {
		driver.get(BASE_URL);
	}
	
	@Test
	public void loginAdminPage() {						
		onPage.emailPath().sendKeys(USER_NAME);
		onPage.passwordPath().sendKeys(PASSWORD);
		onPage.loginbtnPath().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Dashboard"));
		Assert.assertEquals( driver.getTitle(),"Dashboard");
	}

	@Test(dependsOnMethods = { "loginAdminPage" })
	public void logoutAdminPage() {				
		onPage.logoutPath().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Administator Login"));
		Assert.assertEquals( driver.getTitle(),"Administator Login");
	}
	
	@AfterSuite
	private void closeBrowser() {
		driver.close();
	}
}
