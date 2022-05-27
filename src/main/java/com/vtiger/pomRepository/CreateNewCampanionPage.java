package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreateNewCampanionPage 
	{
		@FindBy(name = "campaignname")
		private WebElement campanionNameTxt;
		
		@FindBy(xpath ="//img[@alt='Select']")
		private WebElement selectCampanionBtn;
		
		@FindBy(xpath = "//input[@accesskey='S']")
		private WebElement contactSaveBtn;
		
		public CreateNewCampanionPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);	
		}

		public void campaniontInformationPageSendName(String lastName) 
		{
			campanionNameTxt.sendKeys(lastName);
		}
		
		public void campaniontInformationPageClickSelect() 
		{
			selectCampanionBtn.click();
		}
		
		public void campaniontInformationPageClickOnSave() 
		{
			contactSaveBtn.click();
		}
		
		
	

}
