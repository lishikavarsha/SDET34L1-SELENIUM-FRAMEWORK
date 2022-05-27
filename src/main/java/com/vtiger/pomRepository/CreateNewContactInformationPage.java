package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreateNewContactInformationPage 
	{
		
		@FindBy(xpath = "//input[@name='firstname']")
		private WebElement contactFristName;
		
		@FindBy(xpath = "//input[@name='lastname']")
		private WebElement contactLastName;
		
		@FindBy(xpath = "//input[@accesskey='S']")
		private WebElement contactSaveBtn;
		
		public CreateNewContactInformationPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);	
		}

		public void contactInformationPageAction(String lastName,String fristName) 
		{
			contactFristName.sendKeys(fristName);
			contactLastName.sendKeys(lastName);
			contactSaveBtn.click();
			//organizationSelectBtn.click();
		}

	

}
