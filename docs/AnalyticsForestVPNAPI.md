# AnalyticsForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataUsageStats**](AnalyticsForestVPNAPI.md#getDataUsageStats) | **GET** /analytics/data-usage/ | Data Usage Stats


<a name="getDataUsageStats"></a>
# **getDataUsageStats**
> kotlin.collections.List&lt;AggregatedDataUsageStats&gt; getDataUsageStats(aggrInterval, dateAfter, dateBefore, deviceTypeIn, deviceIn, sortBy)

Data Usage Stats

Users data usage dtatistics for each device 

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AnalyticsForestVPNAPI()
val aggrInterval : kotlin.String = hour / day / week / month // kotlin.String | No more than 3 days for hour aggregation type
val dateAfter : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | No more than 3 months between date_after and date_before
val dateBefore : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | No more than 3 months between date_after and date_before
val deviceTypeIn : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filter by device type
val deviceIn : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Filter by device
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort output by
try {
    val result : kotlin.collections.List<AggregatedDataUsageStats> = apiInstance.getDataUsageStats(aggrInterval, dateAfter, dateBefore, deviceTypeIn, deviceIn, sortBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsForestVPNAPI#getDataUsageStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsForestVPNAPI#getDataUsageStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggrInterval** | **kotlin.String**| No more than 3 days for hour aggregation type |
 **dateAfter** | **java.time.LocalDate**| No more than 3 months between date_after and date_before | [optional]
 **dateBefore** | **java.time.LocalDate**| No more than 3 months between date_after and date_before | [optional]
 **deviceTypeIn** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filter by device type | [optional]
 **deviceIn** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)| Filter by device | [optional]
 **sortBy** | **kotlin.String**| Sort output by | [optional] [enum: total_bytes, received_bytes, transmitted_bytes, usage_time]

### Return type

[**kotlin.collections.List&lt;AggregatedDataUsageStats&gt;**](AggregatedDataUsageStats.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

