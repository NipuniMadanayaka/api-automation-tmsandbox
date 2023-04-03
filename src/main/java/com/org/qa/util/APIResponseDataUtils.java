package com.org.qa.util;


import com.org.qa.collection.Categories;
import com.org.qa.common.HTTPRequestMethods;
import com.org.qa.common.Headers;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static com.org.qa.common.APIPaths.BASE_PATH_CATEGORIES;


/**
 * This is the util class that derived the response data by the request data
 *
 * @author : Nipuni Madanayake <sasankammn@gmail.com>
 */

public class APIResponseDataUtils extends Headers {


    public static Categories getCategories(String categoryId, boolean isCatalogue) {
        String uri = categoryId + "/Details.json";
        Map<String, String> params = new HashMap<>();
        params.put("catalogue", String.valueOf(isCatalogue));
        Response getCategoriesResponse = userUtils.send(getRequestHeadersWithoutToken(),
                "", BASE_PATH_CATEGORIES, uri, HTTPRequestMethods.GET, params);
        String categoryResponseAsString = getCategoriesResponse.asString();

        return (Categories) JacksonDataUtils.convertJsonStringToJavaObject(categoryResponseAsString, Categories.class);
    }


}

