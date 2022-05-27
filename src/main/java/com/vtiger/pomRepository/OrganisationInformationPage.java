package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class OrganisationInformationPage 
	{
		@FindBy(xpath="//span[@id='dtlview_Organization Name']")
		private WebElement excpectedOrgname;	


	public OrganisationInformationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public String organisationInformationPageAction() 
	{
		 return excpectedOrgname.getText();	
	}
	}


