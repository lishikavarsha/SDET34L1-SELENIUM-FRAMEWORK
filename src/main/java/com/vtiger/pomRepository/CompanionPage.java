package com.vtiger.pomRepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CompanionPage
	{

		@FindBy(xpath = "//img[@alt='Create Campaign...']")
		private WebElement createNewCampanionBtn;
		
		public CompanionPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		public void campanionPageAction()
		{
			createNewCampanionBtn.click();
		}


	

}
