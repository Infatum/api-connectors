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
 * API tests for PositionsApi
 */
@Ignore
public class PositionsApiTest {

    private final PositionsApi api = new PositionsApi();

    
    /**
     * Update margin.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionsChangeMarginTest() throws ApiException {
        String symbol = null;
        String margin = null;
        Object response = api.positionsChangeMargin(symbol, margin);

        // TODO: test validations
    }
    
    /**
     * Get my position list.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionsMyPositionTest() throws ApiException {
        Object response = api.positionsMyPosition();

        // TODO: test validations
    }
    
    /**
     * Change user leverage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionsSaveLeverageTest() throws ApiException {
        String symbol = null;
        String leverage = null;
        Object response = api.positionsSaveLeverage(symbol, leverage);

        // TODO: test validations
    }
    
    /**
     * Set Trading-Stop Condition.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionsTradingStopTest() throws ApiException {
        String symbol = null;
        String takeProfit = null;
        String stopLoss = null;
        String trailingStop = null;
        Object response = api.positionsTradingStop(symbol, takeProfit, stopLoss, trailingStop);

        // TODO: test validations
    }
    
    /**
     * Get user leverage setting.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionsUserLeverageTest() throws ApiException {
        Object response = api.positionsUserLeverage();

        // TODO: test validations
    }
    
}
