package com.webshop.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener{


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase Execution Start -"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase Execution Completed -"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed -"+result.getName());
		System.out.println("Testcase capture screenshot");
		UtilClass.takeSS(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase Execution Skip -"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Browser open");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Browser closed");
	}

	

	

}
