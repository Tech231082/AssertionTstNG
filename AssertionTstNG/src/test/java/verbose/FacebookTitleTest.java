package verbose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTitleTest {
	static WebDriver driver;
	
	@BeforeMethod
	public static void initial() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");

		// launching chrome browser
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	}
	
	@Test
	public void googleTitleTest1() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	}
	
	@Test
	public void googleTitleTest2() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	}
	
	@Test
	public void googleTitleTest3() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook - Log In or Sign Up12");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
