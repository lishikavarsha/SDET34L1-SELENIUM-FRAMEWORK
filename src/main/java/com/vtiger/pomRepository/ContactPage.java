package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ContactPage 
	{
		@FindBy(xpath = "//input[@name='lastname']")
		private WebElement contactLastName;

		@FindBy(xpath = "//img[@alt='Create Contact...']")
		private WebElement createNewContactBtn;

		@FindBy(xpath = "//input[@name='account_name']/..//img[@alt='Select']")
		private WebElement selectContactBtn;

		@FindBy(xpath ="//input[@title='Save [Alt+S]']")
		private WebElement saveContactBtn;
		
		@FindBy(xpath ="//a[.='Go to Advanced Search']")
		private WebElement advanceSearchLink;

		public ContactPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		public void contactPageAction()
		{
			createNewContactBtn.click();

		}
		public void contactSelectClickAction()
		{
			selectContactBtn.click();	
		}
		public void contactSaveAction() throws InterruptedException
		{
			saveContactBtn.click();	
		}

		public void contactLastNameAction(String contactName)
		{
			contactLastName.sendKeys(contactName);	
		}

		public void clickAsdvanceSearchLink() 
		{
			advanceSearchLink.click();	
		}

	

}
