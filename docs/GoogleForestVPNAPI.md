# GoogleForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyPlayStorePurchase**](GoogleForestVPNAPI.md#verifyPlayStorePurchase) | **POST** /purchase/google/verify/ | Play store purchase verification


<a name="verifyPlayStorePurchase"></a>
# **verifyPlayStorePurchase**
> verifyPlayStorePurchase(playStorePurchaseVerificationRequest)

Play store purchase verification

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = GoogleForestVPNAPI()
val playStorePurchaseVerificationRequest : PlayStorePurchaseVerificationRequest =  // PlayStorePurchaseVerificationRequest | 
try {
    apiInstance.verifyPlayStorePurchase(playStorePurchaseVerificationRequest)
} catch (e: ClientException) {
    println("4xx response calling GoogleForestVPNAPI#verifyPlayStorePurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleForestVPNAPI#verifyPlayStorePurchase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playStorePurchaseVerificationRequest** | [**PlayStorePurchaseVerificationRequest**](PlayStorePurchaseVerificationRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

