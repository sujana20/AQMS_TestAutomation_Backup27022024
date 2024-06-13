package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
	
public class FormCreation extends testBase.TestBase{
	
@Test (priority=1)
	public void CreateForm() throws Exception {	
	loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
	//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
	logger.info("Logged in Successfully");
	Thread.sleep(4000); 
	
	driver.findElement(By.xpath("//a[@id='Createbutton']")).click();
	takeScreenshot.save("Clicked on Create form");
	driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();

	
	//----------------------------AddingControls------------------------//
	Thread.sleep(5000);
	// Check if the 'Name' control is added
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Name')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(" (//label[@class='lbl ctrlLabelText'])[1]")).click();
	WebElement DisplayName = driver.findElement(By.xpath("//input[@id='field_displayName']"));
	DisplayName.click();
	DisplayName.clear();
	DisplayName.sendKeys("Enter Name");
	logger.info("Name' control is added Successfully");
    
	Thread.sleep(3000);	
	driver.findElement(By.xpath("//body/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
	
    // Check if the 'Phone' control is added
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	Thread.sleep(3000);
 
    driver.findElement(By.xpath("//label[contains(text(),'Phone')]")).click();
    WebElement DisplayPhone = driver.findElement(By.xpath("//input[@id='field_displayName']"));
    DisplayPhone.click();
    DisplayPhone.clear();
    DisplayPhone.sendKeys("Enter Phone number");	
	logger.info("Phone control added Successfully");
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
    
    // Check if the 'EMail' control is added
	driver.findElement(By.xpath("//span[contains(text(),'EMail')]")).click();
	logger.info("EMail control added Successfully");
    
    // Check if the 'Drop Down' control is added
	driver.findElement(By.xpath("//span[contains(text(),'Drop Down')]")).click();
	Thread.sleep(3000);
	// Find the Drop Down label and click it
	WebElement dropDownLabel = driver.findElement(By.xpath("//label[contains(text(),'Drop Down')]"));
	dropDownLabel.click();

	// Find the Display Name input field and interact with it
	WebElement displayNameInput = driver.findElement(By.xpath("//input[@id='field_displayName']"));
	displayNameInput.click();
	displayNameInput.clear();
	displayNameInput.sendKeys("Select Role");

	// Find the first Text input field and interact with it
	WebElement firstTextInput = driver.findElement(By.xpath("//input[@value='option-1']"));
	firstTextInput.click();
	firstTextInput.clear();
	firstTextInput.sendKeys("Tester");

	// Find the second Text input field and interact with it
	WebElement secondTextInput = driver.findElement(By.xpath("//input[@value='option-2']"));
	secondTextInput.click();
	secondTextInput.clear();
	secondTextInput.sendKeys("Developer");

	// Find the third Text input field and interact with it
	WebElement thirdTextInput = driver.findElement(By.xpath("//input[@value='option-3']"));
	thirdTextInput.click();
	thirdTextInput.clear();
	thirdTextInput.sendKeys("Lead");
	
	logger.info("Drop Down control added Successfully");

	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
	
    // Check if the 'Custom Controls' section is displayed
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'Custom Controls')]")).click();
	driver.findElement(By.xpath("(//span[@class='designerCtrlLabel'])[29]")).click();
	logger.info("Custom Controls  added Successfully");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
	
	driver.findElement(By.xpath("/html/body/form/div/div/div[1]/ul/li[3]/a")).click();
	Thread.sleep(2000);  
	driver.findElement(By.cssSelector("#form_title")).clear();
	Thread.sleep(2000);  
	driver.findElement(By.cssSelector("#form_title")).sendKeys("Employee Form");

	takeScreenshot.save("Successfully Form Created");
	Thread.sleep(2000);	
	driver.findElement(By.cssSelector("#cmd_formSave")).click();
	Thread.sleep(15000);

	
}

	
@Test (priority=2)
public void FormView() throws Exception {		
	loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
	//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
	logger.info("Logged in Successfully");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
	takeScreenshot.save("Form list Visible");
	driver.findElement(By.xpath("(//div[contains(@class, 'widget-menu')]/a[contains(@title, 'view')])[1]")).click();
	logger.info("Form view successfull");
	
}


