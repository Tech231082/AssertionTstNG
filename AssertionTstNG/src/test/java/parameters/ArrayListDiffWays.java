package parameters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayListDiffWays {
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		
	}
	
	@Test
	public void test() {
		WebElement dropDown=driver.findElement(By.id("gh-cat"));
		Select select=new Select(dropDown);
		
		List<WebElement> list=select.getOptions();
		System.out.println(list.size());
		
		//using java 8 for each loop
		System.out.println("using java 8 for each loop");
		
		list.forEach(options -> {
			
		System.out.println(options);
		});
		
		
		
		//using iterator
		System.out.println("using iterator");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//using iterator and java 8 lambda and for each reamaining method
		System.out.println("using iterator and java 8 lambda and for each reamaining method");
		it.forEachRemaining(options -> {
			System.out.println(options);
		});
		
		//using for each loop
		System.out.println("using for each loop");
		for(WebElement op:list) {
			System.out.println(op);
		}
		//using for loop
		System.out.println("using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

	
	
}
