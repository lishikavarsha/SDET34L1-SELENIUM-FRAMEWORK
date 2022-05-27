package com.vtiger.documents;



	import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.CreateNewDocumentPage;
import com.vtiger.pomRepository.DocumentPage;
import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;

	public class CreateDocumentTest extends BaseClass
	{
		
		@Test
		public void createdocumentTest() throws EncryptedDocumentException, IOException, InterruptedException
		{
			String doctitle = MsExcelLibraries.getDataFromExcel("Document", 2, 1)+random;
			String textarea= MsExcelLibraries.getDataFromExcel("Document", 3, 1)+random;
			
			DocumentPage docPage=new DocumentPage(driver);
			CreateNewDocumentPage newDocPage=new CreateNewDocumentPage(driver);
			
			homepage.homePageDocumentLink();
			docPage.documentPageAction();
			newDocPage.documentPageSendTitle(doctitle);
			driver.switchTo().frame(0);
			newDocPage.documentPageSendTextAndCopyAll(textarea);
			driver.switchTo().defaultContent();
			newDocPage.documentPageBoldAndItalicText();
			newDocPage.documentPageFileUpload("C:\\Users\\Admin\\Desktop\\varshitha.txt");
			WebDriverLibraries.switchBackToHomePage(driver);
		

		}

	

}
