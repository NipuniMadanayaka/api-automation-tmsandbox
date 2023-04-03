package com.org.qa.utils;

import com.org.qa.util.LoggerDataUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class APIListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        LoggerDataUtils.logINFORMATION("**********************TEST STARTED");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        LoggerDataUtils.logINFORMATION("**********************TEST PASSED");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        LoggerDataUtils.logINFORMATION("******TEST FAILED******");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        LoggerDataUtils.logINFORMATION("******TEST SKIPPED******");
    }

    @Override
    public void onStart(ITestContext context) {
        LoggerDataUtils.logINFORMATION("**********************TEST INITIATED");
    }

    @Override
    public void onFinish(ITestContext context) {
        LoggerDataUtils.logINFORMATION("**********************TEST FINISHED");
    }
}

