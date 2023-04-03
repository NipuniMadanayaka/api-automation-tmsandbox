package com.org.qa.utils;

import io.qameta.allure.Attachment;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * This test listener is for the report generation purpose
 *
 * @author Nipuni Madanayaka <sasankammn@gmail.com>
 */
public class AllureListener implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        saveTextLog(getTestMethodName(result) + " Failed Screenshot Taken");
    }
}
