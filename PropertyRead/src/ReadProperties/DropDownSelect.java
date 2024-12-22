package ReadProperties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSelect {
	
	@Test
	public void DropDownSelectMethod() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://trytestingthis.netlify.app");
		WebElement selectOption = driver.findElement(By.id("option"));
		Select selectElement = new Select(selectOption);
		selectElement.selectByIndex(3);
		Thread.sleep(20);
		selectElement.selectByValue("option 2");
		Thread.sleep(20);
		selectElement.selectByVisibleText("Option 1");
		Thread.sleep(20);
		driver.quit();
		
		
		
		
		
		
	}

}
