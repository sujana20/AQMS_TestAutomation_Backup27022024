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
	        emailField.sendKeys("testuser123@yopmail.com");

	        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
	        passwordField.sendKeys("testuser123");

	        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	        confirmPasswordField.sendKeys("testuser123");

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
}
