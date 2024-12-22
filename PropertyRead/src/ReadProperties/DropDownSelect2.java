package ReadProperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DropDownSelect2 {

	@Test
	public void dropDownSelect2() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://trytestingthis.netlify.app");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> allAvailableOption = driver.findElements(By.id("option"));
		
		for(WebElement value : allAvailableOption)  {
		
			if(value.getText().equalsIgnoreCase("option 2"))
				value.click();
			Thread.sleep(5000);
			
			
		}
		
		
		driver.quit();
		
	}
	
}
