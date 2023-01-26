# AdsForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdUnitRequestLog**](AdsForestVPNAPI.md#createAdUnitRequestLog) | **POST** /ads/request-logs/ | Create ad unit request log
[**listAdPlacements**](AdsForestVPNAPI.md#listAdPlacements) | **GET** /ads/placements/ | Get ad placement list


<a name="createAdUnitRequestLog"></a>
# **createAdUnitRequestLog**
> CreateAdUnitRequestLogRequest createAdUnitRequestLog(createAdUnitRequestLogRequest)

Create ad unit request log

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AdsForestVPNAPI()
val createAdUnitRequestLogRequest : CreateAdUnitRequestLogRequest =  // CreateAdUnitRequestLogRequest | 
try {
    val result : CreateAdUnitRequestLogRequest = apiInstance.createAdUnitRequestLog(createAdUnitRequestLogRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsForestVPNAPI#createAdUnitRequestLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsForestVPNAPI#createAdUnitRequestLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAdUnitRequestLogRequest** | [**CreateAdUnitRequestLogRequest**](CreateAdUnitRequestLogRequest.md)|  | [optional]

### Return type

[**CreateAdUnitRequestLogRequest**](CreateAdUnitRequestLogRequest.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAdPlacements"></a>
# **listAdPlacements**
> kotlin.collections.List&lt;AdPlacement&gt; listAdPlacements()

Get ad placement list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AdsForestVPNAPI()
try {
    val result : kotlin.collections.List<AdPlacement> = apiInstance.listAdPlacements()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsForestVPNAPI#listAdPlacements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsForestVPNAPI#listAdPlacements")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;AdPlacement&gt;**](AdPlacement.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

