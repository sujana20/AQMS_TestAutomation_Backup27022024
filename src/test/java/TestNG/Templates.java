package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Templates extends testBase.TestBase {
	

	@Test (priority=1)
		public void TemplatesPage() throws Exception {	
		
		driver.findElement(By.xpath("//li[@id='Templates']")).click();
		takeScreenshot.save("templates"); 
		
	   
		WebElement categoriesOption = driver.findElement(By.linkText("//*[@href=\"/Templates/TemplatesList\"]"));

		Actions action = new Actions(driver);
		action.moveToElement(categoriesOption).build().perform();
		
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.cssSelector("#txtSearch"));
		search.click(); search.sendKeys("Fitness");
		driver.findElement(By.xpath("//div[1]/button[1]/span[1]")).click();
		
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		
			
	}

}
