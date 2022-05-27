package com.vtiger.practice;



	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CompainDatabase
	{
		static WebDriver driver1;
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			
	       JavaLibraries jutil = new JavaLibraries();
			FileLibraries.openPropertyFile(IconstantInterface.PROPERTYFILE_PATH);
			String url = FileLibraries.getDataFromPropertyFile("url");
			String un = FileLibraries.getDataFromPropertyFile("un");
			String pwd = FileLibraries.getDataFromPropertyFile("pwd");
			String timeout = FileLibraries.getDataFromPropertyFile("timeout");
			String browsername = FileLibraries.getDataFromPropertyFile("browsername");
			long longtimeout=jutil.stringToLong(timeout);
			int random1=jutil.getRandomNumber(1000); 
			MsExcelLibraries.openExcel(IconstantInterface.EXCELFILE_PATH);
			String cdata = MsExcelLibraries.getDataFromExcel("Companion", 2, 1)+random1;
			//WebDriverLibrary.intailizeBrowser(browsername);
			//driver1=WebDriverLibrary.getDriver();
			switch(browsername)
			{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver1=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver1=new FirefoxDriver();
				break;
			default:
				System.out.println("Please specify proper browser key");
				WebDriverManager.chromedriver().setup();
				driver1=new ChromeDriver();
				break;
			}
		
			WebDriverLibraries.navigateApp(url, driver1);
			WebDriverLibraries.browserSetting(longtimeout, driver1);
			WebDriverLibraries.explicitlyWait(longtimeout, driver1);
			driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
			driver1.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
			driver1.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click();

			//mouse hover

			WebElement mhover = driver1.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif'] "));
			WebDriverLibraries.mouseHoverOnTheElement(mhover, driver1);


			driver1.findElement(By.name("Campaigns")).click();
			driver1.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
			driver1.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(cdata);
			driver1.findElement(By.xpath("(//input[@title='Save [Alt+S]' and @name='button' and @accesskey='S'])[1]")).click();
            
			

		}

	

}
