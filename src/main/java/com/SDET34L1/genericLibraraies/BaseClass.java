package com.SDET34L1.genericLibraraies;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * this class contains implementation of all basic configuration annotations
 * @author Admin
 *this is a base class
 */
public class BaseClass 
{
	
	public String un;
	public String pwd;
	public String timeout;
	public String browsername;
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public JavaLibraries jutil;
	public int random;
	public static WebDriver staticdriver;
	
/**
 * in this annotation we open the database,open the property file,open the excel sheet
 * @throws IOException
 */
@BeforeSuite(groups="BaseClass")
public void beforesuiteTest() throws IOException
{
	FileLibraries.openPropertyFile(IconstantInterface.PROPERTYFILE_PATH);
       MsExcelLibraries.openExcel(IconstantInterface.EXCELFILE_PATH);
}
/**
 * in this annotation we fetch the common data from the property file,
 * create the instance for all generic utilities,
 * launch browser,
 * do the browser setting 
 * create the instance for common object repository class
 * @throws EncryptedDocumentException
 * @throws IOException
 */
//@Parameters("browser")
@BeforeClass(groups="BaseClass")
public void beforeclassTest(/*String browser*/) throws EncryptedDocumentException, IOException
{

	JavaLibraries jutil = new JavaLibraries();
	String url = FileLibraries.getDataFromPropertyFile("url");
	 un = FileLibraries.getDataFromPropertyFile("un");
	 pwd = FileLibraries.getDataFromPropertyFile("pwd");
	  timeout = FileLibraries.getDataFromPropertyFile("timeout");
	 random=jutil.getRandomNumber(1000);
	browsername = FileLibraries.getDataFromPropertyFile("browsername");
	
	
	
	switch(browsername)
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	default:
		System.out.println("Please specify proper browser key");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	}
	staticdriver=driver;
	WebDriverLibraries.navigateApp(url, driver);
	WebDriverLibraries.maximizeBrowser(driver);
	WebDriverLibraries.explicitlyWait(10, driver);
	loginpage=new LoginPage(driver);
	homepage=new HomePage(driver);
	WebDriverLibraries.initializeActions(driver);

}
/**
 * in this annotation we do login action
 */
@BeforeMethod(groups="BaseClass")
public void beforemethodTest()
{
	loginpage.loginAction(un, pwd);
}
/**
 * in this annotation we will do signoutaction
 */
@AfterMethod(groups="BaseClass")
public void aftermethodTest()
{
	homepage.signOutIconMouseHoverAction(driver);
}

/**
 * in this annotation we will close the browser instance
 * @throws IOException 
 */

@AfterClass(groups="BaseClass")
public void afterclassTest() throws IOException
{
	MsExcelLibraries.writeIntoExcel(IconstantInterface.EXCELFILE_PATH);
	WebDriverLibraries.quitbrowser(driver);
}

/**
 * in this annotation close the database
 * close exccel sheet
 * @throws IOException
 */
@AfterSuite(groups="BaseClass")
public void aftersuiteTest() throws IOException
{
	MsExcelLibraries.closeExcel();
}

	

}
