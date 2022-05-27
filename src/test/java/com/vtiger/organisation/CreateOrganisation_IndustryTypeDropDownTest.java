package com.vtiger.organisation;


	import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.BaseClass;
import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;
import com.vtiger.pomRepository.CreateNewOrgInfoPage;
import com.vtiger.pomRepository.CreateNewOrganizationPage;
import com.vtiger.pomRepository.OrganizationInformationValidationOfDropdown;
import com.vtiger.pomRepository.OrganizationPage;

	

	public class CreateOrganisation_IndustryTypeDropDownTest extends BaseClass
	{
		@Test
		public void org_dropdownTest() throws EncryptedDocumentException, IOException, InterruptedException
		{
			String oname = MsExcelLibraries.getDataFromExcel("Organisation", 2, 1)+random;
			
			OrganizationPage Orgpage=new OrganizationPage(driver);
			CreateNewOrganizationPage OrgNewPage=new CreateNewOrganizationPage(driver);
			CreateNewOrgInfoPage infoPage=new CreateNewOrgInfoPage(driver);
			OrganizationInformationValidationOfDropdown validate=new OrganizationInformationValidationOfDropdown(driver);
		
		
			if(driver.getTitle().contains("Home"))
			{
				MsExcelLibraries.setCellvalue("Organisation", 8, 6,"Home page is displayeddd");
				MsExcelLibraries.setCellvalue("Organisation", 8, 7,"Pass");

			}
			homepage.homePageOrganizationAction();
			if(driver.getTitle().contains("Organizations"))
			{
				MsExcelLibraries.setCellvalue("Organisation", 9, 6,"Organization page is displayed");
				MsExcelLibraries.setCellvalue("Organisation", 9, 7,"Pass");
			}
			Orgpage.organizationPageAction();
			if(driver.getTitle().contains("Organizations"))
			{
				MsExcelLibraries.setCellvalue("Organisation", 10, 6,"create new Organization page is displayed");
				MsExcelLibraries.setCellvalue("Organisation", 10, 7,"Pass");
			}
			OrgNewPage.organizationInformationPageAction(oname);
		    infoPage.industryNameOfOrg("Education");
			infoPage.accountTypeOfOrg("Press");
			
			OrgNewPage.organizationInformationPageSaveAction();
			WebDriverLibraries.waitUtillElementVisible(homepage.getInformationHeader());
			String actualIndustryName = validate.orgDropvalidateIndustry();
			String actualTypeName = validate.orgDropvalidateType();
			
			
			JavaLibraries.assertionThroughIfCondition(actualIndustryName, actualTypeName, "education and type");
			MsExcelLibraries.setCellvalue("Organisation", 11, 6,"Industry value and type is selected");
			MsExcelLibraries.setCellvalue("Organisation", 11, 7,"Pass");
			JavaLibraries.printStatement("Organization created with indusrty and type");


		}

	

}
