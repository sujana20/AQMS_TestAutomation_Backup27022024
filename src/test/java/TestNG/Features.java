package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Features extends testBase.TestBase {
	
	@Test (priority=1)
		public void FeaturesPage() throws Exception {	
		
		driver.findElement(By.xpath("//a[contains(text(),'Features')]")).click();
		takeScreenshot.save("Features"); 
			

        // Form Builder
        WebElement FormBuilder = driver.findElement(By.partialLinkText("Form Build"));
        Assert.assertTrue(FormBuilder.isDisplayed(), "Smart Forms element is not displayed");
        Assert.assertTrue(FormBuilder.isEnabled(), "Form Builder element is clickable");
        FormBuilder.click();
        Thread.sleep(3000);

        // Theme Designer
        WebElement themeDesigner = driver.findElement(By.partialLinkText("Theme Design"));
        Assert.assertTrue(themeDesigner.isDisplayed(), "Theme Designer element is not displayed");
        Assert.assertTrue(themeDesigner.isEnabled(), "Theme Designer element is clickable");
        themeDesigner.click();
        Thread.sleep(3000);
        
        // Form Share
        WebElement formShare = driver.findElement(By.partialLinkText("Form Sha"));
        Assert.assertTrue(formShare.isDisplayed(), "Form Share element is not displayed");
        Assert.assertTrue(formShare.isEnabled(), "Form Share element is clickable");
        formShare.click();
        Thread.sleep(3000);

        // Field Validation
        WebElement fieldValidation = driver.findElement(By.partialLinkText("Field Validati"));
        Assert.assertTrue(fieldValidation.isDisplayed(), "Field Validation element is not displayed");
        Assert.assertTrue(fieldValidation.isEnabled(), "Field Validation element is clickable");
        fieldValidation.click();
        Thread.sleep(3000);

        // Rule Builder
        WebElement ruleBuilder = driver.findElement(By.partialLinkText("Rule Build"));
        Assert.assertTrue(ruleBuilder.isDisplayed(), "Rule Builder element is not displayed");
        Assert.assertTrue(ruleBuilder.isEnabled(), "Rule Builder element is clickable");
        ruleBuilder.click();
        Thread.sleep(3000);

        // Notification Settings
        WebElement notificationSettings = driver.findElement(By.partialLinkText("Notification Settin"));
        Assert.assertTrue(notificationSettings.isDisplayed(), "Notification Settings element is not displayed");
        Assert.assertTrue(notificationSettings.isEnabled(), "Notification Settings element is clickable");
        notificationSettings.click();
        Thread.sleep(3000);

        // Report Builder
        WebElement reportBuilder = driver.findElement(By.partialLinkText("Report Build"));
        Assert.assertTrue(reportBuilder.isDisplayed(), "Report Builder element is not displayed");
        Assert.assertTrue(reportBuilder.isEnabled(), "Report Builder element is clickable");
        reportBuilder.click();
        Thread.sleep(3000);

        // User Management
        WebElement userManagement = driver.findElement(By.partialLinkText("User Manageme"));
        Assert.assertTrue(userManagement.isDisplayed(), "User Management element is not displayed");
        Assert.assertTrue(userManagement.isEnabled(), "User Management element is clickable");
        userManagement.click();
        Thread.sleep(3000);
        
        // Performance Analytics
        WebElement performanceAnalytics = driver.findElement(By.partialLinkText("Performance Analyti"));
        Assert.assertTrue(performanceAnalytics.isDisplayed(), "Performance Analytics is not displayed");
        Assert.assertTrue(performanceAnalytics.isEnabled(), "Performance Analytics element is clickable");
        performanceAnalytics.click();
        Thread.sleep(3000);

        // Templates Gallery
        WebElement templatesGallery = driver.findElement(By.partialLinkText("Templates Galle"));
        Assert.assertTrue(templatesGallery.isDisplayed(), "Templates Gallery is not displayed");
        Assert.assertTrue(templatesGallery.isEnabled(), "Templates Gallery element is clickable");
        templatesGallery.click();
        Thread.sleep(3000);
        
        // Capture with Captcha
        WebElement captureCaptcha = driver.findElement(By.partialLinkText("Capture with Captc"));
        Assert.assertTrue(captureCaptcha.isDisplayed(), "Capture with Captcha is not displayed");
        Assert.assertTrue(captureCaptcha.isEnabled(), "Capture with Captcha element is clickable");
        captureCaptcha.click();
        Thread.sleep(3000);
        
        // Upload Files
        WebElement uploadFiles = driver.findElement(By.partialLinkText("Upload Fil"));
        Assert.assertTrue(uploadFiles.isDisplayed(), "Upload Files is not displayed");
        Assert.assertTrue(uploadFiles.isEnabled(), "Upload Files element is clickable");
        uploadFiles.click();
        Thread.sleep(3000);
        
        // Export Data
        WebElement exportData = driver.findElement(By.partialLinkText("Export Da"));
        Assert.assertTrue(exportData.isDisplayed(), "Export Data is not displayed");
        Assert.assertTrue(exportData.isEnabled(), "Export Data element is clickable");
        exportData.click();
        Thread.sleep(3000);
        
        // Account Manager
        WebElement accountManager = driver.findElement(By.partialLinkText("Account Manag"));
        Assert.assertTrue(exportData.isDisplayed(), "accountManager is not displayed");
        Assert.assertTrue(exportData.isEnabled(), "accountManager element is clickable");
        accountManager.click();
        Thread.sleep(3000);
        
        
        takeScreenshot.save("Features");
        logger.info("Features working as expected");
		}

	}
