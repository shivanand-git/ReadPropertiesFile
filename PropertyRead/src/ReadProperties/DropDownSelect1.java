package ReadProperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect1 {
	@Test
	public void DropDownSelectEg() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://trytestingthis.netlify.app");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dropDownSelect = driver.findElement(By.id("option"));
		Select element = new Select(dropDownSelect);
		List<WebElement> allAvailableOption = element.getOptions();
		
		for(WebElement value : allAvailableOption) {
			if(value.getText().equalsIgnoreCase("option 2"))
				value.click();
			Thread.sleep(1000);
				
		}
		
		driver.quit();
	}

}
