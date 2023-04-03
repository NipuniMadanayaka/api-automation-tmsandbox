package com.org.qa.utils;

import com.org.qa.util.LoggerDataUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class TestBase {
    protected APIListener apiListener;
    protected SoftAssert softAssert;

    @BeforeClass(alwaysRun = true)
    public void initClass() {
        apiListener = new APIListener();
    }

    @BeforeMethod(alwaysRun = true)
    public void initMethod(Method method) {
        LoggerDataUtils.logINFORMATION("Running test - " + method.getName());
        softAssert = new SoftAssert();
    }

}
