package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class OrganizationsPage 
	{
		@FindBy(xpath ="//input[@id='search_txt']")
		private WebElement searchTxt;
		
		@FindBy(name="search")
		private WebElement searchBtn;
		
		@FindBy(xpath ="//tr[2]/td/a")
		private WebElement orgLink;
		
		public OrganizationsPage(WebDriver driver) 
		{
		PageFactory.initElements(driver,this);
		}
		
		public void organizationnextWindowActions(String orgname) throws InterruptedException
		{
			searchTxt.sendKeys(orgname);
			searchBtn.click();
			Thread.sleep(5000);
			orgLink.click();
			
		}
		
	

}
