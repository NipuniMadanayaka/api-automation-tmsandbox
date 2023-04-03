package com.org.qa.common;

import com.org.qa.util.RestDataUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nipuni Madanayake
 */
public class Headers {
    public static final String APPLICATION_JSON = "application/json";
    protected static RestDataUtils userUtils = new RestDataUtils();

    public static Map<String, String> getRequestHeadersWithoutToken() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", APPLICATION_JSON);
        headers.put("Accept", APPLICATION_JSON);
        return headers;
    }

}
