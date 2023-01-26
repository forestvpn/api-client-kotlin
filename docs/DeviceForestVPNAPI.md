# DeviceForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDevice**](DeviceForestVPNAPI.md#createDevice) | **POST** /devices/ | Create new device
[**createDevicePortForwarding**](DeviceForestVPNAPI.md#createDevicePortForwarding) | **POST** /devices/{deviceID}/port-forwarding/ | Create new device port forwarding
[**deleteDevice**](DeviceForestVPNAPI.md#deleteDevice) | **DELETE** /devices/{deviceID}/ | Delete Device
[**deleteDevicePortForwarding**](DeviceForestVPNAPI.md#deleteDevicePortForwarding) | **DELETE** /devices/{deviceID}/port-forwarding/{portForwardingID}/ | Delete Device&#39;s Port Forwarding
[**getDevice**](DeviceForestVPNAPI.md#getDevice) | **GET** /devices/{deviceID}/ | Device Info
[**getDeviceStats**](DeviceForestVPNAPI.md#getDeviceStats) | **GET** /devices/{deviceID}/stats/{statsID}/ | Device&#39;s stats detail
[**getDeviceWireGuard**](DeviceForestVPNAPI.md#getDeviceWireGuard) | **GET** /devices/{deviceID}/wireguards/{wireGuardID}/ | Device&#39;s wireguard profile detail
[**listDeviceBindings**](DeviceForestVPNAPI.md#listDeviceBindings) | **GET** /devices/{deviceID}/bindings/ | Device bindings
[**listDeviceConnectionModes**](DeviceForestVPNAPI.md#listDeviceConnectionModes) | **GET** /devices/{deviceID}/connection-modes/ | Device connection modes
[**listDeviceDetailStats**](DeviceForestVPNAPI.md#listDeviceDetailStats) | **GET** /devices/{deviceID}/detail-stats/ | Device&#39;s detail stats list
[**listDevicePortForwardings**](DeviceForestVPNAPI.md#listDevicePortForwardings) | **GET** /devices/{deviceID}/port-forwarding/ | Device Port Forwarding List
[**listDeviceStats**](DeviceForestVPNAPI.md#listDeviceStats) | **GET** /devices/{deviceID}/stats/ | Device&#39;s stats list
[**listDeviceWireGuardPeers**](DeviceForestVPNAPI.md#listDeviceWireGuardPeers) | **GET** /devices/{deviceID}/wireguards/{wireGuardID}/peers/ | Device&#39;s wireguard peers
[**listDeviceWireGuards**](DeviceForestVPNAPI.md#listDeviceWireGuards) | **GET** /devices/{deviceID}/wireguards/ | Device&#39;s wireguard profiles list
[**listDevices**](DeviceForestVPNAPI.md#listDevices) | **GET** /devices/ | Device List
[**updateDevice**](DeviceForestVPNAPI.md#updateDevice) | **PATCH** /devices/{deviceID}/ | Update device properties
[**updateDevicePortForwarding**](DeviceForestVPNAPI.md#updateDevicePortForwarding) | **PATCH** /devices/{deviceID}/port-forwarding/{portForwardingID}/ | Update device&#39;s port forwarding


<a name="createDevice"></a>
# **createDevice**
> Device createDevice(createOrUpdateDeviceRequest)

Create new device

Create new device 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val createOrUpdateDeviceRequest : CreateOrUpdateDeviceRequest =  // CreateOrUpdateDeviceRequest | 
try {
    val result : Device = apiInstance.createDevice(createOrUpdateDeviceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#createDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#createDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrUpdateDeviceRequest** | [**CreateOrUpdateDeviceRequest**](CreateOrUpdateDeviceRequest.md)|  | [optional]

### Return type

[**Device**](Device.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDevicePortForwarding"></a>
# **createDevicePortForwarding**
> PortForwarding createDevicePortForwarding(deviceID, createOrUpdatePortForwardingRequest)

Create new device port forwarding

Create new device port forwarding 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createOrUpdatePortForwardingRequest : CreateOrUpdatePortForwardingRequest =  // CreateOrUpdatePortForwardingRequest | 
try {
    val result : PortForwarding = apiInstance.createDevicePortForwarding(deviceID, createOrUpdatePortForwardingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#createDevicePortForwarding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#createDevicePortForwarding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **createOrUpdatePortForwardingRequest** | [**CreateOrUpdatePortForwardingRequest**](CreateOrUpdatePortForwardingRequest.md)|  | [optional]

### Return type

[**PortForwarding**](PortForwarding.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDevice"></a>
# **deleteDevice**
> deleteDevice(deviceID)

Delete Device

Delete device by id 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteDevice(deviceID)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#deleteDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#deleteDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDevicePortForwarding"></a>
# **deleteDevicePortForwarding**
> deleteDevicePortForwarding(deviceID, portForwardingID)

Delete Device&#39;s Port Forwarding

Delete device&#39;s port forwarding by id 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portForwardingID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteDevicePortForwarding(deviceID, portForwardingID)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#deleteDevicePortForwarding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#deleteDevicePortForwarding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **portForwardingID** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDevice"></a>
# **getDevice**
> Device getDevice(deviceID)

Device Info

Retrieve device info 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Device = apiInstance.getDevice(deviceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#getDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#getDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |

### Return type

[**Device**](Device.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceStats"></a>
# **getDeviceStats**
> DeviceStats getDeviceStats(deviceID, statsID)

Device&#39;s stats detail

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val statsID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeviceStats = apiInstance.getDeviceStats(deviceID, statsID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#getDeviceStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#getDeviceStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **statsID** | **java.util.UUID**|  |

### Return type

[**DeviceStats**](DeviceStats.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceWireGuard"></a>
# **getDeviceWireGuard**
> WireGuard getDeviceWireGuard(deviceID, wireGuardID)

Device&#39;s wireguard profile detail

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val wireGuardID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : WireGuard = apiInstance.getDeviceWireGuard(deviceID, wireGuardID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#getDeviceWireGuard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#getDeviceWireGuard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **wireGuardID** | **java.util.UUID**|  |

### Return type

[**WireGuard**](WireGuard.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeviceBindings"></a>
# **listDeviceBindings**
> kotlin.collections.List&lt;kotlin.String&gt; listDeviceBindings(deviceID)

Device bindings

Each device has bindings to specific servers. This methods returns hostnames where this device binded in a particular time. 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.listDeviceBindings(deviceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDeviceBindings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDeviceBindings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeviceConnectionModes"></a>
# **listDeviceConnectionModes**
> kotlin.collections.List&lt;ConnectionMode&gt; listDeviceConnectionModes(deviceID, xAndroidPackage, xAndroidSHA1)

Device connection modes

This methods returns list of connection modes are availbale for current device. 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val xAndroidPackage : kotlin.String = xAndroidPackage_example // kotlin.String | 
val xAndroidSHA1 : kotlin.String = xAndroidSHA1_example // kotlin.String | 
try {
    val result : kotlin.collections.List<ConnectionMode> = apiInstance.listDeviceConnectionModes(deviceID, xAndroidPackage, xAndroidSHA1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDeviceConnectionModes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDeviceConnectionModes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **xAndroidPackage** | **kotlin.String**|  | [optional]
 **xAndroidSHA1** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;ConnectionMode&gt;**](ConnectionMode.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeviceDetailStats"></a>
# **listDeviceDetailStats**
> kotlin.collections.List&lt;DeviceStats&gt; listDeviceDetailStats(deviceID, dateTimeAfter, dateTimeBefore, perPage, page)

Device&#39;s detail stats list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dateTimeAfter : kotlin.String = dateTimeAfter_example // kotlin.String | 
val dateTimeBefore : kotlin.String = dateTimeBefore_example // kotlin.String | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<DeviceStats> = apiInstance.listDeviceDetailStats(deviceID, dateTimeAfter, dateTimeBefore, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDeviceDetailStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDeviceDetailStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **dateTimeAfter** | **kotlin.String**|  | [optional]
 **dateTimeBefore** | **kotlin.String**|  | [optional]
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;DeviceStats&gt;**](DeviceStats.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDevicePortForwardings"></a>
# **listDevicePortForwardings**
> kotlin.collections.List&lt;PortForwarding&gt; listDevicePortForwardings(deviceID, perPage, page)

Device Port Forwarding List

Retrieve device&#39;s port forwarding lis 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<PortForwarding> = apiInstance.listDevicePortForwardings(deviceID, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDevicePortForwardings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDevicePortForwardings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;PortForwarding&gt;**](PortForwarding.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeviceStats"></a>
# **listDeviceStats**
> kotlin.collections.List&lt;DeviceStats&gt; listDeviceStats(deviceID, dateAfter, dateBefore, perPage, page)

Device&#39;s stats list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dateAfter : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val dateBefore : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<DeviceStats> = apiInstance.listDeviceStats(deviceID, dateAfter, dateBefore, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDeviceStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDeviceStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **dateAfter** | **java.time.LocalDate**|  | [optional]
 **dateBefore** | **java.time.LocalDate**|  | [optional]
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;DeviceStats&gt;**](DeviceStats.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeviceWireGuardPeers"></a>
# **listDeviceWireGuardPeers**
> kotlin.collections.List&lt;WireGuardPeer&gt; listDeviceWireGuardPeers(deviceID, wireGuardID)

Device&#39;s wireguard peers

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val wireGuardID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<WireGuardPeer> = apiInstance.listDeviceWireGuardPeers(deviceID, wireGuardID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDeviceWireGuardPeers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDeviceWireGuardPeers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **wireGuardID** | **java.util.UUID**|  |

### Return type

[**kotlin.collections.List&lt;WireGuardPeer&gt;**](WireGuardPeer.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeviceWireGuards"></a>
# **listDeviceWireGuards**
> kotlin.collections.List&lt;WireGuard&gt; listDeviceWireGuards(deviceID, perPage, page)

Device&#39;s wireguard profiles list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<WireGuard> = apiInstance.listDeviceWireGuards(deviceID, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDeviceWireGuards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDeviceWireGuards")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;WireGuard&gt;**](WireGuard.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDevices"></a>
# **listDevices**
> kotlin.collections.List&lt;Device&gt; listDevices(q, externalKey, recentlyActive, lastActiveAtAfter, lastActiveAtBefore, sort, perPage, page)

Device List

Retrieve devices list 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val q : kotlin.String = q_example // kotlin.String | Filter by search query
val externalKey : kotlin.String = externalKey_example // kotlin.String | Filter by external_key
val recentlyActive : kotlin.Boolean = true // kotlin.Boolean | Filter by recently active
val lastActiveAtAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by last active at date-time after provided value
val lastActiveAtBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by last active at date-time before provided value
val sort : kotlin.String = sort_example // kotlin.String | Sort by provided field
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<Device> = apiInstance.listDevices(q, externalKey, recentlyActive, lastActiveAtAfter, lastActiveAtBefore, sort, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#listDevices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#listDevices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| Filter by search query | [optional]
 **externalKey** | **kotlin.String**| Filter by external_key | [optional]
 **recentlyActive** | **kotlin.Boolean**| Filter by recently active | [optional]
 **lastActiveAtAfter** | **java.time.OffsetDateTime**| Filter by last active at date-time after provided value | [optional]
 **lastActiveAtBefore** | **java.time.OffsetDateTime**| Filter by last active at date-time before provided value | [optional]
 **sort** | **kotlin.String**| Sort by provided field | [optional] [enum: last_active_at, -last_active_at, created_at, -created_at, updated_at, -updated_at]
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Device&gt;**](Device.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDevice"></a>
# **updateDevice**
> Device updateDevice(deviceID, createOrUpdateDeviceRequest)

Update device properties

Update device properties 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createOrUpdateDeviceRequest : CreateOrUpdateDeviceRequest =  // CreateOrUpdateDeviceRequest | 
try {
    val result : Device = apiInstance.updateDevice(deviceID, createOrUpdateDeviceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#updateDevice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#updateDevice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **createOrUpdateDeviceRequest** | [**CreateOrUpdateDeviceRequest**](CreateOrUpdateDeviceRequest.md)|  |

### Return type

[**Device**](Device.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDevicePortForwarding"></a>
# **updateDevicePortForwarding**
> PortForwarding updateDevicePortForwarding(deviceID, portForwardingID, createOrUpdatePortForwardingRequest)

Update device&#39;s port forwarding

Update device&#39;s port forwarding dst_port 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = DeviceForestVPNAPI()
val deviceID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portForwardingID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createOrUpdatePortForwardingRequest : CreateOrUpdatePortForwardingRequest =  // CreateOrUpdatePortForwardingRequest | 
try {
    val result : PortForwarding = apiInstance.updateDevicePortForwarding(deviceID, portForwardingID, createOrUpdatePortForwardingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeviceForestVPNAPI#updateDevicePortForwarding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeviceForestVPNAPI#updateDevicePortForwarding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **java.util.UUID**|  |
 **portForwardingID** | **java.util.UUID**|  |
 **createOrUpdatePortForwardingRequest** | [**CreateOrUpdatePortForwardingRequest**](CreateOrUpdatePortForwardingRequest.md)|  |

### Return type

[**PortForwarding**](PortForwarding.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

