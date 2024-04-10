package TestNG;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ShareForm extends testBase.TestBase {
			
@Test (priority=1)
	public void FormShareRedirection() throws Exception {	
		
	loginAs.qa("test190324@yopmail.com", "test190324");
	logger.info("Logged in Successfully");
	Thread.sleep(4000); 
	
	driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
	takeScreenshot.save("Form list Visible"); 
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Share")).click();
	Thread.sleep(3000);
	logger.info("clicked on share");
	

	try {
		  WebElement element = driver.findElement(By.xpath("//label[@class='share_tog']"));
		  System.out.println("1.Toggle Element Found!");
		} catch (NoSuchElementException e) {
		  System.out.println("1.Toggle Element Not Found!");
		}
	logger.info("Share Form toggle button validated");
	
	driver.findElement(By.xpath("//label[@class='share_tog']")).click();
	logger.info("clicked on 1.Toggle Element");
	//driver.findElement(By.xpath("//label[@class='share_tog']")).click();
	Thread.sleep(3000);
	
	try {
		  WebElement element1 = driver.findElement(By.xpath("//input[@id='chkpassword']"));
		  System.out.println("2.Toggle Element Found!");
		} catch (NoSuchElementException e) {
		  System.out.println("2.Toggle Element Not Found!");
		}
	logger.info("Password Protected toggle button validated");
	
	driver.findElement(By.xpath("//body/section[@id='admin']/div[@id='angularid']/form[@id='frm']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")).click();
	Thread.sleep(3000);
	
	WebElement password = driver.findElement(By.id("Password1"));
	password.click();
	password.sendKeys("test123");
	Thread.sleep(2000);
	logger.info("password enter Successful");
	
	driver.findElement(By.xpath("//*[@onclick=\"SavePassword()\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@href=\"#URLTabContent\"]")).click();
	logger.info("clicked on URL share");
	takeScreenshot.save("URL share");	
	driver.findElement(By.xpath("//a[contains(@class, 'url_share_but')]")).click();
	logger.info("URL copied");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@href=\"#EmbedFormContent\"]")).click();
	logger.info("clicked on EmbedForm");
	takeScreenshot.save("EmbedForm");
	//driver.findElement(By.xpath("//*[@id='EmbedFormContent']/div/div/div/a[1]")).click();
	//logger.info("code copied");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@href=\"#QrCodeContent\"]")).click();
	logger.info("clicked on QR Code");
	takeScreenshot.save("QR Code");
	
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement scroll = driver.findElement(By.xpath("//div[4]/a[1]"));
	js.executeScript("arguments[0].scrollIntoView()", scroll);
	
	driver.findElement(By.xpath("//div[4]/a[1]")).click();
	logger.info("QR Code downloaded");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@href=\"#ShareFormContent\"]")).click();
	logger.info("clicked on QR Code");
	
	WebElement email = driver.findElement(By.xpath("//*[@id='Mailidsvalidation']"));
	email.click();
	email.sendKeys("test190324@yopmail.com");
	logger.info("Email added");
	
	driver.findElement(By.xpath("//*[@id='BtnAddCCBCC']")).click();
	Thread.sleep(3000);
	
	WebElement cc = driver.findElement(By.xpath("//*[@id='Ccmails_validation']"));
	cc.click();
	cc.sendKeys("svardhaman99@gmail.com");
	logger.info("CC added");
	
	Thread.sleep(3000);
	WebElement subject = driver.findElement(By.xpath("//*[@id='Subject']"));
	subject.click();
	subject.clear();
	subject.sendKeys("Quick Employee Survey");
	logger.info("Subject added");
	
	Thread.sleep(3000);
	WebElement message = driver.findElement(By.xpath("//*[@id='MailMessage']"));
	message.click();
	message.sendKeys("This is the Employee Survey");
	logger.info("Message body added");
	
	
	driver.findElement(By.id("approve-btn")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
	Thread.sleep(5000);
	
	
}


@AfterClass()
	public void closeApp()
	{
	driver.quit();
	} 

}

