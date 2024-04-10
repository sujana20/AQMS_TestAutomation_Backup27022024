package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CascadingDropDown extends testBase.TestBase{
	
@Test (priority=1)
	public void CreateForm() throws Exception {	
		loginAs.qa("test01@gmail.com", "123456");
		driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		
		Thread.sleep(4000); 
		driver.findElement(By.cssSelector("#Createbutton")).click();
		driver.findElement(By.cssSelector("#createModel > div > div > div.modal-body > div.col-md-12 > div:nth-child(1) > a > button")).click();
	}
	
	
@Test (priority=2)
	public void AddingCascadingDD() throws Exception {	
	loginAs.qa("test01@gmail.com", "123456");
	Thread.sleep(3000); 
	driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
	logger.info("Logged in Successfully");
	
	Thread.sleep(4000); 
	driver.findElement(By.cssSelector("#Createbutton")).click();
	driver.findElement(By.cssSelector("#createModel > div > div > div.modal-body > div.col-md-12 > div:nth-child(1) > a > button")).click();

	driver.findElement(By.id("eccascadingdropdownfield")).click();
	Thread.sleep(3000); 
	
	//---Control selection-------//	
	 
	driver.findElement(By.xpath("//label[@class='lbl ctrlLabelText']")).click();
	Thread.sleep(3000); 
	driver.findElement(By.xpath("//input[@id='field_displayName']")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//input[@id='field_displayName']")).clear();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//input[@id='field_displayName']")).sendKeys("CascadingDropdown- Fieldlabel");
	Thread.sleep(2000);	
	
	logger.info("AddingCascadingDD is working as expected");


		//---------------FormTitleAndDesc------------------------------//

	driver.findElement(By.xpath("/html/body/form/div/div/div[1]/ul/li[3]/a")).click();	
	Thread.sleep(2000); 
	driver.findElement(By.cssSelector("#form_title")).click();
	driver.findElement(By.cssSelector("#form_title")).clear();
	Thread.sleep(2000);  
	driver.findElement(By.cssSelector("#form_title")).sendKeys("CascadingDropdown Control and its Properties");
	Thread.sleep(2000); 
	driver.findElement(By.cssSelector("#form_desc")).click();	
	Thread.sleep(2000); 
	driver.findElement(By.cssSelector("#form_desc")).sendKeys("Automation Testing of CascadingDropdown Control");
	Thread.sleep(2000); 
}



	
@Test (priority=5)
public void CascadingHintText() throws Exception {	
	driver.findElement(By.xpath("/html/body/form/div/div/div[1]/ul/li[1]/a")).click();
	Thread.sleep(2000); 
	driver.findElement(By.id("eccascadingdropdownfield")).click();
	
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//*[@id=\"control[2]\"]/div[3]/div[1]")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//*[@id=\"field_hintText\"]")).click();
	Thread.sleep(2000); 	
	driver.findElement(By.xpath("//*[@id=\"field_hintText\"]")).sendKeys("Please select the Option");
	Thread.sleep(2000); 	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).click();
	Thread.sleep(2000); 	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).clear();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).sendKeys("CascadingDropdown- Hintext");
	Thread.sleep(2000); 	
}
	
@Test (priority=6)
public void CascadingRequiredProperty() throws Exception {	
	driver.findElement(By.xpath("/html/body/form/div/div/div[1]/ul/li[1]/a")).click();
	Thread.sleep(2000);  
	driver.findElement(By.id("eccascadingdropdownfield")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//*[@id=\"control[3]\"]/div[3]/div[1]")).click();
	Thread.sleep(2000);  
	driver.findElement(By.xpath("//*[@id=\"fieldValidationsIsMandatorySection\"]/label")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).click();
	Thread.sleep(2000); 	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).clear();
	Thread.sleep(2000); 	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).sendKeys("CascadingDropdown- RequiredProperty");
	Thread.sleep(2000); 
}

