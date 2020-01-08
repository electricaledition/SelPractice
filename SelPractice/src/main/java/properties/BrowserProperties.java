package properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserProperties {
	
	public WebDriver getChromeWebdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balasti's\\SeleniumWorkspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
		return driver;
	}

}
