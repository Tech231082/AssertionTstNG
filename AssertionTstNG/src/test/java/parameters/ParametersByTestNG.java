package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersByTestNG {
	
	static WebDriver driver;
	
	@Test
	@Parameters({"browser","email","password"})
	public void loginAmazon(String browser,String email,String password) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");

			// launching chrome browser
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");

			// launching ff browser
			driver = new FirefoxDriver();
		}
		
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys(email);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		
		driver.findElement(By.id("signInSubmit")).click();
		

	}

}
