package com.vtiger.contacts;


	

	import java.io.IOException;

import javax.management.DescriptorKey;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.FileLibraries;
import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.ContactInformationPage;
import com.vtiger.pomRepository.ContactPage;
import com.vtiger.pomRepository.CreateNewContactInformationPage;
import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

	public class CreateContactsTest1 extends BaseClass
		
	
	{
		@Test(groups="sanity",description="testng:-CreateContactsTest1")
		@Description("Description:-CreateContactsTest1")
		@Epic("Epic:-CreateContactsTest1")
		@Story("Story:-CreateContactsTest1")
		@Step("Step:-CreateContactsTest1")
		@Severity(SeverityLevel.BLOCKER)
		public void createcontactsTest() throws EncryptedDocumentException, IOException, InterruptedException
		{
			String excpectedContactName = MsExcelLibraries.getDataFromExcel("Contacts", 2, 1)+random;
			ContactPage contactpage = new ContactPage(driver);
			ContactInformationPage contactinfopage=new ContactInformationPage(driver);
			CreateNewContactInformationPage newcontactpage = new CreateNewContactInformationPage(driver);
			homepage.HomePageContactLink();
			contactpage.contactPageAction();
			newcontactpage.contactInformationPageAction(excpectedContactName, excpectedContactName);;
			String actaulResult = contactinfopage.ContactInformationPageAction();
			JavaLibraries.assertionThroughIfCondition(actaulResult, excpectedContactName, "Contact ");
		
		
		
		
		
		

		}

	

}
