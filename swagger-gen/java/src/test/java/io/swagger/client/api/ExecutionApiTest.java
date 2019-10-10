/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExecutionApi
 */
@Ignore
public class ExecutionApiTest {

    private final ExecutionApi api = new ExecutionApi();

    
    /**
     * Get the trade records of a order.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executionGetTradesTest() throws ApiException {
        String orderId = null;
        Object response = api.executionGetTrades(orderId);

        // TODO: test validations
    }
    
}
