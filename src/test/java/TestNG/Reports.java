package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Reports extends testBase.TestBase  {
	
	@Test (priority=1)
	public void ReportsView() throws Exception {	
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Repor")).click();
		logger.info("Reports Page is visible");
		takeScreenshot.save("Reports");
		Thread.sleep(3000);
		
		// Reports View
		
		WebElement hoverElement = driver.findElement(By.xpath("//div[contains(@class, 'report_list_item_form1')]"));
		hoverElement.click();
        /*Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();*/
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/a[2]")).click();
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement report = driver.findElement(By.xpath("//div[2]/span[1]"));
		report.click();
		report.click();
		takeScreenshot.save("Reports");
		logger.info("Reports view working as expected");
		
	}
		
		@Test (priority=2)
		public void ReportsEdit() throws Exception {	
			
			  driver.navigate().back();
			  WebElement hoverElement = driver.findElement(By.xpath("//div[contains(@class, 'report_list_item_form1')]"));
				hoverElement.click();
				logger.info("clicked on edit form");
		        /*Actions actions = new Actions(driver);
		        actions.moveToElement(hoverElement).perform();*/
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/a[1]")).click();
		        Thread.sleep(3000);
		        
		        takeScreenshot.save("Data Analytics Report");
        
		        WebElement title = driver.findElement(By.xpath("//*[@id='report_title']"));
		        title.click(); title.clear(); title.sendKeys("Data Analytics");
		        
		        Thread.sleep(3000);
		        WebElement disc = driver.findElement(By.xpath("//*[@id='report_description']"));
		        disc.click(); disc.clear(); disc.sendKeys("Emp form");
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//div[2]/div[1]/div[1]/a[1]")).click();
		        
		        driver.findElement(By.xpath("//*[@id='rdlctrlReportOptionsummarybyFieldbyTimeRange']")).click();
		        
	}
		
		@Test (priority=3)
		public void NewReport() throws Exception {	
			
			driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
			
			
			
		}

}
