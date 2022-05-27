package com.SDET34L1.genericLibraraies;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {

	int count=0;
	int maxCount=3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxCount)
		{
			count++;
			return true;
		}
		
		return false;
	}
 
}
