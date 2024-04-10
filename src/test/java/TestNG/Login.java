package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vardhaman\\Desktop\\chromedriver.exe");   //"C:\Users\vardhaman\Desktop\chromedriver.exe"
		driver=new ChromeDriver();
	}
		

@Test (priority=1)	
	public void login() throws Exception {		
		driver.get("https://ecubeapps.com");
		driver.manage().window().maximize();

		//------------------------------------------------------------------------//

		driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[8]/a[1]")).click();
		driver.findElement(By.id("txtuserid")).sendKeys("test190324@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("txtpassword")).sendKeys("test190324");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbtn")).click();		
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//span[@class='a-btn-text'])[1]")).click();	
	}
}