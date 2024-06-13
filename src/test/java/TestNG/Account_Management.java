package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Account_Management extends testBase.TestBase {
	
	@Test (priority=1)
	public void formSettings() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		logger.info("Logged in Successfully");
		
		driver.findElement(By.xpath("//*[@id='headerDropdown']/a/span[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\" Account Management\"]")).click();
		logger.info("clcicked on Account Management");
		takeScreenshot.save("Account_Management");
		
		
		WebElement dropdownTimeFrame = driver.findElement(By.xpath("//*[@id='SelectTimePeriod']"));
		dropdownTimeFrame.click();
		Thread.sleep(2000);
		Select dropdown  = new Select(dropdownTimeFrame);
		dropdown.selectByVisibleText("Last Month");
		Thread.sleep(3000);
		
		
		WebElement dropdownActivities = driver.findElement(By.xpath("//*[@id='SelectActivity']"));
		dropdownActivities.click();
		Thread.sleep(2000);
		Select dropdownAct  = new Select(dropdownActivities);
		dropdownAct.selectByVisibleText("User");
		Thread.sleep(3000);
		
		
		WebElement dropdownUsers = driver.findElement(By.xpath("//*[@id='SelectUserList']"));
		dropdownUsers.click();
		Thread.sleep(2000);
		Select dropdownAllUser  = new Select(dropdownUsers);
		dropdownAllUser.selectByVisibleText("vardhaman13@yopmail.com");
		Thread.sleep(3000);
		
		//Get Records
		driver.findElement(By.xpath("//div[6]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		takeScreenshot.save("Account_Management");
		
		
		//Usage Statistics
		driver.findElement(By.xpath("//div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}

}
