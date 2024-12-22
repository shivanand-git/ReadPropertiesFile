package ReadProperties;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ApplicationLogin {
	
	@Test
	public void ApplicationLogin1() throws IOException  {
		ReadPropertyFile getProp = new ReadPropertyFile();
		String appBrowser =getProp.readProperty("browser");
		if(appBrowser.equals("Firefox"))
		{
		
		
		
		
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		
		
			String appURL = getProp.readProperty("url");
			driver.get(appURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement user = driver.findElement(By.id("user-name"));
			user.sendKeys(getProp.readProperty("userName"));
		
			WebElement pwd = driver.findElement(By.id("password"));
			pwd.sendKeys(getProp.readProperty("password1"));
			driver.findElement(By.id("login-button")).click();
		
			driver.quit();
		
		}	
		
	}

}
