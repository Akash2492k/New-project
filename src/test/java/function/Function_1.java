package function;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;


import bace_Package.Base;

public class Function_1 extends Base {
	

	@Test
	public void test1()
	{
		driver.findElement(By.id("input-username")).sendKeys("admin1");
		driver.findElement(By.id("input-password")).sendKeys("pointofsale1");
		driver.findElement(By.xpath("//button[@name='login-button']")).click();
		Reporter.log("Executing test2....",true);
		
	}

	@Test
	public void test2()
	{
		driver.findElement(By.id("input-username")).sendKeys("admin1");
		driver.findElement(By.id("input-password")).sendKeys("pointofsale1");
		driver.findElement(By.xpath("//button[@name='login-button']")).click();
		Reporter.log("Executing test2....",true);
		
	}

	@Test
	public void test3() 
	{
	
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//button[@name='login-button']")).click();
		Reporter.log("Executing test1....",true);
			
	}
	

}
