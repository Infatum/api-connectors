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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinearKlineApi {
    private ApiClient apiClient;

    public LinearKlineApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LinearKlineApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for linearKlineGet
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call linearKlineGetCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/public/linear/kline";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (interval != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("interval", interval));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call linearKlineGetValidateBeforeCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling linearKlineGet(Async)");
        }
        
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling linearKlineGet(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling linearKlineGet(Async)");
        }
        

        com.squareup.okhttp.Call call = linearKlineGetCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get kline
     * This will get kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object linearKlineGet(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        ApiResponse<Object> resp = linearKlineGetWithHttpInfo(symbol, interval, from, limit);
        return resp.getData();
    }

    /**
     * Get kline
     * This will get kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> linearKlineGetWithHttpInfo(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        com.squareup.okhttp.Call call = linearKlineGetValidateBeforeCall(symbol, interval, from, limit, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get kline (asynchronously)
     * This will get kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call linearKlineGetAsync(String symbol, String interval, BigDecimal from, BigDecimal limit, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = linearKlineGetValidateBeforeCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for linearKlineIndexPrice
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call linearKlineIndexPriceCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/public/linear/index-price-kline";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (interval != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("interval", interval));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "apiSignature", "timestamp" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call linearKlineIndexPriceValidateBeforeCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling linearKlineIndexPrice(Async)");
        }
        
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling linearKlineIndexPrice(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling linearKlineIndexPrice(Async)");
        }
        

        com.squareup.okhttp.Call call = linearKlineIndexPriceCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get kline
     * This will get index price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object linearKlineIndexPrice(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        ApiResponse<Object> resp = linearKlineIndexPriceWithHttpInfo(symbol, interval, from, limit);
        return resp.getData();
    }

    /**
     * Get kline
     * This will get index price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> linearKlineIndexPriceWithHttpInfo(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        com.squareup.okhttp.Call call = linearKlineIndexPriceValidateBeforeCall(symbol, interval, from, limit, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get kline (asynchronously)
     * This will get index price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call linearKlineIndexPriceAsync(String symbol, String interval, BigDecimal from, BigDecimal limit, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = linearKlineIndexPriceValidateBeforeCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for linearKlineMarkPrice
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call linearKlineMarkPriceCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/public/linear/mark-price-kline";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (interval != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("interval", interval));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "apiSignature", "timestamp" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call linearKlineMarkPriceValidateBeforeCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling linearKlineMarkPrice(Async)");
        }
        
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling linearKlineMarkPrice(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling linearKlineMarkPrice(Async)");
        }
        

        com.squareup.okhttp.Call call = linearKlineMarkPriceCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get kline
     * This will get mark price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object linearKlineMarkPrice(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        ApiResponse<Object> resp = linearKlineMarkPriceWithHttpInfo(symbol, interval, from, limit);
        return resp.getData();
    }

    /**
     * Get kline
     * This will get mark price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> linearKlineMarkPriceWithHttpInfo(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        com.squareup.okhttp.Call call = linearKlineMarkPriceValidateBeforeCall(symbol, interval, from, limit, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get kline (asynchronously)
     * This will get mark price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call linearKlineMarkPriceAsync(String symbol, String interval, BigDecimal from, BigDecimal limit, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = linearKlineMarkPriceValidateBeforeCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for linearKlinePremiumIndexPrice
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call linearKlinePremiumIndexPriceCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/public/linear/premium-index-kline";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (interval != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("interval", interval));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "apiSignature", "timestamp" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call linearKlinePremiumIndexPriceValidateBeforeCall(String symbol, String interval, BigDecimal from, BigDecimal limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling linearKlinePremiumIndexPrice(Async)");
        }
        
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling linearKlinePremiumIndexPrice(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling linearKlinePremiumIndexPrice(Async)");
        }
        

        com.squareup.okhttp.Call call = linearKlinePremiumIndexPriceCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get kline
     * This will get premium index price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object linearKlinePremiumIndexPrice(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        ApiResponse<Object> resp = linearKlinePremiumIndexPriceWithHttpInfo(symbol, interval, from, limit);
        return resp.getData();
    }

    /**
     * Get kline
     * This will get premium index price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> linearKlinePremiumIndexPriceWithHttpInfo(String symbol, String interval, BigDecimal from, BigDecimal limit) throws ApiException {
        com.squareup.okhttp.Call call = linearKlinePremiumIndexPriceValidateBeforeCall(symbol, interval, from, limit, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get kline (asynchronously)
     * This will get premium index price kline
     * @param symbol Contract type. (required)
     * @param interval Kline interval. (required)
     * @param from from timestamp. (required)
     * @param limit Contract type. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call linearKlinePremiumIndexPriceAsync(String symbol, String interval, BigDecimal from, BigDecimal limit, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = linearKlinePremiumIndexPriceValidateBeforeCall(symbol, interval, from, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
