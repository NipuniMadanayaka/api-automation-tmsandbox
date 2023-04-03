package com.org.qa.util;

import com.org.qa.common.Constants;
import com.org.qa.common.HTTPRequestMethods;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestDataUtils {
    private String apiHost;

    /**
     * Setting up the base path and host
     *
     * @param
     */
    public RestDataUtils() {
        init(Constants.REST_API_HOST);
    }

    public String getApiHost() {
        return apiHost;
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    /**
     * Send method for the request
     *
     * @param headers
     * @param bodyString
     * @param uri
     * @param requestMethod
     * @param queryParameters
     * @return
     */
    public Response send(Map<String, String> headers, String bodyString, String basePath, String uri,
                         HTTPRequestMethods requestMethod, Map<String, String> queryParameters) {
        logRequest(bodyString);
        RequestSpecification requestSpecification = RestAssured.given().
                spec(getRequestSpecification(headers, bodyString, queryParameters, basePath));
        Response response = execute(requestMethod, requestSpecification, uri);
        LoggerDataUtils.logINFORMATION(uri);
        logResponse(response);
        return response;
    }

    private void logRequest(String bodyString) {
        if (bodyString != null && !bodyString.isEmpty())
            LoggerDataUtils.logINFORMATION("\n\nREQUEST_BODY\n" + bodyString + "\n********\n\n");
    }

    private void logResponse(Response response) {
        if (response != null)
            LoggerDataUtils.logINFORMATION("\n\nRESPONSE\n" + response.asString() + "\n*********\n\n");
    }

    /**
     * Executing the request and return Response object
     *
     * @param reqMethod
     * @param requestSpec
     * @param uri
     * @return
     */
    private Response execute(HTTPRequestMethods reqMethod, RequestSpecification requestSpec, String uri) {
        RequestSpecification requestSpecification = RestAssured.given(requestSpec).
                config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().
                        appendDefaultContentCharsetToContentTypeIfUndefined(
                                false)));

        Response response = null;
        if (reqMethod.equals(HTTPRequestMethods.GET)) {
            response = requestSpecification.expect().when().get(uri);
        }

        if (reqMethod.equals(HTTPRequestMethods.POST)) {
            response = requestSpecification.expect().when().post(uri);
        }

        if (reqMethod.equals(HTTPRequestMethods.PUT)) {
            response = requestSpecification.expect().when().put(uri);
        }

        if (reqMethod.equals(HTTPRequestMethods.DELETE)) {
            response = requestSpecification.expect().when().delete(uri);
        }

        if (reqMethod.equals(HTTPRequestMethods.PATCH)) {
            response = requestSpecification.expect().when().patch(uri);
        }

        return response;
    }

    /**
     * Building the request specification
     *
     * @param headers
     * @param body
     * @param queryParameters
     * @return
     */
    private RequestSpecification getRequestSpecification(Map<String, String> headers, String body, Map<String, ?>
            queryParameters, String basePath) {
        RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();

        reqSpecBuilder.setBaseUri(getApiHost());
        reqSpecBuilder.setBasePath(basePath);

        if (headers != null) {
            reqSpecBuilder.addHeaders(headers);
        }

        if (body != null && body.length() > 0) {
            reqSpecBuilder.setBody(body);
        }

        if (queryParameters != null && !queryParameters.isEmpty())
            reqSpecBuilder.addQueryParams(queryParameters);

        return reqSpecBuilder.build();
    }

    private void init(String apiHost) {
        setApiHost(apiHost);
    }
}
