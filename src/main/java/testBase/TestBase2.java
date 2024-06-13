package testBase;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.LoginAs;

import java.time.Duration;

public class TestBase2 {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Logger logger;
    protected LoginAs loginAs;

    @BeforeClass (alwaysRun = true)
    public void start() {
        logger = LogManager.getLogger(TestBase2.class);
        PropertyConfigurator.configure("Log4j.properties");
        logger.info("Logger Started");
    }

    @BeforeMethod (alwaysRun = true)
    public void setUp() {
        logger.info("Setting up browser...");
        String br = "chrome";
        if (br.equalsIgnoreCase("chrome")) {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().clearDriverCache().setup();
            driver = new ChromeDriver(co);
            logger.info("Chrome launched");
        } else if (br.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            logger.info("Firefox launched");
        } else if (br.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            logger.info("Edge Browser launched");
        } else {
            logger.info("Incorrect Browser name");
            System.out.println("Enter valid browser name");
        }

        driver.get("https://www.ecubeapps.com/");
        logger.info("url Loaded");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        logger.info("maximized Browser window and added waits");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        loginAs = new LoginAs();
        
    }

        // Initialize all the classes in TestBase before using them in src/test.
        // com.qa.utility.ExcelHandling = new ExcelHandling();
        // login = new LoginPage();
        // uielement = new UIElement();
        // testngRunner = new TestngRunner();
        // takeScreenshot = new TakeScreenshots();
        // getCurrentDateTime = new GetCurrentDateTime();
        // loginAs = new LoginAs();}

    @AfterMethod (alwaysRun = true)
    public void TakeDown() {
        // Remove this line to prevent the browser from closing after each test case
        // driver.quit();
        logger.info("Test case completed");
    }

    @AfterClass (alwaysRun = true)
    public void stop() {
        logger.info("Automation Suite Executed Successfully");
        logout(); // Add this line to log out of the application
        driver.quit(); // Close the browser
    }

    public void logout() {
        // Add code to log out of the application
    }
}