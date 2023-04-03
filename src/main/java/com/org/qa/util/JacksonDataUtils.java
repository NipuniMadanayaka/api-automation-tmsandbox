package com.org.qa.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonDataUtils {

    public static Object convertJsonStringToJavaObject(String response, Class c) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(response, c);
        } catch (IOException e) {
            LoggerDataUtils.logERROR(e.getMessage(), e);
        }
        return null;
    }

}
