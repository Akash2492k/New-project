package function1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent {
	public WebDriver driver;
	
	@BeforeMethod
	public void bm()
	{
	    driver=new ChromeDriver();
	    driver.get("https://pos.aksharatraining.in/pos/public/");
	}
	
	@AfterMethod
	public void am()
	{
		driver.quit();
	}

}
