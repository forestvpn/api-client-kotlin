# AppForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUserDevice**](AppForestVPNAPI.md#getCurrentUserDevice) | **GET** /app/devices/current/ | Get user device info
[**updateCurrentUserDevice**](AppForestVPNAPI.md#updateCurrentUserDevice) | **PATCH** /app/devices/current/ | Update user device


<a name="getCurrentUserDevice"></a>
# **getCurrentUserDevice**
> UserDevice getCurrentUserDevice()

Get user device info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AppForestVPNAPI()
try {
    val result : UserDevice = apiInstance.getCurrentUserDevice()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppForestVPNAPI#getCurrentUserDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppForestVPNAPI#getCurrentUserDevice")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserDevice**](UserDevice.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCurrentUserDevice"></a>
# **updateCurrentUserDevice**
> updateCurrentUserDevice(updateUserDeviceRequest)

Update user device

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AppForestVPNAPI()
val updateUserDeviceRequest : UpdateUserDeviceRequest =  // UpdateUserDeviceRequest | 
try {
    apiInstance.updateCurrentUserDevice(updateUserDeviceRequest)
} catch (e: ClientException) {
    println("4xx response calling AppForestVPNAPI#updateCurrentUserDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppForestVPNAPI#updateCurrentUserDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserDeviceRequest** | [**UpdateUserDeviceRequest**](UpdateUserDeviceRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

