package myTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	SoftAssert sa=new SoftAssert();
	
	static WebDriver driver;
	@BeforeMethod
	public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		//launching chrome browser
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
	}
	
	@Test
	public void assertionTest() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
		sa.assertEquals(title, "1MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights &amp; Holiday","  Title is not correct");
		
		System.out.println("No issues i m still running");
		
		sa.assertAll();
	}
	
	@Test
	public void assertionTest1() {
		String title=driver.getTitle();
		System.out.println(title);
		
		sa.assertEquals(title, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights &amp; Holiday","  Title is not correct");
		
		System.out.println("No worries");
		
		//sa.assertAll();
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
