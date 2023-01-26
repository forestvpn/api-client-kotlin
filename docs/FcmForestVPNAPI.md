# FcmForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFCMDevice**](FcmForestVPNAPI.md#createFCMDevice) | **POST** /notification/fcm/ | Device registration for push notification through out Firebase Cloud Messaging
[**deleteFCMDevice**](FcmForestVPNAPI.md#deleteFCMDevice) | **DELETE** /notification/fcm/{registrationID}/ | Delete fcm device
[**getFCMDevice**](FcmForestVPNAPI.md#getFCMDevice) | **GET** /notification/fcm/{registrationID}/ | Device info
[**updateFCMDevice**](FcmForestVPNAPI.md#updateFCMDevice) | **PATCH** /notification/fcm/{registrationID}/ | Update device fcm properties


<a name="createFCMDevice"></a>
# **createFCMDevice**
> FCMDevice createFCMDevice(createFCMDeviceRequest)

Device registration for push notification through out Firebase Cloud Messaging

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FcmForestVPNAPI()
val createFCMDeviceRequest : CreateFCMDeviceRequest =  // CreateFCMDeviceRequest | 
try {
    val result : FCMDevice = apiInstance.createFCMDevice(createFCMDeviceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FcmForestVPNAPI#createFCMDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FcmForestVPNAPI#createFCMDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFCMDeviceRequest** | [**CreateFCMDeviceRequest**](CreateFCMDeviceRequest.md)|  |

### Return type

[**FCMDevice**](FCMDevice.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFCMDevice"></a>
# **deleteFCMDevice**
> deleteFCMDevice(registrationID)

Delete fcm device

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FcmForestVPNAPI()
val registrationID : kotlin.String = registrationID_example // kotlin.String | 
try {
    apiInstance.deleteFCMDevice(registrationID)
} catch (e: ClientException) {
    println("4xx response calling FcmForestVPNAPI#deleteFCMDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FcmForestVPNAPI#deleteFCMDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationID** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFCMDevice"></a>
# **getFCMDevice**
> FCMDevice getFCMDevice(registrationID)

Device info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FcmForestVPNAPI()
val registrationID : kotlin.String = registrationID_example // kotlin.String | 
try {
    val result : FCMDevice = apiInstance.getFCMDevice(registrationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FcmForestVPNAPI#getFCMDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FcmForestVPNAPI#getFCMDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationID** | **kotlin.String**|  |

### Return type

[**FCMDevice**](FCMDevice.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFCMDevice"></a>
# **updateFCMDevice**
> FCMDevice updateFCMDevice(registrationID, updateFCMDeviceRequest)

Update device fcm properties

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FcmForestVPNAPI()
val registrationID : kotlin.String = registrationID_example // kotlin.String | 
val updateFCMDeviceRequest : UpdateFCMDeviceRequest =  // UpdateFCMDeviceRequest | 
try {
    val result : FCMDevice = apiInstance.updateFCMDevice(registrationID, updateFCMDeviceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FcmForestVPNAPI#updateFCMDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FcmForestVPNAPI#updateFCMDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationID** | **kotlin.String**|  |
 **updateFCMDeviceRequest** | [**UpdateFCMDeviceRequest**](UpdateFCMDeviceRequest.md)|  |

### Return type

[**FCMDevice**](FCMDevice.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

