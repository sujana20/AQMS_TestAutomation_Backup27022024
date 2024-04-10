package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Languages extends testBase.TestBase {

@Test (priority=1)
public void LanguageKannada() throws Exception {
	
	loginAs.qa("test190324@yopmail.com", "test190324");
	logger.info("Logged in Successfully");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
	takeScreenshot.save("Form list Visible"); 
	
	driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Languag")).click();
	Thread.sleep(3000);
	
	//-----------------------Language selection---------------
	
	WebElement FooterFontFamily = driver.findElement(By.xpath("//select[@class= 'form-control ng-pristine ng-untouched ng-valid']")); 
	FooterFontFamily.click();
	Thread.sleep(2000);
	Select FooterFont  = new Select(FooterFontFamily);
	FooterFont.selectByVisibleText("Kannada");
	logger.info("Language selected");
	Thread.sleep(5000);
	
	WebElement EmployeeForm = driver.findElement(By.xpath("//*[contains(@placeholder, \"Employee Form\")]"));
	EmployeeForm.click();
	EmployeeForm.sendKeys("ಉದ್ಯೋಗಿ ಫಾರ್ಮ್");
	
	WebElement EnterName = driver.findElement(By.xpath("//*[contains(@placeholder, \"Enter Name\")]"));
	EnterName.click();
	EnterName.sendKeys("ಹೆಸರನ್ನು ನಮೂದಿಸಿ");
	
	Thread.sleep(3000);
	JavascriptExecutor js0 = (JavascriptExecutor) driver;
	WebElement element0 = driver.findElement(By.xpath("//div[4]/input[1]"));
	js0.executeScript("arguments[0].scrollIntoView()", element0);
	
	WebElement FirstName = driver.findElement(By.xpath("//div[3]/input[1]"));
	FirstName.click();
	FirstName.sendKeys("ಮೊದಲ ಹೆಸರು");
	
	WebElement LastName = driver.findElement(By.xpath("//div[4]/input[1]"));
	LastName.click();
	LastName.sendKeys("ಕೊನೆಯ ಹೆಸರು");
	
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	js.executeScript("arguments[0].scrollIntoView()", element);
	
	WebElement EnterPhonenumber = driver.findElement(By.xpath("//div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	EnterPhonenumber.click();
	EnterPhonenumber.sendKeys("ಫೋನ್ ಸಂಖ್ಯೆ");
	
	WebElement EMail = driver.findElement(By.xpath("//*[contains(@placeholder, \"EMail\")]"));
	EMail.click();
	EMail.sendKeys("ಇಮೇಲ್");
	
	WebElement SelectRole = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	SelectRole.click();
	SelectRole.sendKeys("ಪಾತ್ರವನ್ನು ಆಯ್ಕೆಮಾಡಿ");
	
	Thread.sleep(3000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement element1 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js1.executeScript("arguments[0].scrollIntoView()", element1);
	
	WebElement Tester = driver.findElement(By.xpath("//div[3]/div[1]/input[1]"));
	Tester.click();
	Tester.sendKeys("ಪರೀಕ್ಷಕ");
	
	WebElement Developer = driver.findElement(By.xpath("//div[4]/div[1]/input[1]"));
	Developer.click();
	Developer.sendKeys("ಡೆವಲಪರ್");
	
	Thread.sleep(3000);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	WebElement element2 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js2.executeScript("arguments[0].scrollIntoView()", element2);
	
	WebElement Lead = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Lead.click();
	Lead.sendKeys("ನೇತ್ರತ್ವ");
	
	WebElement Photo = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Photo.click();
	Photo.sendKeys("ಫೋಟೋ");
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();	
	
	}


@Test (priority=2)
public void Language_Telugu() throws Exception {	
	loginAs.qa("test190324@yopmail.com", "test190324");
	logger.info("Logged in Successfully");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
	takeScreenshot.save("Form list Visible"); 
	
	driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Languag")).click();
	Thread.sleep(3000);
	
	//-----------------------Language selection---------------
	
	WebElement FooterFontFamily = driver.findElement(By.xpath("//select[@class= 'form-control ng-pristine ng-untouched ng-valid']")); 
	FooterFontFamily.click();
	Thread.sleep(2000);
	Select FooterFont  = new Select(FooterFontFamily);
	FooterFont.selectByVisibleText("Telugu");
	logger.info("Language selected");
	Thread.sleep(5000);
	
	WebElement EmployeeForm = driver.findElement(By.xpath("//*[contains(@placeholder, \"Employee Form\")]"));
	EmployeeForm.click();
	EmployeeForm.sendKeys("ఉద్యోగి ఫారం");
	
	WebElement EnterName = driver.findElement(By.xpath("//*[contains(@placeholder, \"Enter Name\")]"));
	EnterName.click();
	EnterName.sendKeys("పేరు నమోదు చేయండి");
	
	Thread.sleep(3000);
	JavascriptExecutor js0 = (JavascriptExecutor) driver;
	WebElement element0 = driver.findElement(By.xpath("//div[4]/input[1]"));
	js0.executeScript("arguments[0].scrollIntoView()", element0);
	
	WebElement FirstName = driver.findElement(By.xpath("//div[3]/input[1]"));
	FirstName.click();
	FirstName.sendKeys("మొదటి పేరు");
	
	WebElement LastName = driver.findElement(By.xpath("//div[4]/input[1]"));
	LastName.click();
	LastName.sendKeys("చివరి పేరు");
	
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	js.executeScript("arguments[0].scrollIntoView()", element);
	
	WebElement EnterPhonenumber = driver.findElement(By.xpath("//div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	EnterPhonenumber.click();
	EnterPhonenumber.sendKeys("ఫోన్ నంబర్‌ను నమోదు చేయండి");
	
	WebElement EMail = driver.findElement(By.xpath("//*[contains(@placeholder, \"EMail\")]"));
	EMail.click();
	EMail.sendKeys("ఇమెయిల్");
	
	WebElement SelectRole = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	SelectRole.click();
	SelectRole.sendKeys("పాత్రను ఎంచుకోండి");
	
	Thread.sleep(3000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement element1 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js1.executeScript("arguments[0].scrollIntoView()", element1);
	
	WebElement Tester = driver.findElement(By.xpath("//div[3]/div[1]/input[1]"));
	Tester.click();
	Tester.sendKeys("టెస్టర్");
	
	WebElement Developer = driver.findElement(By.xpath("//div[4]/div[1]/input[1]"));
	Developer.click();
	Developer.sendKeys("డెవలపర్");
	
	Thread.sleep(3000);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	WebElement element2 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js2.executeScript("arguments[0].scrollIntoView()", element2);
	
	WebElement Lead = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Lead.click();
	Lead.sendKeys("దారి");
	
	WebElement Photo = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Photo.click();
	Photo.sendKeys("ఫోటో");
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();	
	
}

@Test (priority=3)
public void Language_French() throws Exception {	
	loginAs.qa("test190324@yopmail.com", "test190324");
	logger.info("Logged in Successfully");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
	takeScreenshot.save("Form list Visible"); 
	
	driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Languag")).click();
	Thread.sleep(3000);
	
	//-----------------------Language selection---------------
	
	WebElement FooterFontFamily = driver.findElement(By.xpath("//select[@class= 'form-control ng-pristine ng-untouched ng-valid']")); 
	FooterFontFamily.click();
	Thread.sleep(2000);
	Select FooterFont  = new Select(FooterFontFamily);
	FooterFont.selectByVisibleText("French");
	logger.info("Language selected");
	Thread.sleep(5000);
	
	WebElement EmployeeForm = driver.findElement(By.xpath("//*[contains(@placeholder, \"Employee Form\")]"));
	EmployeeForm.click();
	EmployeeForm.sendKeys("Formulaire d'employé");
	
	WebElement EnterName = driver.findElement(By.xpath("//*[contains(@placeholder, \"Enter Name\")]"));
	EnterName.click();
	EnterName.sendKeys("Entrez le nom");
	
	Thread.sleep(3000);
	JavascriptExecutor js0 = (JavascriptExecutor) driver;
	WebElement element0 = driver.findElement(By.xpath("//div[4]/input[1]"));
	js0.executeScript("arguments[0].scrollIntoView()", element0);
	
	WebElement FirstName = driver.findElement(By.xpath("//div[3]/input[1]"));
	FirstName.click();
	FirstName.sendKeys("Prénom");
	
	WebElement LastName = driver.findElement(By.xpath("//div[4]/input[1]"));
	LastName.click();
	LastName.sendKeys("Nom de famille");
	
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	js.executeScript("arguments[0].scrollIntoView()", element);
	
	WebElement EnterPhonenumber = driver.findElement(By.xpath("//div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	EnterPhonenumber.click();
	EnterPhonenumber.sendKeys("Entrez le numéro de téléphone");
	
	WebElement EMail = driver.findElement(By.xpath("//*[contains(@placeholder, \"EMail\")]"));
	EMail.click();
	EMail.sendKeys("E-mail");
	
	WebElement SelectRole = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	SelectRole.click();
	SelectRole.sendKeys("Sélectionnez un rôle");
	
	Thread.sleep(3000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement element1 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js1.executeScript("arguments[0].scrollIntoView()", element1);
	
	WebElement Tester = driver.findElement(By.xpath("//div[3]/div[1]/input[1]"));
	Tester.click();
	Tester.sendKeys("Testeuse");
	
	WebElement Developer = driver.findElement(By.xpath("//div[4]/div[1]/input[1]"));
	Developer.click();
	Developer.sendKeys("Développeur");
	
	Thread.sleep(3000);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	WebElement element2 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js2.executeScript("arguments[0].scrollIntoView()", element2);
	
	WebElement Lead = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Lead.click();
	Lead.sendKeys("chef");
	
	WebElement Photo = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Photo.click();
	Photo.sendKeys("Photo");
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();		
}

@Test (priority=4)
public void Language_Arabic() throws Exception {	
	loginAs.qa("test190324@yopmail.com", "test190324");
	logger.info("Logged in Successfully");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//header/ul[1]/li[6]/a[1]/span[1]")).click();
	takeScreenshot.save("Form list Visible"); 
	
	driver.findElement(By.xpath("//a[@title=\" edit\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Languag")).click();
	Thread.sleep(3000);
	
	//-----------------------Language selection---------------
	
	WebElement FooterFontFamily = driver.findElement(By.xpath("//select[@class= 'form-control ng-pristine ng-untouched ng-valid']")); 
	FooterFontFamily.click();
	Thread.sleep(2000);
	Select FooterFont  = new Select(FooterFontFamily);
	FooterFont.selectByVisibleText("Arabic");
	logger.info("Language selected");
	Thread.sleep(5000);
	
	WebElement EmployeeForm = driver.findElement(By.xpath("//*[contains(@placeholder, \"Employee Form\")]"));
	EmployeeForm.click();
	EmployeeForm.sendKeys("استمارة الموظف");
	
	WebElement EnterName = driver.findElement(By.xpath("//*[contains(@placeholder, \"Enter Name\")]"));
	EnterName.click();
	EnterName.sendKeys("أدخل الاسم");
	
	Thread.sleep(3000);
	JavascriptExecutor js0 = (JavascriptExecutor) driver;
	WebElement element0 = driver.findElement(By.xpath("//div[4]/input[1]"));
	js0.executeScript("arguments[0].scrollIntoView()", element0);
	
	WebElement FirstName = driver.findElement(By.xpath("//div[3]/input[1]"));
	FirstName.click();
	FirstName.sendKeys("الاسم الأول");
	
	WebElement LastName = driver.findElement(By.xpath("//div[4]/input[1]"));
	LastName.click();
	LastName.sendKeys("اسم العائلة");
	
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	js.executeScript("arguments[0].scrollIntoView()", element);
	
	WebElement EnterPhonenumber = driver.findElement(By.xpath("//div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	EnterPhonenumber.click();
	EnterPhonenumber.sendKeys("أدخل رقم الهاتف");
	
	WebElement EMail = driver.findElement(By.xpath("//*[contains(@placeholder, \"EMail\")]"));
	EMail.click();
	EMail.sendKeys("بريد إلكتروني");
	
	WebElement SelectRole = driver.findElement(By.xpath("//*[@placeholder=\"Select Role\"]"));
	SelectRole.click();
	SelectRole.sendKeys("حدد الدور");
	
	Thread.sleep(3000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement element1 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js1.executeScript("arguments[0].scrollIntoView()", element1);
	
	WebElement Tester = driver.findElement(By.xpath("//div[3]/div[1]/input[1]"));
	Tester.click();
	Tester.sendKeys("اختبار");
	
	WebElement Developer = driver.findElement(By.xpath("//div[4]/div[1]/input[1]"));
	Developer.click();
	Developer.sendKeys("مطور");
	
	Thread.sleep(3000);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	WebElement element2 = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	js2.executeScript("arguments[0].scrollIntoView()", element2);
	
	WebElement Lead = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Lead.click();
	Lead.sendKeys("قيادة");
	
	WebElement Photo = driver.findElement(By.xpath("//div[5]/div[1]/input[1]"));
	Photo.click();
	Photo.sendKeys("صورة");
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();		
}

@Test (priority=9)
public void Language_Bahasa() throws Exception {	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div/div[2]/div[1]/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div/div[2]/div[1]/select/option[2]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[2]/div/div/div/div[1]/div[1]/input")).click();
	 
	//Thread.sleep(2000);	
	Actions scroll = new Actions(driver);
	scroll.sendKeys(Keys.PAGE_DOWN).build().perform();	
	 
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/ul/li[2]/button")).click(); 
	 
	//Thread.sleep(2000);	
	Actions scro = new Actions(driver);
	scro.sendKeys(Keys.PAGE_UP).build().perform();	
	 
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[2]/div/div/div/div[1]/div[1]/input")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[2]/div/div/div/div[1]/div[1]/input")).sendKeys("bentuk bahasa");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("أotomatisasi untuk fungsi bahasa");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[3]/div/div/div/div[1]/div[1]/input")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[3]/div/div/div/div[1]/div[1]/input")).sendKeys("bidang teks");
	 
	//Thread.sleep(2000);	

	Actions scroll1 = new Actions(driver);
	scroll1.sendKeys(Keys.PAGE_DOWN).build().perform();	
	 
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[4]/div/div/div/div[1]/div[1]/input")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[4]/div/div/div/div[1]/div[1]/input")).sendKeys("jumlah");
	 
	//Thread.sleep(2000);	
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/ul/li[2]/button")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	 
	//Thread.sleep(2000);	
}

@Test (priority=10)
public void Language_Edit() throws Exception {	
	driver.findElement(By.xpath("//*[@id=\"sidebar1\"]/div/div[2]/div/div/div[2]/button/span[1]/i")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[2]/div/div/div/div[1]/div[1]/input")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div[2]/div/div/div/div[1]/div[1]/input")).sendKeys("భాషలు");
	 
	//Thread.sleep(2000);	

	Actions scroll1 = new Actions(driver);
	scroll1.sendKeys(Keys.PAGE_DOWN).build().perform();	
	 
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/ul/li[2]/button")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	 
	//Thread.sleep(2000);	
}

@Test (priority=11)
public void ViewForm() throws Exception {	
	driver.findElement(By.xpath("//*[@id=\"admin\"]/section/div[1]/div/div/div[1]/div/li[2]/a")).click();
	 
	//Thread.sleep(3000);	
	driver.findElement(By.xpath("//*[@id=\"widget-box-1\"]/div[1]/div/div[1]/a[4]")).click();
	 
	//Thread.sleep(3000);	
}

@Test (priority=12)
public void FormSubmissions() throws Exception {	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).sendKeys("Languages text");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).sendKeys("123456");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[3]/div/button")).click();
	 
	//Thread.sleep(3000);	
//English submission
	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[2]")).click();
	 
	//Thread.sleep(2000);	
//Telugu Language Selection
	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).sendKeys("తెలుగులో పరీక్ష రూపం");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).sendKeys("123456");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[3]/div/button")).click();
	 
	//Thread.sleep(3000);	
// Telugu Submission
	

	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[3]")).click();
	 
	//Thread.sleep(2000);	
//Kannada Language Selection
	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).sendKeys("ಪರೀಕ್ಷಾ ರೂಪ");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).sendKeys("123456");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[3]/div/button")).click();
	 
	//Thread.sleep(3000);	
// Kannada Submission
	
	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[1]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[4]")).click();
	 
	//Thread.sleep(2000);	
//French Language Selection
	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).sendKeys("formulaire de test");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).sendKeys("123456");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[3]/div/button")).click();
	 
	//Thread.sleep(3000);	
