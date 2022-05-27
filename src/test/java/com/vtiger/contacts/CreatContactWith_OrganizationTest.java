package com.vtiger.contacts;


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
import com.vtiger.pomRepository.ContactPage;
import com.vtiger.pomRepository.CreateNewOrganizationPage;
import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;
import com.vtiger.pomRepository.OrganizationPage;
import com.vtiger.pomRepository.OrganizationsPage;

public class CreatContactWith_OrganizationTest extends BaseClass
{
	@Test
	public void creatcontactwith_organizationTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String excpectedContactName = MsExcelLibraries.getDataFromExcel("Contacts", 2, 1)+random;
		String orgname = MsExcelLibraries.getDataFromExcel("Contacts", 3, 1)+random;

		OrganizationPage orgPage=new OrganizationPage(driver);
		CreateNewOrganizationPage orgnewPage=new CreateNewOrganizationPage(driver);
		ContactPage contactpage = new ContactPage(driver);
		OrganizationsPage orgnewWindowpage=new OrganizationsPage(driver);

		homepage.homePageOrganizationAction();
		orgPage.organizationPageAction();
		orgnewPage.organizationInformationPageAction(orgname);
		orgnewPage.organizationInformationPageSaveAction();

		homepage.HomePageContactLink();
		contactpage.contactPageAction();
		contactpage.contactLastNameAction(excpectedContactName);
		contactpage.contactSelectClickAction();
		WebDriverLibraries.switchToWindow(driver, "Organizations");
		orgnewWindowpage.organizationnextWindowActions(orgname);
		WebDriverLibraries.switchToWindow(driver, "Contacts");
		contactpage.contactSaveAction();


		

	}






}
