package com.vtiger.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SDET34L1.genericLibraraies.IconstantInterface;
import com.SDET34L1.genericLibraraies.MsExcelLibraries;

public class TestngPracticeTest {
@Test(dataProvider="loginData")

public void practiceTest(String username,String password)
{
Reporter.log(username+"     ------->    "+password,true);

}


//public Object[][] loginData() 
//{
//	
//	Object[][] data = new Object[5][2];
//	data[0][0]="username";
//	data[0][1]="password";
//	
//	data[1][0]="username1";
//	data[1][1]="password1";
//	
//	data[2][0]="username2";
//	data[2][1]="password2";
//	
//	data[3][0]="username3";
//	data[3][1]="password3";
//	
//	data[4][0]="username4";
//	data[4][1]="password4";
//	
//	return data;
//}
@DataProvider
public Object[][] loginData() throws EncryptedDocumentException, IOException
{
	MsExcelLibraries.openExcel(IconstantInterface.EXCELFILE_PATH);
	return MsExcelLibraries.getMultipleDataFromExcel("loginData");
}
}
