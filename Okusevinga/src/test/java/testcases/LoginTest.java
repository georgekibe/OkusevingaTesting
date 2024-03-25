package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public static void Login() {
		driver.findElement(By.xpath("//button[@id='signin-button']")).click();
		driver.findElement(By.id("Username")).sendKeys("TestFundmanager");
		driver.findElement(By.id("Password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		
		driver.findElement(By.xpath("//i[@class='fa fa-desktop']")).click();
	}
}
