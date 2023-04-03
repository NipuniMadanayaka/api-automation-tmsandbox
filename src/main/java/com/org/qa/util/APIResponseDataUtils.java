package com.org.qa.util;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.qa.collection.CategoriesResponse;
import com.org.qa.common.HTTPRequestMethods;
import com.org.qa.common.Headers;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.org.qa.common.APIPaths.BASE_PATH_CATEGORIES;



/**
 * This is the util class that derived the response data by the request data
 *
 * @author : Nipuni Madanayake <sasankammn@gmail.com>
 */

public class APIResponseDataUtils extends Headers {


    public static CategoriesResponse getCategories(String categoryId, boolean isCatalogue) throws IOException {
        String basePath = BASE_PATH_CATEGORIES;
        String uri = categoryId + "/Details.json";
        Map<String, String> params = new HashMap<>();
        params.put("catalogue", String.valueOf(isCatalogue));
        Response getCategoriesResponse = userUtils.send(getRequestHeadersWithoutToken(),
                "", basePath, uri, HTTPRequestMethods.GET, params);
        String categoryResponseAsString = getCategoriesResponse.asString();

        CategoriesResponse categoriesResponseAsString = (CategoriesResponse) JacksonDataUtils.convertJsonStringToJavaObject(categoryResponseAsString,CategoriesResponse.class);
        return categoriesResponseAsString;
    }


}

