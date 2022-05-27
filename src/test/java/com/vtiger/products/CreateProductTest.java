package com.vtiger.products;



	import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.CreatingNewProductPage;
import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;
import com.vtiger.pomRepository.ProductPage;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateProductTest extends BaseClass
	{
		@Test
		public void createproductTest() throws EncryptedDocumentException, IOException, InterruptedException
		{
			String pname = MsExcelLibraries.getDataFromExcel("Product", 0, 1)+random;
			ProductPage productPage=new ProductPage(driver);
			CreatingNewProductPage newProductPage=new CreatingNewProductPage(driver);
			
			homepage.homePageProductLink();
			productPage.productPageAction();
			newProductPage.productInformationPageSendName(pname);
			newProductPage.productInformationPageClickOnsave();
		
			
		
		}

	}


