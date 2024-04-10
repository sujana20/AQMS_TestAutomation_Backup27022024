package TestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Entries extends testBase.TestBase {


	@Test (priority=1)
	public void EntriesRedirection() throws Exception {		
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000);  
		
	}
	
	@Test (priority=2)
	public void NewEntryCreation() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		Thread.sleep(2000); 
		
		WebElement inputFirstName = driver.findElement(By.xpath("//input[@id='F1N1']"));
		inputFirstName.click();
		inputFirstName.sendKeys("Testing");			
		Thread.sleep(3000); 
		
		WebElement inputLastName = driver.findElement(By.xpath("//input[@id='F1N2']"));
		inputLastName.click();
		inputLastName.sendKeys("Automation");			
		Thread.sleep(3000); 
		
		WebElement inpuPhone = driver.findElement(By.xpath("//input[@id='F2']"));
		inpuPhone.click();
		inpuPhone.sendKeys("9900887766");
		Thread.sleep(2000); 
		
		WebElement inputEmail = driver.findElement(By.xpath("//input[@id='F3']"));
		inputEmail.click();
		inputEmail.sendKeys("test190324@yopmail.com");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='F4']"));
		dropdownElement.click();
		Thread.sleep(2000);
		Select dropdown  = new Select(dropdownElement);
		dropdown.selectByVisibleText("Tester");
		
		//driver.findElement(By.xpath("//span[@class='btn btn-primary']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
	
	@Test (priority=3)
	public void SelectFields() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		takeScreenshot.save("Form list Visible");
		logger.info("Entries page displayed ");
		
		driver.findElement(By.xpath("//div/div[@class= 'select_div btn btn-primary_a  formActions bor_rad']")).click();
		 Thread.sleep(2000); 
		 
		// Identify the label elements for sorting
		 WebElement photoLabel = driver.findElement(By.xpath("//label[contains(text(),'Photo')]"));
		 WebElement createdDateLabel = driver.findElement(By.xpath("//label[contains(text(),'Created Date')]"));

		 // Click on the Photo label twice
		 photoLabel.click();
		 Thread.sleep(3000); 
		 photoLabel.click();
		 Thread.sleep(3000); 
		 
		 // Click on the Created Date label twice
		 createdDateLabel.click();
		 Thread.sleep(3000); 
		 createdDateLabel.click();	 
		 Thread.sleep(5000); 
		 
	}
	
	@Test (priority=4)
	public void EntryView() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		takeScreenshot.save("Entries list Visible");
		logger.info("Entries page displayed ");
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//tbody/tr[@id='datagrid-row-r1-1-0']/td[1]/div[1]/a[1]")).click();
		takeScreenshot.save("Entries View");
		logger.info("Entries View successful");	
		Thread.sleep(5000); 
	}
	
	@Test (priority=5)
	public void Remarks() throws Exception {
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		takeScreenshot.save("Entries list Visible");
		logger.info("Entries page displayed ");
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//tbody/tr[@id='datagrid-row-r1-1-0']/td[1]/div[1]/a[1]")).click();
		takeScreenshot.save("Entries View");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//span/a[contains(text(),'Edit')]"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span/a[contains(text(),'Edit')]")).click();		
		
		WebElement Remarks = driver.findElement(By.name("Remarks"));
		Remarks.click();
		Remarks.sendKeys("Automation Test");
		Thread.sleep(3000);
		
		//driver.findElement(By.name("Update Remark")).click();
		driver.findElement(By.xpath("//span[contains(@ng-click, \"saveremarks();\")]")).click();	
		Thread.sleep(5000);
		
		
	}
	
	@Test (priority=6)
	public void EmailEntry() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		takeScreenshot.save("Entries list Visible");
		logger.info("Entries page displayed ");
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//tbody/tr[@id='datagrid-row-r1-1-0']/td[1]/div[1]/a[1]")).click();
		logger.info("Entries View successful");	
		driver.findElement(By.xpath("//label[contains(text(),'Email')]")).click();
		Thread.sleep(3000);
		
		WebElement emaiId  = driver.findElement(By.xpath("//input[@id='txtmailid']"));
		emaiId.click();
		emaiId.sendKeys("test200324@yopmail.com");
		
		WebElement EnterDisc = driver.findElement(By.xpath("//textarea[@id='txtmailDesc']"));
		EnterDisc.click();
		EnterDisc.sendKeys("This is Test Automation");
		
		driver.findElement(By.xpath("//button[contains(text(),'Send Email')]")).click();
		Thread.sleep(6000);
		logger.info("Entries Entry added");	
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
		logger.info("Entries sent successfully");		
		 Thread.sleep(5000); 
	}
	
	/*@Test (priority=7)
	public void EntryPdf() throws Exception {
		driver.findElement(By.cssSelector("#datagrid-row-r1-1-0 > td:nth-child(1) > div > a.like > i")).click();
		 
		 Thread.sleep(1000); 
		driver.findElement(By.cssSelector("#admin > div.container.admin_entries_list.nopadding.formdata_page.ng-scope > div.form_data_view.ng-scope > div.col-sm-4.edits-rightside > div.col-sm-3.col-xs-3.buttons.pdf-btn.nopadding > div")).click();
		 
		 Thread.sleep(3000); 
	}
	*/
	
	@Test (priority=8)
	public void EntryPrint() throws Exception {
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		takeScreenshot.save("Entries list Visible");
		logger.info("Entries page displayed ");
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//tbody/tr[@id='datagrid-row-r1-1-0']/td[1]/div[1]/a[1]")).click();
		logger.info("Entries View successful");
		
		driver.findElement(By.xpath("//label[contains(text(),'Print')]")).click();
		 Thread.sleep(3000); 
		
		Robot rb =new Robot();
	
		rb.keyPress(KeyEvent.VK_ESCAPE);		
		rb.keyRelease(KeyEvent.VK_ESCAPE);	
		
		Thread.sleep(6000); 
		
	}
	

	@Test (priority=9)
	public void ExportToExcel() throws Exception {
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//body/section[@id='admin']/section[@id='admin']/div[3]/div[1]/div[1]/div[1]/div[1]/a[2]")).click();
		
		 
	}
	
	
	@Test (priority=10)
	public void EntryDelete() throws Exception {
		loginAs.qa("test190324@yopmail.com", "test190324");
		//driver.findElement(By.xpath(" span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(3) > i")).click();	
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@class='delentry testx3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/section[@id='admin']/section[@id='admin']/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
	}
	
	/*
	
	
	
	
	@Test (priority=12)
	public void FooterOptions() throws Exception {
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();	
		 
		 Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();	
		 
		 Thread.sleep(1000);
		driver.findElement(By.cssSelector("#admin > div.container > div:nth-child(2) > div.ecube_entries_div > div.table-responsive > div.panel.datagrid > div > div.datagrid-pager.pagination > table > tbody > tr > td:nth-child(1) > select")).click();
		 
		 Thread.sleep(1000); 
		action.sendKeys(Keys.PAGE_DOWN).build().perform();	
		 
		 Thread.sleep(1000);
		driver.findElement(By.cssSelector("#admin > div.container > div:nth-child(2) > div.ecube_entries_div > div.table-responsive > div.panel.datagrid > div > div.datagrid-pager.pagination > table > tbody > tr > td:nth-child(1) > select > option:nth-child(4)")).click();
		 
		 Thread.sleep(1000); 
		action.sendKeys(Keys.PAGE_DOWN).build().perform();	
		 
		 Thread.sleep(1000);
		driver.findElement(By.cssSelector("#admin > div.container > div:nth-child(2) > div.ecube_entries_div > div.table-responsive > div.panel.datagrid > div > div.datagrid-pager.pagination > table > tbody > tr > td:nth-child(4) > a > span > span.l-btn-icon.pagination-prev")).click();
		 
		 Thread.sleep(1000); 
		driver.findElement(By.cssSelector("#admin > div.container > div:nth-child(2) > div.ecube_entries_div > div.table-responsive > div.panel.datagrid > div > div.datagrid-pager.pagination > table > tbody > tr > td:nth-child(10) > a > span > span.l-btn-icon.pagination-next")).click();
		 
		 Thread.sleep(1000); 
		driver.findElement(By.cssSelector("#admin > div.container > div:nth-child(2) > div.ecube_entries_div > div.table-responsive > div.panel.datagrid > div > div.datagrid-pager.pagination > table > tbody > tr > td:nth-child(13) > a > span > span.l-btn-icon.pagination-load")).click();
		 
		 Thread.sleep(1000); 
		action.sendKeys(Keys.PAGE_UP).build().perform();	
		 
		 Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_UP).build().perform();	
		 
		 Thread.sleep(1000);
	}
	
	@Test (priority=13)
	public void Filters() throws Exception {
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/input")).click();
		 
		 Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/input")).sendKeys("T");
		 
		 Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/a")).click();
		 
		 Thread.sleep(1000); 
	    driver.findElement(By.cssSelector("body > div:nth-child(16) > div:nth-child(3) > div.menu-text")).click();
	     
	    Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/input")).click();
		 
		 Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/input")).sendKeys("Z");
		 
		 Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/a")).click();
		 
		 Thread.sleep(1000); 
	    driver.findElement(By.cssSelector("body > div:nth-child(16) > div:nth-child(4) > div.menu-text")).click();
	     
	     Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/input")).click();
		 
		 Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/input")).sendKeys("X");
		 
		 Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/a")).click();
		 
		 Thread.sleep(1000); 
	    driver.findElement(By.cssSelector("body > div:nth-child(16) > div:nth-child(5) > div.menu-text")).click();
	     
	     Thread.sleep(1000); 
		driver.findElement(By.xpath(" *[@id=\"admin\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr[2]/td[1]/div/a")).click();
		 
		 Thread.sleep(1000); 
	    driver.findElement(By.cssSelector("body > div:nth-child(16) > div:nth-child(2) > div.menu-text")).click();
	     
	     Thread.sleep(1000); 
	}
	
	*/

		 /*@AfterClass()
		public void closeApp()
		{
		driver.quit();
		} 
	*/
}
