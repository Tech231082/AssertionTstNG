package screenshotsForFailedTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestForFailedTest {
	public static WebDriver driver;

	public static void initial() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");

		// launching chrome browser
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
	}

	public void failedTestScreenshot(String methodName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,
					new File("C:\\JUnit\\eclipse-workspace\\AssertionTstNG\\screenshots\\" + methodName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