// French Submission	
	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[1]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[6]")).click();
	 
	//Thread.sleep(2000);	
//Bahasa Language Selection
	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).sendKeys("formulir pengujian");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).sendKeys("123456");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[3]/div/button")).click();
	 
	//Thread.sleep(3000);	
// Bahasa Submission
	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[5]")).click();
	 
	//Thread.sleep(2000);	
//Arabic Language Selection
	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F1\"]")).sendKeys("نموذج الاختبار");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"F2\"]")).sendKeys("123456");
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[3]/div/button")).click();
	 
	//Thread.sleep(3000);	
// Arabic Submission
	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"swiftformsControlsRoot\"]/div/div[1]/div[1]/div/h6/div/div/select/option[1]")).click();
	 
	//Thread.sleep(2000);	
//English redirection	
	
	driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[3]/div/a")).click();
	 
	//Thread.sleep(3000);	
//Close	
}

@Test (priority=13)
public void EntriesView() throws Exception {	
	driver.findElement(By.xpath("//*[@id=\"widget-box-1\"]/div[1]/div/div[1]/a[3]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"admin\"]/div[1]/div[1]/div/div[1]/div/li[2]/a")).click();
	 
	//Thread.sleep(2000);	
}

@Test (priority=14)
public void Language_Delete() throws Exception {	
	driver.findElement(By.xpath("//*[@id=\"widget-box-1\"]/div[1]/div/div[1]/a[5]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"widget-box-1\"]/div[1]/div/div[1]/ul/li[2]/a")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"sidebar1\"]/div/div[2]/div[5]/div/div[3]/button/span[1]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	 
	//Thread.sleep(2000);	
}

@Test (priority=15)
public void DeleteForm() throws Exception {	
	driver.findElement(By.xpath("//*[@id=\"admin\"]/section/div[1]/div/div/div[1]/div/li[2]/a")).click();
	 
	//Thread.sleep(2000);	
	driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div:nth-child(1) > a.more.btn-xs.bigger.more-yellow.dropdown-toggle")).click();
	 
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("#widget-box-1 > div.widget-header > div > div.widget-menu.open > ul > li:nth-child(8) > a")).click();
	 
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("#txtdeleteform")).click();
	 
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("#txtdeleteform")).sendKeys("REMOVE");
	 
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("#deletebuttonconfirm")).click();
	 
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.success_model.info_model.in > div > div > div.modal-footer > button")).click();
	 
	//Thread.sleep(2000);
}

@AfterClass()
	public void closeApp()
	{
	driver.quit();
	} 




}