@Test (priority=7)
public void CascadingAdminProperty() throws Exception {	
	driver.findElement(By.xpath("/html/body/form/div/div/div[1]/ul/li[1]/a")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(2000); 
	driver.findElement(By.id("eccascadingdropdownfield")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(2000); 
	Actions pagedown = new Actions(driver);
	pagedown.sendKeys(Keys.PAGE_DOWN).build().perform();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"control[4]\"]/div[3]/div[1]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).clear();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).sendKeys("CascadingDropdown- AdminProperty");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"fieldAdminSection\"]/label")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	

}

@Test (priority=8)
public void CascadingDropdownLevels() throws Exception {	
	driver.findElement(By.xpath("/html/body/form/div/div/div[1]/ul/li[1]/a")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000); 
	driver.findElement(By.id("eccascadingdropdownfield")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000); 
	Actions pagedown = new Actions(driver);
	pagedown.sendKeys(Keys.PAGE_DOWN).build().perform();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"control[5]\"]/div[3]/div[1]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"field_cascadingDropdownLevels\"]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_cascadingDropdownLevels\"]/option[2]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).clear();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).sendKeys("CascadingDropdown- DropdownLevels");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
}

@Test (priority=9)
public void CascadingDropdownLevelsData() throws Exception {	
	driver.findElement(By.xpath("/html/body/form/div/div/div[1]/ul/li[1]/a")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000); 
	driver.findElement(By.id("eccascadingdropdownfield")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000); 
	Actions pagedown = new Actions(driver);
	pagedown.sendKeys(Keys.PAGE_DOWN).build().perform();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"control[6]\"]/div[3]/div[1]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"field_cascadingDropdownLevels\"]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_cascadingDropdownLevels\"]/option[1]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_cascadingDropdownData\"]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_cascadingDropdownData\"]")).clear();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_cascadingDropdownData\"]")).sendKeys("State, District\n" + "AP,Nellore\n" + "TEL,Karimanagr");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).clear();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"field_displayName\"]")).sendKeys("CascadingDropdown- DropdownlevelsData");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Thread.sleep(1000);	
}


@Test (priority=10)
	public void FormSavingandViewForm() throws Exception {	
		driver.findElement(By.cssSelector("#cmd_formValidate")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.success_model.info_model.in > div > div > div.modal-footer > button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		System.out.println("Validating the Form : PASS");
		driver.findElement(By.cssSelector("#cmd_formSave")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.success_model.in > div > div > div.modal-footer > button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("#listview > span")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a:nth-child(4)")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(3000);
	} 

@Test (priority=11)
	public void ValidationsChecking() throws Exception {		
		driver.findElement(By.xpath("//*[@id=\"F1C1\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F1C1\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F1C2\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F1C2\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		Actions pagedn = new Actions(driver);
		pagedn.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//*[@id=\"F1C3\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F1C3\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[3]/div[1]/div/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		for(int i=0; i<7; i++) {
		Actions pagednc = new Actions(driver);
		pagednc.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F2C1\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F2C1\"]/option[2]")).click(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);		
		driver.findElement(By.xpath("//*[@id=\"F2C2\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F2C2\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);		
		driver.findElement(By.xpath("//*[@id=\"F2C3\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F2C3\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[3]/div[1]/div/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(2000);	
		for(int i=0; i<6; i++) {
			Actions pagednc = new Actions(driver);
			pagednc.sendKeys(Keys.PAGE_DOWN).build().perform();
			}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F5C1\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F5C1\"]/option[3]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);		
		driver.findElement(By.xpath("//*[@id=\"F5C2\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F5C2\"]/option[3]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		for(int i=0; i<7; i++) {
			Actions pagednc = new Actions(driver);
			pagednc.sendKeys(Keys.PAGE_DOWN).build().perform();
			}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//*[@id=\"F5C3\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F5C3\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[3]/div[1]/div/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(2000);	
		for(int i=0; i<7; i++) {
			Actions pagednc = new Actions(driver);
			pagednc.sendKeys(Keys.PAGE_DOWN).build().perform();
			}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F6C1\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F6C1\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F6C2\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F6C2\"]/option[1]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[3]/div[1]/div/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		for(int i=0; i<9; i++) {
			Actions pagednc = new Actions(driver);
			pagednc.sendKeys(Keys.PAGE_DOWN).build().perform();
			}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
			
		driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[7]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(3000);	
		
		for(int i=0; i<6; i++) {
		Actions pageup = new Actions(driver);
		pageup.sendKeys(Keys.PAGE_UP).build().perform();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		for(int i=0; i<=2; i++) {
			Actions pagedn1 = new Actions(driver);
			pagedn1.sendKeys(Keys.PAGE_DOWN).build().perform();
			}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		
		driver.findElement(By.xpath("//*[@id=\"F3C1\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F3C1\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F3C2\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F3C2\"]/option[2]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F3C3\"]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"F3C3\"]/option[3]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[3]/div[1]/div/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	Thread.sleep(1000);	
		for(int i=0; i<11; i++) {
			Actions pagedowne = new Actions(driver);
			pagedowne.sendKeys(Keys.PAGE_DOWN).build().perform();
			}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[7]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		
		for(int i=0; i<12; i++) {
			Actions pagedowner = new Actions(driver);
			pagedowner.sendKeys(Keys.PAGE_DOWN).build().perform();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//	Thread.sleep(1000);	
			}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[7]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
	} 

@Test (priority = 12)
	public void DeleteForm() throws Exception {		
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a.more.btn-xs.bigger.more-yellow.dropdown-toggle")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div.widget-menu.open > ul > li:nth-child(8) > a")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#txtdeleteform")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("#txtdeleteform")).sendKeys("REMOVE");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#deletebuttonconfirm")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.success_model.info_model.in > div > div > div.modal-footer > button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);
	}

	@AfterClass()
		public void closeApp()
		{
		driver.quit();
		} 

	}