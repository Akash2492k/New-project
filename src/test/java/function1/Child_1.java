package function1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Child_1 extends Parent {
	@Test
	public void test1()
	{
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-username")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//button[@name='login-button']"));
		Reporter.log("Executing test1....",true);
			
	}

}
