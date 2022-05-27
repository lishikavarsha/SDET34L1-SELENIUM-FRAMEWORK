package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.SDET34L1.genericLibraraies.JavaLibraries;
import com.SDET34L1.genericLibraraies.WebDriverLibraries;

	public class HomePage
	{

		@FindBy(id ="qccombo")
		private WebElement createEventdropDown;
		
		@FindBy(xpath ="//a[.='Organizations']")
		private WebElement OrganizationsLink;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement adminstrationIcon;
		
		@FindBy(xpath = "//a[.='Sign Out']")
		private WebElement signOutLnk;
		
		@FindBy(xpath = "//a[.='Documents']")
		private WebElement documentLink;
		
		@FindBy(xpath = "//a[.='Contacts']")
		private WebElement contactLink;
		
		@FindBy(linkText = "More")
		private WebElement moreDropdown;

		@FindBy(linkText = "Campaigns")
		private WebElement campaignsTab;
		
		@FindBy(linkText = "Products")
		private WebElement productTab;
		
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement informationHeaderText;
		
		public HomePage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		public void homePageOrganizationAction() throws InterruptedException
		{
			OrganizationsLink.click();
			
		}
		public WebElement getInformationHeader() {
			return informationHeaderText;
		}
			
		public void homePageDocumentLink() 
		{
			documentLink.click();
		}
		
		public void homePageProductLink() 
		{
			productTab.click();
		}
		
		public void HomePageContactLink() throws InterruptedException 
		{
			JavaLibraries.customWait(contactLink, 10, 1000);
			contactLink.click();
		}
		
		public void clickCampaign(WebDriver driver)
		{
			WebDriverLibraries.mouseHoverOnTheElement(moreDropdown, driver);
			campaignsTab.click();
		}
		
		public void clickQuickEventdropdown(String visibleText)
		{
			WebDriverLibraries.selectDropDown(visibleText, createEventdropDown);
		}
		
		public void signOutIconMouseHoverAction(WebDriver driver) 
		{
			WebDriverLibraries.waitUtillElementVisible(informationHeaderText);
			
			//WebDriverLibraries.explicitlyWait(30, driver);
			//WebDriverLibraries.waitUtillElementVisible(adminstrationIcon);
			WebDriverLibraries.mouseHoverOntheElement(adminstrationIcon);
			signOutLnk.click();
		}

	

}
