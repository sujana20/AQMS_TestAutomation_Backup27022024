package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class forgotPassword extends testBase.TestBase {
	

@Test (priority=1)
	public void ForgotPassword() throws InterruptedException {
	
	driver.get("https://ecubeapps.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[8]/a[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
	logger.info("clicked on Forgot password");
	takeScreenshot.save("Forgot password");
	
	WebElement ForgotPassword = driver.findElement(By.xpath("//input[@id='LoginName']"));
	ForgotPassword.click();
	ForgotPassword.sendKeys("test190324@yopmail.com");
	
	driver.findElement(By.xpath("//div/button[@type='submit']")).click();
	
	


}
}