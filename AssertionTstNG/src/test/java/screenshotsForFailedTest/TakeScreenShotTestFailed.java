package screenshotsForFailedTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;


@Listeners(CustomListener.class)
public class TakeScreenShotTestFailed extends BaseTestForFailedTest{
	@BeforeMethod
	public void setUp() {
		initial();

	}

	@Test
	public void takeScreenshotFailedTest() {
		
		Assert.assertEquals(false, true);

	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
