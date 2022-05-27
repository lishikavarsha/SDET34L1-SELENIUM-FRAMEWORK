package com.vtiger.practice;



	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateOrgTest extends BaseClass
	{
		@Test
		public void createorgTest()
		{
			
	/*	public static void main(String[] args) throws IOException
		{
			JavaLibraries jutil = new JavaLibraries();
			FileLibraries.openPropertyFile(IconstantInterface.PROPERTYFILE_PATH);

			String url = FileLibraries.getDataFromPropertyFile("url");
			String un = FileLibraries.getDataFromPropertyFile("un");
			String pwd = FileLibraries.getDataFromPropertyFile("pwd");
			String timeout = FileLibraries.getDataFromPropertyFile("timeout");
			String browsername = FileLibraries.getDataFromPropertyFile("browsername");


			long longtimeout=jutil.stringToLong(timeout);	
			WebDriver driver1=null;
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
			driver1.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			driver1.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			WebElement tx = driver1.findElement(By.xpath("//input[@class='detailedViewTextBox' and @name='accountname']"));
			tx.sendKeys("SDET90");
			driver1.findElement(By.xpath("(//input[@class='crmbutton small save' and @title='Save [Alt+S]' and @accesskey='S'])[1]")).click();

			WebElement ver = driver1.findElement(By.xpath("//td[@id='mouseArea_Organization Name']"));

			String val = ver.getText();
			if(val.contains("SDET105"))
		      {
				System.out.println("already exist");
			    
			   }

			 else
			{
				System.out.println("not present");
			}


			/*if(driver.getPageSource().contains("SDET75"))
			{
				System.out.println("already exist");
			}

			else
			{
				System.out.println("not present");
			}

			/*driver.switchTo().alert().accept();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);*/
			WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions act=new Actions(driver);
			act.moveToElement(ele).perform();
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			driver.close(); 

		}

	

}
