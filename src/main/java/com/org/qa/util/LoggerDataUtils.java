package com.org.qa.util;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This is the util class that log the information of the test execution result
 *
 * @author : Nipuni Madanayake <sasankammn@gmail.com>
 */
public class LoggerDataUtils {
    private static Logger logger = Logger.getAnonymousLogger();

    public LoggerDataUtils() {
    }

    public static void logINFORMATION(String logMessage) {
        logger.log(Level.INFO, logMessage);
    }

    public static void logERROR(String logMessage, Throwable throwable) {
        if (throwable != null) {
            logger.log(Level.SEVERE, logMessage, throwable);
        } else {
            logger.log(Level.SEVERE, logMessage);
        }

    }

}
