package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest {

	ChromeDriver driver;

	@Test
	public void login() {

		// open chrome
		driver = new ChromeDriver();

		// open login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// wait mechanism
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// click on login btn
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void testAdmin() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		boolean isDisplayed = driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
		Assert.assertTrue(isDisplayed);
	}

	@Test
	public void testLogout() {
		driver.findElement(
				By.xpath("//span[@class='oxd-userdropdown-tab']/descendant::p[@class='oxd-userdropdown-name']"))
				.click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
