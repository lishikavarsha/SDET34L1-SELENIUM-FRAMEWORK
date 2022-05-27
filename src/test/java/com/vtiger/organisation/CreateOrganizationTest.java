package com.vtiger.organisation;



	import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.CreateNewOrganizationPage;
import com.vtiger.pomRepository.OrganisationInformationPage;
import com.vtiger.pomRepository.OrganizationPage;

	public class CreateOrganizationTest extends BaseClass
	{
        @Test
        
        	public void createorganizationTest() throws EncryptedDocumentException, IOException, InterruptedException
        	{
        		String orgname = MsExcelLibraries.getDataFromExcel("Organisation", 2, 1)+random;
        		OrganizationPage orgPage=new OrganizationPage(driver);
    			CreateNewOrganizationPage orgnewPage=new CreateNewOrganizationPage(driver);
    			OrganisationInformationPage orgInfoPage=new OrganisationInformationPage(driver);
    			
    			homepage.homePageOrganizationAction();    			
    			orgPage.organizationPageAction();
    			
    			orgnewPage.organizationInformationPageAction(orgname);
    			orgnewPage.organizationInformationPageSaveAction();
    			
    			
    			WebDriverLibraries.waitUtillElementVisible(homepage.getInformationHeader());
    			String actualRes = orgInfoPage.organisationInformationPageAction();	
    			JavaLibraries.assertionThroughIfCondition(actualRes, orgname, "Organization ");

		}

	

}
