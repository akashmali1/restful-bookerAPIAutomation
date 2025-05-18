package com.restfulbooker.tests.crud;

import com.restfulbooker.actions.AssertActions;
import com.restfulbooker.endpoints.APIConstants;
import com.restfulbooker.modules.PayloadManager;
import com.restfulbooker.tests.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

public class CreateBookingTest extends BaseTest {

    @Test(groups = "smoke")
    @Owner("Akash")
    @Description("Verify that the create booking is working as expected and status code is 200")
    public void testCreateBooking() {
        requestSpecification.basePath(APIConstants.CREATE_BOOKING);
        response = RestAssured.given().spec(requestSpecification).when().body(payloadManager.createPayload()).post();
        validatableResponse = response.then();
        assertActions.verifyStatusCode(response);


    }
}
