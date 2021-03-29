package com.testng.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test(retryAnalyzer = MyRetry.class)
	public void test() {
		
		Assert.assertTrue(false);
		System.out.println("Test");
	}

}
