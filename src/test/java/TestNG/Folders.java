package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Folders extends testBase.TestBase {
		
	@Test (priority=1)
	public void FolderCreation() throws Exception {
		  
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.id("CreateFolderbutton")).click();
		logger.info("clicked on create folder");
		Thread.sleep(2000);
		WebElement formName = driver.findElement(By.id("txtFolderName"));
		formName.click();
		formName.sendKeys("Emp Form");
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnCreateFolder")).click();
		logger.info("folder created");	
		
	}
	
	@Test (priority=2)
	public void FoldernameRenaming() throws Exception {
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[1]/input[1]")).click();
		Actions actions = new Actions(driver);
		WebElement elementToHover = driver.findElement(By.xpath("//a[1]/input[1]"));
		actions.moveToElement(elementToHover).perform();
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[1]/div[1]/span[2]")).click();
		WebElement editName = driver.findElement(By.xpath("//a[1]/input[1]"));
		editName.click();
		editName.clear();
		editName.sendKeys("Test Emp Form");
		
		driver.findElement(By.xpath("//span[@class='fa fa-check submit-button active']")).click();
}	
	
	
	@Test (priority=3)
	public void MoveForms() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		driver.findElement(By.id("//*[@id='lv0']")).click();
		logger.info("Form selcted");
		driver.findElement(By.xpath("//a[@id='dropdownMenu1']")).click();
		logger.info("clicked on Move Form");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[4]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn btn-default']")).click();

		takeScreenshot.save("Form moved to new folder");
		
}


	
	@Test (priority=4)
	public void Favourites() throws Exception {	
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[1]/div[1]/a[1]/i[1]")).click();
		logger.info("added to Favourites");
		
		driver.findElement(By.xpath("//a[@ng-click=\"bindFavoriteForms('1');\"]")).click();
		logger.info("clicked on Favourites");
		takeScreenshot.save("Favourites");
		
	}
		
	
	@Test (priority=5)
	public void MoveToOriginalFolder() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[1]/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("//*[@id='lv0']")).click();
		logger.info("Form selcted");
		
		driver.findElement(By.xpath("//a[@id='dropdownMenu1']")).click();
		logger.info("clicked on Move Form");
		
		driver.findElement(By.xpath("//li[4]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn btn-default']")).click();
}	
	
	@Test (priority=6)
	public void FolderDeletion() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@class='fold-name']")).click();
		Actions actions = new Actions(driver);
		WebElement elementToHover = driver.findElement(By.xpath("//input[@class='fold-name']"));
		actions.moveToElement(elementToHover).perform();
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='fa fa-trash-o delete-button']")).click();
		logger.info("clicked on delete folder");
		driver.findElement(By.xpath("//button[@class='btn btn btn-default']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn btn-default']")).click();		
}
	/*
	
	@Test (priority=8)
	public void Pagination() throws Exception {		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();	
		  
		//Thread.sleep(1000);		
		driver.findElement(By.cssSelector("#formlist > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12 > div > ul > li.PagedList-skipToNext > a")).click();
		  
		//Thread.sleep(1000);		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();	
		  
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("#formlist > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12 > div > ul > li.PagedList-skipToPrevious > a")).click();
		System.out.println("Completed pagination functionality");
}
	

	@AfterClass()
	public void closeApp()
	{
	driver.quit();
	}	
	*/
}
