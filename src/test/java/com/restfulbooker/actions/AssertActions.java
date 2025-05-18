package com.restfulbooker.actions;

import io.restassured.response.Response;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AssertActions {

    public void verifyStatusCode(Response response){
        assertTrue(String.valueOf(response.statusCode()).startsWith("20"));
    }

    public void verifyResponseBody(String expected, String actual, String description){
        assertEquals(actual, expected, description);
    }
}
