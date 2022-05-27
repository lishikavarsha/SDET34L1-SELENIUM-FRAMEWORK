package com.vtiger.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPractice3Test extends TestNgBasicConfigAnnotationPracticeTest{
@Test(groups="smoke")
public void step1Test()
{
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Assert.assertEquals("abc","kk");
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	
	Assert.fail("Practicce fail");
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
}

@Test(groups="sanity")

public void step2Test()
{
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Assert.assertEquals("aba", "jj");
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	
	}

@Test(groups="regression")

public void step3Test()
{
	Reporter.log("Test3",true);
	Reporter.log("Test2",true);
	Reporter.log("Test2",true);
	Reporter.log("Test1",true);
	Reporter.log("Test1",true);
	Reporter.log("Test2",true);
	Reporter.log("Test1",true);
	Reporter.log("Test2",true);
}
}
