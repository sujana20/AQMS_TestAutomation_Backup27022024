package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Registration extends testBase.TestBase{

@Test (priority=1)
	public void registration() throws Exception {		
			driver.get("https://ecubeapps.com");
			driver.manage().window().maximize(); 
			driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[9]/a[1]")).click();

	        WebElement emailField = driver.findElement(By.xpath("//input[@id='UserName']"));
	        emailField.sendKeys("test190324@yopmail.com");

	        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
	        passwordField.sendKeys("test190324");

	        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	        confirmPasswordField.sendKeys("test#*&999");

	        WebElement nameField = driver.findElement(By.xpath("//input[@id='FirstName']"));
	        nameField.sendKeys("Test User");

	        WebElement uniqueAccountNameField = driver.findElement(By.xpath("//input[@id='AccountName']"));
	        uniqueAccountNameField.sendKeys("testuser");


	        WebElement termsCheckbox = driver.findElement(By.xpath("//input[@id='AcceptTermsOfUse']"));
	        termsCheckbox.click();
	        Thread.sleep(5000);
	        
	        WebElement signUpButton = driver.findElement(By.xpath("//button[@id='btnregister']"));
	        signUpButton.click();
	        
	        Thread.sleep(10000);
	        
	        takeScreenshot.save("Registration Successfull");
	        logger.info(" Registred Successfully");

}
	@Test (priority=1)	
	public void login() throws Exception {	
		
		driver.findElement(By.xpath("//form/div/a[@class='btn btn-sm btn-info btn-block submit_btn']")).click();
		loginAs.qa("vardhaman.naha@gmail.com", "test#*&999");
		driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
	
}
}
