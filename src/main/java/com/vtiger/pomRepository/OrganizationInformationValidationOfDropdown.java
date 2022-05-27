package com.vtiger.pomRepository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class OrganizationInformationValidationOfDropdown
	{
		@FindBy(id="dtlview_Industry")
		private WebElement actualOrgdropDownIndustry;	
		
		@FindBy(id="dtlview_Type")
		private WebElement actualOrgdropDownType;

	public OrganizationInformationValidationOfDropdown(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public String orgDropvalidateIndustry() 
	{
		 return actualOrgdropDownIndustry.getText();	
	}
		
	public String orgDropvalidateType() 
	{
		 return actualOrgdropDownType.getText();	
	}
		
		
	}


