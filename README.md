# api-connectors
Libraries for connecting to the Bybit API. https://bybit-exchange.github.io/docs/inverse

# Official Examples

#### Websockets

* [Python](/official-ws/python)


*Note* : The auto-generated code do not contains signature algorithm, you can refer to our example to generate the `sign` value. In Java SDKs, you should do like this:

```js
ApiKeyAuth apiKey = (ApiKeyAuth)client.getAuthentication("apiKey");
ApiKeyAuth sign = (ApiKeyAuth)client.getAuthentication("apiSignature");
ApiKeyAuth timestamp = (ApiKeyAuth)client.getAuthentication("timestamp";
apiKey.setApiKey("YOUR API KEY");
timestamp.setApiKey(String.valueOf(System.currentTimeMillis()/1000));
String signature = generateSign(paramStr);
sign.setApiKey(signature);
```

`generateSign` is a method that you need to implement yourself!
