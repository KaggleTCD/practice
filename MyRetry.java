package com.testng.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{

	private int count;
	private static final int MAX_RETRY_COUNT = 3;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<MAX_RETRY_COUNT) {
			count++;
			return true;
		}
		return false;
	}

}
