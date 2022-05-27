package com.vtiger.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA 
{
 @Test
 public void testCase1()
 {
	Reporter.log("testcase1"); 
	Assert.assertTrue(false);
 }
 
 @Test
 public void testCase2()
 {
	 Reporter.log("testcase2");
	 Assert.assertTrue(true);
 }
}
