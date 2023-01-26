# SupportForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSupportTicket**](SupportForestVPNAPI.md#createSupportTicket) | **POST** /support/tickets/ | Create support ticket
[**getSupportTicketCategory**](SupportForestVPNAPI.md#getSupportTicketCategory) | **GET** /support/ticket-categories/ | Get ticket categories


<a name="createSupportTicket"></a>
# **createSupportTicket**
> createSupportTicket(text, category, files)

Create support ticket

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = SupportForestVPNAPI()
val text : kotlin.String = text_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | Ticket category's slug
val files : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 
try {
    apiInstance.createSupportTicket(text, category, files)
} catch (e: ClientException) {
    println("4xx response calling SupportForestVPNAPI#createSupportTicket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportForestVPNAPI#createSupportTicket")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **kotlin.String**|  |
 **category** | **kotlin.String**| Ticket category&#39;s slug |
 **files** | **kotlin.collections.List&lt;java.io.File&gt;**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getSupportTicketCategory"></a>
# **getSupportTicketCategory**
> kotlin.collections.List&lt;TicketCategory&gt; getSupportTicketCategory()

Get ticket categories

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = SupportForestVPNAPI()
try {
    val result : kotlin.collections.List<TicketCategory> = apiInstance.getSupportTicketCategory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportForestVPNAPI#getSupportTicketCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportForestVPNAPI#getSupportTicketCategory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;TicketCategory&gt;**](TicketCategory.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

