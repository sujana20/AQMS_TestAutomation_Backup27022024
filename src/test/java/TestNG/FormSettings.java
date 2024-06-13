package TestNG;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FormSettings extends testBase.TestBase {
	
	@Test (priority=1)
	public void formSettings() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Form Settin")).click();
		logger.info("clcicked on FormSettings");	
	}
	

	@Test (priority=2)
	public void formFill() throws Exception {
		
		loginAs.qa("test190324@yopmail.com", "test190324");
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#listview")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Form Settin")).click();
		
		WebElement element = driver.findElement(By.xpath("//legend[1]"));
		String elementText = element.getText();
		assertTrue(elementText.contains("expected text"), "Expected text not found on the page");
		
		WebElement desc = driver.findElement(By.xpath("//*[@id='form_desc']"));
		desc.click(); desc.sendKeys("Employee");
		
		 WebElement dropdownElement = driver.findElement(By.xpath("//*[@id='ddlLabelPlacement']"));
		 Select dropdown = new Select(dropdownElement);
		 dropdown.selectByVisibleText("Top");
		 
		 
		 driver.findElement(By.xpath("//button[@id='btnSave']")).click(); 
		 logger.info("form setting working as expected");
		
		
	}

}
