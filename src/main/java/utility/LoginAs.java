package utility;

import org.openqa.selenium.By;

import testBase.TestBase;

public class LoginAs extends TestBase{
	
	public void qa(String email, String password) throws InterruptedException {
		driver.get("https://ecubeapps.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[8]/a[1]")).click();			
		Thread.sleep(20000);
		login.enterUsername(email);
		login.enterPassword(password);
		login.clickOnLogin();
		login.select();
		Thread.sleep(3000);
		
		
	}

}
