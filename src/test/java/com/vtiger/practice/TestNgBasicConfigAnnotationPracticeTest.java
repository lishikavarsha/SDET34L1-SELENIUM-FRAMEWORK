package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasicConfigAnnotationPracticeTest {
@Test
public void testStep1Test()
{
	Reporter.log("test1",true);
}

@BeforeSuite
public void BeforeSuite()
{
	Reporter.log("test2",true);
}

@AfterSuite
public void AfterSuite()
{
	Reporter.log("test3",true);
}
@BeforeClass
public void BeforeClass()
{
	Reporter.log("test3",true);
}
@AfterClass
public void AfterClass()
{
	Reporter.log("test3",true);
}
@BeforeTest
public void BeforeTest()
{
	Reporter.log("test3",true);
}
@AfterTest
public void AfterTest()
{
	Reporter.log("test3",true);
}
@BeforeMethod
public void BeforeMethod()
{
	Reporter.log("test3",true);
}
@BeforeMethod
public void BeforeMethod2()
{
	Reporter.log("test3",true);
}
@AfterMethod
public void AfterMethod2()
{
	Reporter.log("test3",true);
}

}
