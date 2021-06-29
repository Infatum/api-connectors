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
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LinearOrderApi
 */
@Ignore
public class LinearOrderApiTest {

    private final static LinearOrderApi api = new LinearOrderApi();

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
     * Cancel Active Order
     *
     * This will cancel linear active order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearOrderCancelTest() throws ApiException {
        String orderId = null;
        String orderLinkId = null;
        String symbol = null;
        Object response = api.linearOrderCancel(orderId, orderLinkId, symbol);

        // TODO: test validations
    }
    
    /**
     * Cancel all active orders.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearOrderCancelAllTest() throws ApiException {
        String symbol = null;
        Object response = api.linearOrderCancelAll(symbol);

        // TODO: test validations
    }
    
    /**
     * Get linear Active Orders
     *
     * This will get linear active orders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearOrderGetOrdersTest() throws ApiException {
        String orderId = null;
        String orderLinkId = null;
        String symbol = null;
        String order = null;
        String page = null;
        String limit = null;
        String orderStatus = null;
        Object response = api.linearOrderGetOrders(orderId, orderLinkId, symbol, order, page, limit, orderStatus);

        // TODO: test validations
    }
    
    /**
     * Create Active Order
     *
     * This will create linear order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearOrderNewTest() throws ApiException {
        String symbol = null;
        String side = null;
        String orderType = null;
        String timeInForce = null;
        Double qty = null;
        Double price = null;
        Double takeProfit = null;
        Double stopLoss = null;
        Boolean reduceOnly = null;
        String tpTriggerBy = null;
        String slTriggerBy = null;
        Boolean closeOnTrigger = null;
        String orderLinkId = null;
        Object response = api.linearOrderNew(symbol, side, orderType, timeInForce, qty, price, takeProfit, stopLoss, reduceOnly, tpTriggerBy, slTriggerBy, closeOnTrigger, orderLinkId);

        // TODO: test validations
    }
    
    /**
     * Get Active Orders(real-time)
     *
     * This will get linear active orders(real-time)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearOrderQueryTest() throws ApiException {
        String symbol = null;
        String orderId = null;
        String orderLinkId = null;
        Object response = api.linearOrderQuery(symbol, orderId, orderLinkId);

        // TODO: test validations
    }
    
    /**
     * Replace Active Order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearOrderReplaceTest() throws ApiException {
        String symbol = null;
        String orderId = null;
        String orderLinkId = null;
        String pRQty = null;
        BigDecimal pRPrice = null;
        Object response = api.linearOrderReplace(symbol, orderId, orderLinkId, pRQty, pRPrice);

        // TODO: test validations
    }
    
}
