package com.restfulbooker.tests.base;

import com.restfulbooker.actions.AssertActions;
import com.restfulbooker.endpoints.APIConstants;
import com.restfulbooker.modules.PayloadManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public RequestSpecification requestSpecification;
    public PayloadManager payloadManager;
    public Response response;
    public JsonPath jsonPath;
    public AssertActions assertActions;
    public ValidatableResponse validatableResponse;

    @BeforeMethod
    public void setUp() {
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();
        requestSpecification = (RequestSpecification) new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type", "application/json")
                .build().log().all();
    }

    @AfterMethod
    public void tearDown() {

    }
}
