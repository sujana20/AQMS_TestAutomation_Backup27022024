package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends testBase.TestBase {

@Test (priority=1)
	public void Homepage() throws Exception {
			
			
			// validating the elements
	        String[] headerElements = {"HOME", "ABOUT", "FEATURES", "TEMPLATES", "THEMES", "PRICING", "BLOG", "LOGIN", "REGISTER", "SHARE","FORM", "COLLECT", "DATA", "ANALYZE", "REPORT"};

	        // Loop through the list of header elements and check if they are present on the page
	        for (String element : headerElements) {
	            WebElement header = driver.findElement(By.xpath("//div/ul[@class='navbar-nav ml-auto']"));
	            if (header == null) {
	                System.out.println("The header element " + element + " is not present on the page.");
	            } else {
	                System.out.println("The header element " + element + " is present on the page.");
	            }
	        }
	        
	        takeScreenshot.save("header elements present");
	        Thread.sleep(5000);
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500)");
	        
	        Thread.sleep(6000);
	        
	        //validating Download Brochure
	        WebElement element = driver.findElement(By.partialLinkText("Download Brochu"));
	        if (element.isEnabled()) {
	        	
	        	System.out.println("Download Brochure is clickable");
	        }
	        else {
	        	System.out.println("Download Brochure not clickable");
	        }
			
	        //validating video 
	        
	        WebElement playbutton = driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[3]"));
	        playbutton.click();
	        Thread.sleep(6000);
	        playbutton.click();
	        logger.info("Video is visible");
	        takeScreenshot.save("Video");
	  
	        js.executeScript("window.scrollBy(0, 1000)");
	        Thread.sleep(3000);
	        logger.info("Map visible");
	        takeScreenshot.save("Map");
	        
	        js.executeScript("window.scrollBy(0, 1000)");
	        Thread.sleep(3000);
	        
	        //validating HOW TO CREATE ONLINE FORM Text 
	        WebElement form = driver.findElement(By.xpath("//h2[contains(text(),'How to Create Online Form')]"));
	        if (form != null) {
	            System.out.println("The text 'How to Create Online Form' is present in the webpage.");
	        } else {
	            System.out.println("The text 'How to Create Online Form' is not present in the webpage.");
	        }
	        
	        js.executeScript("window.scrollBy(0, 1000)");
	        logger.info("Client names are visible");
	        takeScreenshot.save("Clients");
	        js.executeScript("window.scrollBy(0, 1000)");
	        Thread.sleep(4000);
	     
	        
	        //------------------------Footer Validation--------------------------------
	        // About Us
	        WebElement aboutUs = driver.findElement(By.partialLinkText("About"));
	        Assert.assertTrue(aboutUs.isDisplayed());
	        Assert.assertTrue(aboutUs.isEnabled());
	        logger.info("About Us visible and it is clickable");
	        Thread.sleep(3000);
	        

	        // Site Map
	        WebElement siteMap = driver.findElement(By.partialLinkText("Site M"));
	        Assert.assertTrue(siteMap.isDisplayed());
	        Assert.assertTrue(siteMap.isEnabled());
	        logger.info("Site Map visible and it is clickable");
	        Thread.sleep(3000);
	        
	        // Report Abuse
	        WebElement reportAbuse = driver.findElement(By.partialLinkText("Report Abu"));
	        Assert.assertTrue(reportAbuse.isDisplayed());
	        Assert.assertTrue(reportAbuse.isEnabled());
	        logger.info("Report Abuse visible and it is clickable");
	        Thread.sleep(3000);

	        // Terms of Use
	        WebElement termsOfUse = driver.findElement(By.partialLinkText("Terms of Us"));
	        Assert.assertTrue(termsOfUse.isDisplayed());
	        Assert.assertTrue(termsOfUse.isEnabled());
	        logger.info("Terms of Use visible and it is clickable");
	        Thread.sleep(3000);

	        // Privacy Policy
	        WebElement privacyPolicy = driver.findElement(By.partialLinkText("Privacy Poli"));
	        Assert.assertTrue(privacyPolicy.isDisplayed());
	        Assert.assertTrue(privacyPolicy.isEnabled());
	        logger.info("Privacy Policy visible and it is clickable");
	        Thread.sleep(3000);


	        // Visit Us
	        WebElement visitUs = driver.findElement(By.xpath("//div[3]/div[1]/div[1]/p[1]"));
	        Assert.assertTrue(visitUs.isDisplayed());
	        Assert.assertTrue(visitUs.isEnabled());
	        logger.info("Visit Us visible");
	        Thread.sleep(3000);
	        
	        // Call Us
	        WebElement callUs = driver.findElement(By.xpath("//strong[contains(text(),'Call Us')]"));
	        Assert.assertTrue(callUs.isDisplayed());
	        Assert.assertTrue(callUs.isEnabled());
	        logger.info("Call Us visible");
	        Thread.sleep(3000);

	        // Email Us
	        WebElement email = driver.findElement(By.xpath("//strong[contains(text(),'Email Us')]"));
	        Assert.assertTrue(email.isDisplayed());
	        Assert.assertTrue(email.isEnabled());
	        logger.info("Email Us visible");
	        Thread.sleep(3000);

	        
	        // Social Media Links - Facebook
	        WebElement facebook = driver.findElement(By.xpath("//body/footer[1]/div[1]/div[1]/div[2]/div[1]/a[1]"));
	        Assert.assertTrue(facebook.isDisplayed());
	        Assert.assertTrue(facebook.isEnabled());
	        logger.info("Facebook visible");
	        
	        // Social Media Links - Twitter
	        WebElement twitter = driver.findElement(By.xpath("//body/footer[1]/div[1]/div[1]/div[2]/div[1]/a[2]"));
	        Assert.assertTrue(twitter.isDisplayed());
	        Assert.assertTrue(twitter.isEnabled());
	        logger.info("Twitter visible");

	        // Social Media Links - LinkedIn
	        WebElement linkedIn = driver.findElement(By.xpath("//body/footer[1]/div[1]/div[1]/div[2]/div[1]/a[3]"));
	        Assert.assertTrue(linkedIn.isDisplayed());
	        Assert.assertTrue(linkedIn.isEnabled());
	        logger.info("LinkedIn visible");
	        Thread.sleep(3000);
	        
	        takeScreenshot.save("Footer");
	        logger.info("Footer working as expected");
	        
		}

	}
