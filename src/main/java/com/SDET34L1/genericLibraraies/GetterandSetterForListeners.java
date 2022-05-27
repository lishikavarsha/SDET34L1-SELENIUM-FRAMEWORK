package com.SDET34L1.genericLibraraies;

import org.openqa.selenium.WebDriver;

import com.vtiger.pomRepository.HomePage;
import com.vtiger.pomRepository.LoginPage;

public class GetterandSetterForListeners {

	private static GetterandSetterForListeners instance;
	public FileLibraries filelibraries;
	public MsExcelLibraries excellibraries;
	public JavaLibraries javalibraries;
	public WebDriverLibraries webdriverlibraries;
	public int randomNumber;
	public static String username;
	public static String password;
	public HomePage homepage;
	public LoginPage loginpage;
	public WebDriver driver;
	public String browser;
	public String url;
	public long longTimeOut;
	
	
	private GetterandSetterForListeners() {}
	public static GetterandSetterForListeners getInstance()
	{
	
		if(instance==null)
		{
			instance=new GetterandSetterForListeners();
		}
		return instance;
	}
	public FileLibraries getFilelibraries() {
		return filelibraries;
	}
	public void setFilelibraries(FileLibraries filelibraries) {
		this.filelibraries = filelibraries;
	}
	public MsExcelLibraries getExcellibraries() {
		return excellibraries;
	}
	public void setExcellibraries(MsExcelLibraries excellibraries) {
		this.excellibraries = excellibraries;
	}
	public JavaLibraries getJavalibraries() {
		return javalibraries;
	}
	public void setJavalibraries(JavaLibraries javalibraries) {
		this.javalibraries = javalibraries;
	}
	public WebDriverLibraries getWebdriverlibraries() {
		return webdriverlibraries;
	}
	public void setWebdriverlibraries(WebDriverLibraries webdriverlibraries) {
		this.webdriverlibraries = webdriverlibraries;
	}
	public int getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		GetterandSetterForListeners.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		GetterandSetterForListeners.password = password;
	}
	public HomePage getHomepage() {
		return homepage;
	}
	public void setHomepage(HomePage homepage) {
		this.homepage = homepage;
	}
	public LoginPage getLoginpage() {
		return loginpage;
	}
	public void setLoginpage(LoginPage loginpage) {
		this.loginpage = loginpage;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getLongTimeOut() {
		return longTimeOut;
	}
	public void setLongTimeOut(long longTimeOut) {
		this.longTimeOut = longTimeOut;
	}

}
