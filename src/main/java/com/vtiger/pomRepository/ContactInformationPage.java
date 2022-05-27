package com.vtiger.pomRepository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ContactInformationPage 
	{
		@FindBy(xpath="//span[@id='dtlview_Last Name']")
		private WebElement excpectedLastname;	

		
		@FindBy(xpath="//span[@id='dtlview_First Name']")
		private WebElement excpectedfristname;

	public ContactInformationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public String ContactInformationPageAction() 
	{
		 return excpectedLastname.getText();	
	}

	public String ContactfristNameValidate() 
	{
		 return excpectedfristname.getText();	
	}

	
}
