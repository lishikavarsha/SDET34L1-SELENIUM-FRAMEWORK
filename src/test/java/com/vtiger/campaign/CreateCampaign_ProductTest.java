package com.vtiger.campaign;



	import java.io.IOException;
	import java.util.List;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.CampanionNewWindowPage;
import com.vtiger.pomRepository.CompanionPage;
import com.vtiger.pomRepository.CreateNewCampanionPage;
import com.vtiger.pomRepository.CreatingNewProductPage;
import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;
import com.vtiger.pomRepository.ProductPage;

import io.github.bonigarcia.wdm.WebDriverManager;
       @Listeners(com.SDET34L1.genericLibraraies.ListenerImplementation.class)
	public class CreateCampaign_ProductTest extends BaseClass

	{
		@Test(groups="sanity")
		public void createcampaign_productTest() throws EncryptedDocumentException, IOException, InterruptedException
		{
			String pname = MsExcelLibraries.getDataFromExcel("Product", 0, 1)+random;
			String cname = MsExcelLibraries.getDataFromExcel("Product", 1, 1)+random;
			JavaLibraries.printStatement(pname);
			JavaLibraries.printStatement(cname);
			
			ProductPage productPage=new ProductPage(driver);
			
			CreatingNewProductPage newProductPage=new CreatingNewProductPage(driver);
			CompanionPage campanionPage=new CompanionPage(driver);
			CreateNewCampanionPage newCampanionPage=new CreateNewCampanionPage(driver);
			CampanionNewWindowPage newWindowPage=new CampanionNewWindowPage(driver);
			
			homepage.homePageProductLink();
			productPage.productPageAction();
			
			newProductPage.productInformationPageSendName(pname);
			newProductPage.productInformationPageClickOnsave();
			
			homepage.clickCampaign(driver);
			campanionPage.campanionPageAction();
			newCampanionPage.campaniontInformationPageSendName(cname);
			newCampanionPage.campaniontInformationPageClickSelect();
			WebDriverLibraries.switchToWindow(driver, "Products");
			
			newWindowPage.organizationnextWindowActions(pname);
			WebDriverLibraries.switchToWindow(driver, "Campaigns");	
			newCampanionPage.campaniontInformationPageClickOnSave();
		




		}

	

}
