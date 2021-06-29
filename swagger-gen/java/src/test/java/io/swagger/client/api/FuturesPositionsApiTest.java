/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.12
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
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FuturesPositionsApi
 */
@Ignore
public class FuturesPositionsApiTest {

    private final static FuturesPositionsApi api = new FuturesPositionsApi();

    @BeforeClass
    public static void setUp() {
        // overwrite apiClient here
        // ApiClient apiClient = new ApiClient();
        // apiClient.setBasePath("https://api.bybit.com"); // https://api-testnet.bybit.com
        // apiClient.setApiKey("");
        // apiClient.setSecret("");
        // api.setApiClient(apiClient);
    }

    
    /**
     * Update margin.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void futuresPositionsChangeMarginTest() throws ApiException {
        String symbol = null;
        String margin = null;
        Object response = api.futuresPositionsChangeMargin(symbol, margin);

        // TODO: test validations
    }
    
    /**
     * Get user&#39;s closed profit and loss records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void futuresPositionsClosePnlRecordsTest() throws ApiException {
        String symbol = null;
        Integer startTime = null;
        Integer endTime = null;
        String execType = null;
        Integer page = null;
        Integer limit = null;
        Object response = api.futuresPositionsClosePnlRecords(symbol, startTime, endTime, execType, page, limit);

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
    public void futuresPositionsMyPositionTest() throws ApiException {
        String symbol = null;
        Object response = api.futuresPositionsMyPosition(symbol);

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
    public void futuresPositionsSaveLeverageTest() throws ApiException {
        String symbol = null;
        Integer positionIdx = null;
        String buyLeverage = null;
        String sellLeverage = null;
        Object response = api.futuresPositionsSaveLeverage(symbol, positionIdx, buyLeverage, sellLeverage);

        // TODO: test validations
    }
    
    /**
     * Switch position isolated.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void futuresPositionsSwitchIsolatedTest() throws ApiException {
        String symbol = null;
        Integer positionIdx = null;
        String buyLeverage = null;
        String sellLeverage = null;
        Boolean isIsolated = null;
        Object response = api.futuresPositionsSwitchIsolated(symbol, positionIdx, buyLeverage, sellLeverage, isIsolated);

        // TODO: test validations
    }
    
    /**
     * Switch position mode.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void futuresPositionsSwitchPositionModeTest() throws ApiException {
        String symbol = null;
        Integer mode = null;
        Object response = api.futuresPositionsSwitchPositionMode(symbol, mode);

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
    public void futuresPositionsTradingStopTest() throws ApiException {
        String symbol = null;
        String takeProfit = null;
        String stopLoss = null;
        String trailingStop = null;
        String newTrailingActive = null;
        Object response = api.futuresPositionsTradingStop(symbol, takeProfit, stopLoss, trailingStop, newTrailingActive);

        // TODO: test validations
    }
    
}
