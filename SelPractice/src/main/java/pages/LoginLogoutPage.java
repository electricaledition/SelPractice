package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPage {
WebDriver driver;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block ladda-button fadeIn animated btn-lg']")
	WebElement loginbtn;
	
	@FindBy(id="logout")
	WebElement logout;
	
	// constructor method
	public LoginLogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement emailPath() {
		return email;
	}
	
	public WebElement passwordPath() {
		return password;
	}
	
	public WebElement loginbtnPath() {
		return loginbtn;
	}
	
	public WebElement logoutPath() {
		return logout;
	}
	
}