		//--------------------------Adding Themes-------------------------------
	@Test (priority=3)
	public void AddThemes() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
		takeScreenshot.save("Form list Visible"); 
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/nav[1]/div[2]/div[2]/ul[1]/li[12]/a[1]")).click();
		logger.info("themes page visible");

}

	@Test (priority=4)
	public void Themes_BodySection() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
		takeScreenshot.save("Form list Visible");
		
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='divprocessingclass'])[9]")).click();
		logger.info("themes page visible");
		
		
		driver.findElement(By.cssSelector("#basic-addon2")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Upload An Image')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Choose from gallery")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='divBodyBgSection']/div[2]/img[1]")).click();
		Thread.sleep(3000);		
		
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		logger.info("Background Image Updated successfully");
}
	
	@Test (priority=5)
	public void Themes_FormSection() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
		takeScreenshot.save("Form list Visible");
		
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='divprocessingclass'])[9]")).click();
		logger.info("themes page visible");
		
		//Background---------------------
		driver.findElement(By.xpath("//a[contains(text(),'Form Section')]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id='FormSectionTab']/div[1]/span[2]/i[1]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='divFormBgSection']/div[6]/img[1]")).click();
		Thread.sleep(3000);
		takeScreenshot.save("BG image updated");
		logger.info("BG image updated");
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
		
		
		//-----------------------Form Layout---------------------------//
		driver.findElement(By.xpath("//*[@id='collapseTwo']/div/div/div/div/div/div/a[2]")).click();
		Thread.sleep(3000);
		
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@class='ng-pristine ng-untouched ng-valid']"));
		dropdownElement.click();
		Thread.sleep(2000);
		Select dropdown  = new Select(dropdownElement);
		dropdown.selectByVisibleText("700px");
		dropdownElement.click();
		Thread.sleep(3000);
		
		//------------------------ Form Margin------------------------------//
		WebElement formTop = driver.findElement(By.xpath("//input[@ng-model=\"ThemeSettings.FormSection.FormSettings.FormPosition.Margin.top\"]"));
		formTop.click();
		formTop.clear();
		formTop.sendKeys("5");
		
		Thread.sleep(3000);
		WebElement formBottom = driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		formBottom.click();
		formBottom.clear();
		formBottom.sendKeys("5");
		
		Thread.sleep(3000);
		WebElement formLeft = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/input[1]"));
		formLeft.click();
		formLeft.clear();
		formLeft.sendKeys("65");
		
		Thread.sleep(3000);
		WebElement formRight = driver.findElement(By.xpath("//div[2]/div[1]/div[4]/input[1]"));
		formRight.click();
		formRight.clear();
		formRight.sendKeys("65");
		
		//--------------------------Border Styles-----------------------//
		
		Thread.sleep(3000);
		WebElement formRadius = driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[3]/div[2]/input[1]"));
		formRadius.click();
		formRadius.clear();
		formRadius.sendKeys("10");
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[3]/div[2]/input[1]"));
		js.executeScript("arguments[0].scrollIntoView()", element);

		
		Thread.sleep(3000);
		WebElement formWidth = driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[3]/div[2]/input[1]"));
		formWidth.click();
		formWidth.clear();
		formWidth.sendKeys("10");
		
		Thread.sleep(3000);
		WebElement StyledropdownElement = driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[3]/div[4]/select[1]"));
		StyledropdownElement.click();
		Thread.sleep(2000);
		Select Styledropdown  = new Select(StyledropdownElement);
		Styledropdown.selectByVisibleText("solid");
		StyledropdownElement.click();
		
		takeScreenshot.save("Layout added");
			
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
		logger.info("Forms Section working as expected");
		
	}
	
	@Test (priority=5)
	public void Themes_HeaderSection() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
		takeScreenshot.save("Form list Visible");
		
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='divprocessingclass'])[9]")).click();
		logger.info("themes page visible");
		
		driver.findElement(By.xpath("//a[contains(text(),'Header Section')]")).click();
		logger.info("HeaderSection Section is visible");
		Thread.sleep(3000);	
		
		//------------------------Background-----------------//
		//driver.findElement(By.xpath("(//span[@class='btn btn-default sb-input-addon'])[1]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='HeaderSectionTab']/div/div/span[1]")).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement headerImage = driver.findElement(By.xpath("//*[@id='divHeaderBgSection']/div[12]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView()", headerImage);
		
		driver.findElement(By.xpath("//*[@id='divHeaderBgSection']/div[12]/img[1]")).click();
		logger.info("image selected");
		Thread.sleep(3000);
		
		takeScreenshot.save("Bg image updated");
		
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
		logger.info("BG image added to header");
		
		//-------------------------Layout---------------------------//
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//div/a[@class='list-group-item text-center'])[2]")).click();
		
		logger.info("Layout selected");
		WebElement headerLogoElement = driver.findElement(By.id("logoddl"));
		headerLogoElement.click();
		Thread.sleep(2000);
		Select headerLogo  = new Select(headerLogoElement);
		headerLogo.selectByVisibleText("Right");
		//headerLogoElement.click();
		
		WebElement headerTitleElement = driver.findElement(By.id("logoddl"));
		headerTitleElement.click();
		Thread.sleep(2000);
		Select headerTitle  = new Select(headerTitleElement);
		headerTitle.selectByVisibleText("Left");
		//headerTitleElement.click();
		takeScreenshot.save("Layout updated");
		
		//----------------------------Logo-----------------------------//
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//div/a[@class='list-group-item text-center'])[3]")).click();
		
		logger.info("Logo tab selected");
		Thread.sleep(2000);
		WebElement logoTop = driver.findElement(By.xpath("//div[3]/div[4]/div[1]/div[1]/input[1]"));
		logoTop.click();
		logoTop.clear();
		logoTop.sendKeys("4");
		
		Thread.sleep(2000);
		WebElement logoBottom = driver.findElement(By.xpath("//div[3]/div[4]/div[1]/div[2]/input[1]"));
		logoBottom.click();
		logoBottom.clear();
		logoBottom.sendKeys("4");
		
		Thread.sleep(2000);
		WebElement logoLeft = driver.findElement(By.xpath("//div[3]/div[4]/div[1]/div[3]/input[1]"));
		logoLeft.click();
		logoLeft.clear();
		logoLeft.sendKeys("4");
		
		Thread.sleep(2000);
		WebElement logoRight = driver.findElement(By.xpath("//div[3]/div[4]/div[1]/div[4]/input[1]"));
		logoRight.click();
		logoRight.clear();
		logoRight.sendKeys("4");
		
		takeScreenshot.save("Logo Positions updated");
		logger.info("Logo Positions selected");
		
		//----------------------------Title-----------------------------//
		
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//div/a[@class='list-group-item text-center'])[4]")).click();
		
		logger.info("Title tab selected");
		
		//Hide Title-----
		Thread.sleep(3000);
		WebElement titleHide = driver.findElement(By.xpath("//input[@ng-change='removeTitle()']"));
		titleHide.click();
		titleHide.click();
		logger.info("Hide Title selected");
		
		//Font Family----
		Thread.sleep(3000);
		WebElement titleFamilyElement = driver.findElement(By.xpath("//div[1]/div[3]/div[1]/select[1]"));
		titleFamilyElement.click();
		Thread.sleep(2000);
		Select titleFamily  = new Select(titleFamilyElement);
		titleFamily.selectByVisibleText("Monaco");
		//headerTitleElement.click();
		
		//Font Size------
		Thread.sleep(3000);
		WebElement titleSize = driver.findElement(By.xpath("//div[4]/div[1]/div[4]/div[1]/input[1]"));
		titleSize.click();
		titleSize.clear();
		titleSize.sendKeys("30");
		
		//Font Weight-----
		Thread.sleep(3000);
		WebElement titleFontWeightElement = driver.findElement(By.xpath("//*[@ng-model=\"ThemeSettings.FormSection.Header.Title.Font.Weight\"]"));
		titleFontWeightElement.click();
		Thread.sleep(2000);
		Select titleFontWeight  = new Select(titleFontWeightElement);
		titleFontWeight.selectByVisibleText("600");
		titleFontWeightElement.click();
		
		//Font Style---------
		Thread.sleep(3000);
		WebElement titleFontStyleElement = driver.findElement(By.xpath("//div[7]/div[1]/select[1]"));
		titleFontStyleElement.click();
		Thread.sleep(2000);
		Select titleFontStyle  = new Select(titleFontStyleElement);
		titleFontStyle.selectByVisibleText("Italic");
		//titleFontStyleElement.click();
		
		//------------Title Positions----------
		
		Thread.sleep(3000);
		WebElement titleTop = driver.findElement(By.xpath("//div[4]/div[4]/div[1]/div[1]/input[1]"));
		titleTop.click();
		titleTop.clear();
		titleTop.sendKeys("4");
		
		Thread.sleep(3000);
		WebElement titleBottom = driver.findElement(By.xpath("//div[4]/div[4]/div[1]/div[2]/input[1]"));
		titleBottom.click();
		titleBottom.clear();
		titleBottom.sendKeys("10");
		
		Thread.sleep(3000);
		WebElement titleLeft = driver.findElement(By.xpath("//div[4]/div[4]/div[1]/div[3]/input[1]"));
		titleLeft.click();
		titleLeft.clear();
		titleLeft.sendKeys("4");
		
		Thread.sleep(3000);
		WebElement titleRight = driver.findElement(By.xpath("//div[4]/div[4]/div[1]/div[4]/input[1]"));
		titleRight.click();
		titleRight.clear();
		titleRight.sendKeys("4");
		
		takeScreenshot.save("Title Positions updated");
		logger.info("Title Positions selected");
		
		
		//-------------------------Sub Title-----------------------------------------//
		
		Thread.sleep(5000);	
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement SubTitle = driver.findElement(By.xpath("(//div/a[@class='list-group-item text-center'])[5]"));
		js1.executeScript("arguments[0].scrollIntoView()", SubTitle);
		
		driver.findElement(By.xpath("(//div/a[@class='list-group-item text-center'])[5]")).click();
		
		logger.info("Sub Title selected");
		
		Thread.sleep(3000);
		WebElement SubTitleFamilyElement = driver.findElement(By.xpath("//div[5]/div[2]/div[1]/div[1]/select[1]"));
		SubTitleFamilyElement.click();
		Thread.sleep(2000);
		Select SubTitleFamily  = new Select(SubTitleFamilyElement);
		SubTitleFamily.selectByVisibleText("Monaco");
		SubTitleFamilyElement.click();
		
		Thread.sleep(3000);
		WebElement subTitleSize = driver.findElement(By.xpath("//div[4]/div[4]/div[1]/div[4]/input[1]"));
		subTitleSize.click();
		subTitleSize.clear();
		subTitleSize.sendKeys("15");
		
		Thread.sleep(3000);
		WebElement subTitleWeightElement = driver.findElement(By.xpath("//div[4]/div[1]/select[1]"));
		subTitleWeightElement.click();
		Thread.sleep(2000);
		Select subTitleWeight  = new Select(subTitleWeightElement);
		subTitleWeight.selectByVisibleText("600");
		//titleFontWeightElement.click();
		
		Thread.sleep(3000);
		WebElement subTitleStyleElement = driver.findElement(By.xpath("//div[4]/div[1]/select[1]"));
		subTitleStyleElement.click();
		Thread.sleep(2000);
		Select subTitleStyle  = new Select(subTitleStyleElement);
		subTitleStyle.selectByVisibleText("Italic");
		//subTitleStyleElement.click();
		
		//----------------Sub Title Positions-----------------------
		
		Thread.sleep(3000);
		WebElement subTitleTop = driver.findElement(By.xpath("//div[5]/div[5]/div[1]/div[1]/input[1]"));
		subTitleTop.click();
		subTitleTop.clear();
		subTitleTop.sendKeys("4");
		
		Thread.sleep(3000);
		WebElement subTitleBottom = driver.findElement(By.xpath("//div[5]/div[1]/div[2]/input[1]"));
		subTitleBottom.click();
		subTitleBottom.clear();
		subTitleBottom.sendKeys("4");
		
		Thread.sleep(3000);
		WebElement subTitleLeft = driver.findElement(By.xpath("//div[5]/div[1]/div[3]/input[1]"));
		subTitleLeft.click();
		subTitleLeft.clear();
		subTitleLeft.sendKeys("6");
		
		Thread.sleep(3000);
		WebElement subTitleRight = driver.findElement(By.xpath("//div[5]/div[1]/div[4]/input[1]"));
		subTitleRight.click();
		subTitleRight.clear();
		subTitleRight.sendKeys("6");
		takeScreenshot.save("SubTitle Positions updated");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
		logger.info("SubTitle as expected");
	}
	
	@Test (priority=6)
	public void Themes_ContentSection() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
		takeScreenshot.save("Form list Visible");
		
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='divprocessingclass'])[9]")).click();
		logger.info("themes page visible");
		
		driver.findElement(By.xpath("//a[contains(text(),'Form Content Section')]")).click();
		logger.info("cliccked on Form Content Section");
		
		//Form Padding-------------------
		Thread.sleep(3000);
		WebElement PaddingTop = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		PaddingTop.click();
		PaddingTop.clear();
		PaddingTop.sendKeys("20");
		
		Thread.sleep(3000);
		WebElement PaddingBottom = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[2]/input[1]"));
		PaddingBottom.click();
		PaddingBottom.clear();
		PaddingBottom.sendKeys("15");
		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement scoll = driver.findElement(By.xpath("//div[3]/div[6]/div[1]/select[1]"));
		js1.executeScript("arguments[0].scrollIntoView()", scoll);
		
		Thread.sleep(3000);
		WebElement PaddingLeft = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[3]/input[1]"));
		PaddingLeft.click();
		PaddingLeft.clear();
		PaddingLeft.sendKeys("15");
		
		Thread.sleep(3000);
		WebElement PaddingRight = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[4]/input[1]"));
		PaddingRight.click();
		PaddingRight.clear();
		PaddingRight.sendKeys("15");
		takeScreenshot.save("ContentSection Padding updated");
		logger.info("ContentSection Padding selected");
		
		//Font Styles-----------------
		
		WebElement ContentFontFamily = driver.findElement(By.xpath("//div[3]/div[2]/div[1]/select[1]")); 
		ContentFontFamily.click();
		Thread.sleep(2000);
		Select ContentFont  = new Select(ContentFontFamily);
		ContentFont.selectByVisibleText("Helvetica");
		logger.info("ContentFontFamily selected");
		
		Thread.sleep(3000);
		WebElement ContentFontSize = driver.findElement(By.xpath("//div[3]/div[3]/div[1]/input[1]"));
		ContentFontSize.click();
		ContentFontSize.clear();
		ContentFontSize.sendKeys("15");
		logger.info("ContentFontSize selected");
		
		
		Thread.sleep(3000);
		WebElement ContentFontWeightElement = driver.findElement(By.xpath("//div[3]/div[5]/div[1]/select[1]"));
		ContentFontWeightElement.click();
		Thread.sleep(2000);
		Select ContentFontWeight  = new Select(ContentFontWeightElement);
		ContentFontWeight.selectByVisibleText("600");
		//ContentFontWeightElement.click();
		logger.info("ContentFontWeight selected");
		

		Thread.sleep(3000);
		WebElement ContentFontStyleElement = driver.findElement(By.xpath("//div[3]/div[6]/div[1]/select[1]"));
		ContentFontStyleElement.click();
		Thread.sleep(2000);
		Select ContentFontStyle  = new Select(ContentFontStyleElement);
		ContentFontStyle.selectByVisibleText("Italic");
		//ContentFontStyleElement.click();
		takeScreenshot.save("ContentSection Font Styles updated");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
		logger.info("ContentSection work as expected");
		
		
	}
		
	@Test (priority=7)
	public void Themes_FooterSection() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
		takeScreenshot.save("Form list Visible");
		
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='divprocessingclass'])[9]")).click();
		logger.info("themes page visible");
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Footer Section')]"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		driver.findElement(By.xpath("//a[contains(text(),'Footer Section')]")).click();
		logger.info("FooterSection selected");
		Thread.sleep(3000);
		
		//Footer Height------------------
		WebElement FooterSectionHeight = driver.findElement(By.xpath("//*[@id='FooterSectionTab']/div/input[1]"));
		FooterSectionHeight.click();
		FooterSectionHeight.clear();
		FooterSectionHeight.sendKeys("44");
		logger.info("FooterSectio height selected");
		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement scoll = driver.findElement(By.xpath("//div[2]/div[5]/div[2]/div[1]/div[3]/div[6]/select[1]"));
		js1.executeScript("arguments[0].scrollIntoView()", scoll);
		
		//Font Styles-------------------
		WebElement FooterFontFamily = driver.findElement(By.xpath("//div[2]/div[5]/div[2]/div[1]/div[3]/div[2]/select[1]")); 
		FooterFontFamily.click();
		Thread.sleep(2000);
		Select FooterFont  = new Select(FooterFontFamily);
		FooterFont.selectByVisibleText("Helvetica");
		logger.info("FooterFontFamily selected");
		
		Thread.sleep(3000);
		WebElement FooterFontSize = driver.findElement(By.xpath("//div[2]/div[5]/div[2]/div[1]/div[3]/div[3]/input[1]"));
		FooterFontSize.click();
		FooterFontSize.clear();
		FooterFontSize.sendKeys("15");
		logger.info("FooterFontSize selected");
		
		
		Thread.sleep(3000);
		WebElement FooterFontWeightElement = driver.findElement(By.xpath("//div[2]/div[5]/div[2]/div[1]/div[3]/div[5]/select[1]"));
		FooterFontWeightElement.click();
		Thread.sleep(2000);
		Select FooterFontWeight  = new Select(FooterFontWeightElement);
		FooterFontWeight.selectByVisibleText("600");
		//ContentFontWeightElement.click();
		logger.info("FooterFontWeight selected");
		

		Thread.sleep(3000);
		WebElement FooterFontStyleElement = driver.findElement(By.xpath("//div[2]/div[5]/div[2]/div[1]/div[3]/div[6]/select[1]"));
		FooterFontStyleElement.click();
		Thread.sleep(2000);
		Select FooterFontStyle  = new Select(FooterFontStyleElement);
		FooterFontStyle.selectByVisibleText("Italic");
		//FooterFontStyleElement.click();
		takeScreenshot.save("Footer Font Styles updated");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
		logger.info("Footer Section work as expected");	
		
	}
	
	@Test (priority=8)
	public void Themes_LabelStyles() throws Exception {
		
		loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
		//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
		logger.info("Logged in Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
		takeScreenshot.save("Form list Visible");
		
		driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='divprocessingclass'])[9]")).click();
		logger.info("themes page visible");
		
		driver.findElement(By.xpath("//a[contains(text(),'Label Styles')]")).click();
		logger.info("LabelStyles selected");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Label Styles')]"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		
		//Font Styles--------------------
		WebElement LabelStylesFamily = driver.findElement(By.xpath("//div[1]/div[2]/select[1]")); 
		LabelStylesFamily.click();
		Thread.sleep(2000);
		Select LabelStyles  = new Select(LabelStylesFamily);
		LabelStyles.selectByVisibleText("Helvetica");
		logger.info("LabelStyles Family selected");
		
		Thread.sleep(3000);
		WebElement LabelFontSize = driver.findElement(By.xpath("//div[6]/div[2]/div[1]/div[1]/div[3]/input[1]"));
		LabelFontSize.click();
		LabelFontSize.clear();
		LabelFontSize.sendKeys("15");
		logger.info("Label FontSize selected");
		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement scoll = driver.findElement(By.xpath("//div[1]/div[6]/select[1]"));
		js1.executeScript("arguments[0].scrollIntoView()", scoll);
		
	
		/*
		Thread.sleep(3000);
		WebElement LabelWeightElement = driver.findElement(By.xpath("//div[1]/div[5]/select[1]"));
		LabelWeightElement.click();
		Thread.sleep(2000);
		Select LabelWeight  = new Select(LabelWeightElement);
		LabelWeight.selectByVisibleText("600");
		//LabelWeightElement.click();
		logger.info("LabelStyles Weight selected");
		
		
		Thread.sleep(3000);
		WebElement LabelFontStyleElement = driver.findElement(By.xpath("//div[1]/div[6]/select[1]"));
		LabelFontStyleElement.click();
		Thread.sleep(2000);
		Select LabelFontStyle  = new Select(LabelFontStyleElement);
		LabelFontStyle.selectByVisibleText("Italic");
		//LabelFontStyleElement.click();
		takeScreenshot.save("LabelFont Styles updated");
		logger.info("LabelStyles Section work as expected");
		*/
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Got It !')]")).click();
	}
	/*
@Test (priority=9)
public void FormDelete() throws Exception {		
	loginAs.qa("vardhaman13@yopmail.com", "vardhaman13");
	//driver.findElement(By.xpath("//span[contains(text(),'test021')]")).click();
	logger.info("Logged in Successfully");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
	takeScreenshot.save("Form list Visible");
	driver.findElement(By.xpath("(//a[@class='more btn-xs bigger more-yellow dropdown-toggle'])[1]")).click();
	driver.findElement(By.xpath("//body/section[@id='admin']/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")).click();
	takeScreenshot.save("Form delete");
	Thread.sleep(3000);
	
	WebElement deleteFormInput = driver.findElement(By.xpath("//input[@id='txtdeleteform']"));
	deleteFormInput.click();
	deleteFormInput.sendKeys("REMOVE");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@id='deletebuttonconfirm']")).click();
	logger.info("Form deleted successfuly");
	Thread.sleep(5000);
	
	
}
*/
	
@AfterClass()
public void closeApp()
	{
	driver.quit();
	} 

}  