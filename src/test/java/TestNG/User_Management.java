package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class User_Management extends testBase.TestBase {
	
	@Test (priority=1)
	public void formSettings() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		
		driver.findElement(By.xpath("//*[@id='headerDropdown']/a/span[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\" User Management\"]")).click();
		logger.info("clcicked on User Management");
		takeScreenshot.save("User Management");
		
		driver.findElement(By.xpath("//a[text()=\"Update Profile\"]")).click();
		Thread.sleep(3000);
		
		WebElement profile = driver.findElement(By.xpath("//a[@id=\\\"upfile1\\\"]"));
		// Scroll to the element using JavaScript
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", profile);
		
		// Find the element using its locator strategy
		WebElement element = driver.findElement(By.xpath("//a[@id=\"upfile1\"]"));

		// Wait for the element to be clickable for up to 10 seconds
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));

		// If the element is clickable, perform the desired action
		if (clickableElement != null) {
		  clickableElement.click();
		  // Perform other actions on the element
		} else {
		  // Handle the case where the element is not clickable
		}
		
		//UserName
		WebElement user = driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		user.click(); user.clear(); user.sendKeys("Testing");
		
		//Mobile
		WebElement mobile = driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		mobile.click(); mobile.clear(); mobile.sendKeys("9090909090");
		
		WebElement save = driver.findElement(By.xpath("//button[text()=\"Save\"]"));
		// Scroll to the element using JavaScript
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", save);
		save.click();
		
		
		driver.findElement(By.xpath("//button[text()=\"Got It !\"]")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
	}
		

}
