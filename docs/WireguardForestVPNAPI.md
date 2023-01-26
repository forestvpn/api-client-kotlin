# WireguardForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWireGuardPeerInfo**](WireguardForestVPNAPI.md#getWireGuardPeerInfo) | **GET** /wireguard/peers/{pubKey}/ | Wireguard peer info
[**listWireGuardPeers**](WireguardForestVPNAPI.md#listWireGuardPeers) | **GET** /wireguard/peers/ | Wireguard peers list


<a name="getWireGuardPeerInfo"></a>
# **getWireGuardPeerInfo**
> WireGuardPeerInfo getWireGuardPeerInfo(pubKey)

Wireguard peer info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = WireguardForestVPNAPI()
val pubKey : kotlin.String = pubKey_example // kotlin.String | 
try {
    val result : WireGuardPeerInfo = apiInstance.getWireGuardPeerInfo(pubKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WireguardForestVPNAPI#getWireGuardPeerInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WireguardForestVPNAPI#getWireGuardPeerInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pubKey** | **kotlin.String**|  |

### Return type

[**WireGuardPeerInfo**](WireGuardPeerInfo.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWireGuardPeers"></a>
# **listWireGuardPeers**
> kotlin.collections.List&lt;WireGuardPeerInfo&gt; listWireGuardPeers()

Wireguard peers list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = WireguardForestVPNAPI()
try {
    val result : kotlin.collections.List<WireGuardPeerInfo> = apiInstance.listWireGuardPeers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WireguardForestVPNAPI#listWireGuardPeers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WireguardForestVPNAPI#listWireGuardPeers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;WireGuardPeerInfo&gt;**](WireGuardPeerInfo.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

