package com.vtiger.campaign;



	import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.CompanionPage;
import com.vtiger.pomRepository.CreateNewCampanionPage;
import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;
      @Listeners(com.SDET34L1.genericLibraraies.ListenerImplementation.class)
	public class CreateCampaignsTest extends BaseClass
	{
		
		String cdata;

		    
			@Test(groups="regression")
			//@Listeners(com.SDET34L1.genericLibraraies.ListenerImplementation.class)
			public void campaignsTest() throws EncryptedDocumentException, IOException, InterruptedException
			{

				cdata= MsExcelLibraries.getDataFromExcel("Campaign", 2, 1)+random;
				CompanionPage campanionPage=new CompanionPage(driver);
				CreateNewCampanionPage creatnewCampanionPage=new CreateNewCampanionPage(driver);
				homepage.clickCampaign(driver);	
				campanionPage.campanionPageAction();
				creatnewCampanionPage.campaniontInformationPageSendName(cdata);
				creatnewCampanionPage.campaniontInformationPageClickOnSave();
				JavaLibraries.printStatement("campaign name has been created");
				Reporter.log("campaign name has been created");
				
				


		}

	

}
