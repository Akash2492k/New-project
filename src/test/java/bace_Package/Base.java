package bace_Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	
	@BeforeMethod
	public void bm()
	{
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://pos.aksharatraining.in/pos/public/");
	}
	
	@AfterMethod
	public void am()
	{
		String title = driver.getTitle();
		Reporter.log(title,true);
		if(title.contains("Powered by OSPOS"))
		{ 
			Reporter.log("Home page displayed",true);
		}
		else
		{
			Reporter.log("Home page not displayed",true);
		}
		driver.quit();
	}

}
