# GeoForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCountries**](GeoForestVPNAPI.md#listCountries) | **GET** /geo/countries/ | Countries list
[**listCurrencies**](GeoForestVPNAPI.md#listCurrencies) | **GET** /geo/currencies/ | Correncies list
[**listLocations**](GeoForestVPNAPI.md#listLocations) | **GET** /locations/ | Location list


<a name="listCountries"></a>
# **listCountries**
> kotlin.collections.List&lt;Country&gt; listCountries()

Countries list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = GeoForestVPNAPI()
try {
    val result : kotlin.collections.List<Country> = apiInstance.listCountries()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeoForestVPNAPI#listCountries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoForestVPNAPI#listCountries")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Country&gt;**](Country.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCurrencies"></a>
# **listCurrencies**
> kotlin.collections.List&lt;Currency&gt; listCurrencies()

Correncies list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = GeoForestVPNAPI()
try {
    val result : kotlin.collections.List<Currency> = apiInstance.listCurrencies()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeoForestVPNAPI#listCurrencies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoForestVPNAPI#listCurrencies")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Currency&gt;**](Currency.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLocations"></a>
# **listLocations**
> kotlin.collections.List&lt;Location&gt; listLocations(xDeviceCoordinates)

Location list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = GeoForestVPNAPI()
val xDeviceCoordinates : kotlin.String = xDeviceCoordinates_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Location> = apiInstance.listLocations(xDeviceCoordinates)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeoForestVPNAPI#listLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoForestVPNAPI#listLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xDeviceCoordinates** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Location&gt;**](Location.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

