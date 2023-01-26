# AppleForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyAppStoreReceipt**](AppleForestVPNAPI.md#verifyAppStoreReceipt) | **POST** /purchase/apple/verify/ | App store receipt verification


<a name="verifyAppStoreReceipt"></a>
# **verifyAppStoreReceipt**
> verifyAppStoreReceipt(appStoreReceiptVerificationRequest)

App store receipt verification

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AppleForestVPNAPI()
val appStoreReceiptVerificationRequest : AppStoreReceiptVerificationRequest =  // AppStoreReceiptVerificationRequest | 
try {
    apiInstance.verifyAppStoreReceipt(appStoreReceiptVerificationRequest)
} catch (e: ClientException) {
    println("4xx response calling AppleForestVPNAPI#verifyAppStoreReceipt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppleForestVPNAPI#verifyAppStoreReceipt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreReceiptVerificationRequest** | [**AppStoreReceiptVerificationRequest**](AppStoreReceiptVerificationRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

