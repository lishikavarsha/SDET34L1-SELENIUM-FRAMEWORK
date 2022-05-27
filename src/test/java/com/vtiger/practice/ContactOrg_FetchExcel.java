package com.vtiger.practice;



	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Random;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class ContactOrg_FetchExcel
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
		{
			FileInputStream file = new FileInputStream("./src/test/resources/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			Random raa1 = new Random();
			int random = raa1.nextInt(1000);
			 String lastname = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue()+random ;
			System.out.println(lastname);

			JavaLibraries jutil = new JavaLibraries();
			FileLibraries.openPropertyFile(IconstantInterface.PROPERTYFILE_PATH);

			String url = FileLibraries.getDataFromPropertyFile("url");
			String un = FileLibraries.getDataFromPropertyFile("un");
			String pwd = FileLibraries.getDataFromPropertyFile("pwd");
			String timeout = FileLibraries.getDataFromPropertyFile("timeout");
			String browsername = FileLibraries.getDataFromPropertyFile("browsername");


			long longtimeout=jutil.stringToLong(timeout);
			int random1=jutil.getRandomNumber(1000);
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

			driver1.get(url);
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(longtimeout, TimeUnit.SECONDS);
			driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
			driver1.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
			driver1.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click();
			
			System.out.println(driver1.getTitle());
			
			if(driver1.getTitle().contains("Home"))
			{
				wb.getSheet("Sheet1").getRow(8).createCell(6).setCellValue("homepage is dis");
				wb.getSheet("Sheet1").getRow(8).createCell(7).setCellValue("pass");
			}
			
			
			driver1.findElement(By.linkText("Contacts")).click();
			
			
			if(driver1.getTitle().contains("Contacts"))
			{
				wb.getSheet("Sheet1").getRow(9).createCell(6).setCellValue("contact page is displayed");
				wb.getSheet("Sheet1").getRow(9).createCell(7).setCellValue("pass");
			}
			
			
			
			
			
			
			
			WebElement ele3 = driver1.findElement(By.xpath("//img[@title='Create Contact...' and @src='themes/softed/images/btnL3Add.gif']"));
			ele3.click();
			WebElement element = driver1.findElement(By.xpath("//table//tbody/tr/td/a[text()='Contacts']"));
			element.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			WebElement ele4 = driver1.findElement(By.xpath("//img[@title='Create Contact...' and @src='themes/softed/images/btnL3Add.gif']"));
			driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
			
			driver1.findElement(By.xpath("(//input[@class='crmbutton small save' and @title='Save [Alt+S]' and @accesskey='S'])[1]")).click();
	       System.out.println(driver1.getTitle());
			
	if(driver1.getTitle().contains("Contacts"))
			{
				wb.getSheet("sheet1").getRow(10).createCell(6).setCellValue("contact is created");
				wb.getSheet("Sheet1").getRow(10).createCell(7).setCellValue("pass");
			}







			/*driver1.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			driver1.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			WebElement tx = driver1.findElement(By.xpath("//input[@class='detailedViewTextBox' and @name='accountname']"));
			tx.sendKeys(lastname);
			Thread.sleep(2000);
			driver1.findElement(By.xpath("(//input[@title='Save [Alt+S]' and @name='button'])[1]")).click();
			Thread.sleep(3000);
			
			
			
			
			
			
			
			
			
			
			/*WebDriverWait wait=new WebDriverWait(driver1, longtimeout);
			wait.until(ExpectedConditions.elementToBeClickable(ele3));
			ele3.click();
			Thread.sleep(1000);
			driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
			Thread.sleep(1000);
			driver1.findElement(By.xpath("(//img[@title='Select'])[1]")).click();

			//switch to another tab
			Set<String> id = driver1.getWindowHandles();
			ArrayList<String> child = new ArrayList<String>(id);
			String getchild = child.get(1);
			driver1.switchTo().window(getchild);
			driver1.manage().window().maximize();
			String title=driver1.getTitle();
			System.out.println("      "+title+" ");
			WebElement send = driver1.findElement(By.xpath("//input[@id='search_txt']"));
			send.sendKeys(lastname);
	    	driver1.findElement(By.name("search")).click();
	    	Thread.sleep(2000);
			driver1.findElement(By.xpath("//tr[2]/td/a")).click();
			String getparent = child.get(0);
			driver1.switchTo().window(getparent);
			driver1.findElement(By.xpath("(//input[@title='Save [Alt+S]' and @name='button'])[1]")).click();*/
			
			
	 MsExcelLibraries.writeIntoExcel(IconstantInterface.EXCELFILE_PATH);
	 MsExcelLibraries.closeExcel();

		}

	

}
