package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pricing extends testBase.TestBase {
	
	@Test (priority=1)
	public void PricingPage() throws Exception {	
		
		driver.findElement(By.xpath("//a[contains(text(),'Pricing')]")).click();
		takeScreenshot.save("Pricing Page");
		logger.info("PricingPage displayed");
		Thread.sleep(5000);
		
		 // Plans & Pricing heading
        WebElement plansAndPricing = driver.findElement(By.xpath("//h2[contains(text(),'Plans & Pricing')]"));
        Assert.assertTrue(plansAndPricing.isDisplayed(), "Plans & Pricing heading is not displayed");
        logger.info("Plans & Pricing heading is present");

        // Toggle button
        WebElement toggleButton = driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/button[1]"));
        toggleButton.click();
        Assert.assertTrue(toggleButton.isDisplayed(), "Toggle button is not displayed");
        Assert.assertTrue(toggleButton.isEnabled(), "Toggle button is not clickable");
        logger.info("Toggle button is present");
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
  
        // Upgrade buttons
        int upgradeButtonsCount = driver.findElements(By.xpath("//button[contains(text(),'upgrade')]")).size();
        Assert.assertTrue(upgradeButtonsCount > 0, "Upgrade buttons are not present");
        logger.info("Upgrade buttons are present");
        
        // Click on each Upgrade button and handle potential exceptions
        
        for (int i = 1; i <= upgradeButtonsCount; i++) {
            WebElement upgradeButton = driver.findElements(By.xpath("//body/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/button[1]")).get(i - 1);
            Assert.assertTrue(upgradeButton.isDisplayed(), "Upgrade button is not displayed in column: " + i);
            Assert.assertTrue(upgradeButton.isEnabled(), "Upgrade button is not clickable in column: " + i);
            upgradeButton.click();
            logger.info("Upgrade buttons are Clickable");
            Thread.sleep(3000); // Add a wait after clicking each button to avoid potential errors
   
            logger.info("PricingPage working as expected");
            
            
        }
		
	}

}
