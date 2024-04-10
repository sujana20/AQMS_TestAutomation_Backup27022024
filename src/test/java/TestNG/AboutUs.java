package TestNG;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AboutUs extends testBase.TestBase {
		

@Test (priority=1)
	public void Aboutus() throws Exception {		
		 
			driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
			takeScreenshot.save("AboutUs"); 
			
			try {
				  WebElement OurMission = driver.findElement(By.xpath("//span[contains(text(),'Our Mission')]"));
				  if (OurMission.isDisplayed() && OurMission.getText().trim().length() > 0) {
				    System.out.println("-Our Mission text is visible!");
				  } else {
				    System.out.println("-Our Mission text is not visible!");
				  }
				} catch (NoSuchElementException e) {
				  System.out.println("Element not found!");
				}
			Thread.sleep(3000);
			
			try {
				  WebElement OurVision = driver.findElement(By.xpath("//span[contains(text(),'Our Vision')]"));
				  if (OurVision.isDisplayed() && OurVision.getText().trim().length() > 0) {
				    System.out.println("-Our Vision text is visible!");
				  } else {
				    System.out.println("-Our Vision text is not visible!");
				  }
				} catch (NoSuchElementException e) {
				  System.out.println("Element not found!");
				}
			
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_DOWN).perform();  // Simulates pressing the Page Down key
			Thread.sleep(3000);
			
			try {
				  WebElement poweredBy = driver.findElement(By.xpath("//h3[contains(text(),'eCube Apps powered by iSpatialTec')]"));
				  if (poweredBy.isDisplayed() && poweredBy.getText().trim().length() > 0) {
				    System.out.println("-eCube Apps powered by iSpatialTec text is visible!");
				  } else {
				    System.out.println("-eCube Apps powered by iSpatialTec is not visible!");
				  }
				} catch (NoSuchElementException e) {
				  System.out.println("Element not found!");
				}
			
			takeScreenshot.save("About US");
	        logger.info("About US working as expected");
			
		}

	}
