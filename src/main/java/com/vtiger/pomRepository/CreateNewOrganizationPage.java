package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreateNewOrganizationPage 
	{
		@FindBy(xpath="//input[@name='accountname']")
		private WebElement organizationName;
		
		@FindBy(xpath = "//input[@accesskey='S']")
		private WebElement organizationSaveBtn;
		
		public CreateNewOrganizationPage (WebDriver driver) 
		{
			PageFactory.initElements(driver, this);	
		}

		public void organizationInformationPageAction(String lastName) 
		{
			organizationName.sendKeys(lastName);	
		}

		
		public void organizationInformationPageSaveAction() 
		{
			organizationSaveBtn.click();	
		}
		
		}


