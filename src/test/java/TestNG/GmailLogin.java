package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailLogin extends testBase.TestBase {
	@Test
	public void gmailLogin() throws Exception {

        // Click on Sign Up button
		driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[8]/a[1]")).click();

        // Click on Sign Up with Google button
        driver.findElement(By.id("Google")).click();
        
        
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@id='identifierId']")).click();
      
        // Enter Gmail login credentials
        driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("vardhaman.naha@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Vardhaman#$@9900");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

        // Click on Create Account button
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();

        /*
        // Click on Logout button
        driver.findElement(By.cssSelector("#headerDropdown > a > span")).click();
        driver.findElement(By.cssSelector("#pulloutMenu > li:nth-child(6) >a")).click();

        driver.quit();
        */
	}
			
	}
