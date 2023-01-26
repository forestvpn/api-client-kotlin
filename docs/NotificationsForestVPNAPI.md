# NotificationsForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotificationsUnreadCount**](NotificationsForestVPNAPI.md#getNotificationsUnreadCount) | **GET** /notifications/unread_count/ | Get unread notifications count
[**listNotifications**](NotificationsForestVPNAPI.md#listNotifications) | **GET** /notifications/all_list/ | Get notifications list
[**updateNotificationMarkRead**](NotificationsForestVPNAPI.md#updateNotificationMarkRead) | **GET** /notifications/mark_read/{slug}/ | Mark notification as read by user
[**updateNotificationMarkReadAll**](NotificationsForestVPNAPI.md#updateNotificationMarkReadAll) | **GET** /notifications/mark-all-as-read/ | Mark all notifications as read by user


<a name="getNotificationsUnreadCount"></a>
# **getNotificationsUnreadCount**
> NotificationUnreadCount getNotificationsUnreadCount()

Get unread notifications count

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = NotificationsForestVPNAPI()
try {
    val result : NotificationUnreadCount = apiInstance.getNotificationsUnreadCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsForestVPNAPI#getNotificationsUnreadCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsForestVPNAPI#getNotificationsUnreadCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NotificationUnreadCount**](NotificationUnreadCount.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNotifications"></a>
# **listNotifications**
> kotlin.collections.List&lt;NotificationAllList&gt; listNotifications(max)

Get notifications list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = NotificationsForestVPNAPI()
val max : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<NotificationAllList> = apiInstance.listNotifications(max)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsForestVPNAPI#listNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsForestVPNAPI#listNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **max** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;NotificationAllList&gt;**](NotificationAllList.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNotificationMarkRead"></a>
# **updateNotificationMarkRead**
> Error updateNotificationMarkRead(slug, next)

Mark notification as read by user

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = NotificationsForestVPNAPI()
val slug : kotlin.Int = 56 // kotlin.Int | 
val next : kotlin.String = next_example // kotlin.String | 
try {
    val result : Error = apiInstance.updateNotificationMarkRead(slug, next)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsForestVPNAPI#updateNotificationMarkRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsForestVPNAPI#updateNotificationMarkRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.Int**|  |
 **next** | **kotlin.String**|  |

### Return type

[**Error**](Error.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNotificationMarkReadAll"></a>
# **updateNotificationMarkReadAll**
> Error updateNotificationMarkReadAll(next)

Mark all notifications as read by user

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = NotificationsForestVPNAPI()
val next : kotlin.String = next_example // kotlin.String | 
try {
    val result : Error = apiInstance.updateNotificationMarkReadAll(next)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsForestVPNAPI#updateNotificationMarkReadAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsForestVPNAPI#updateNotificationMarkReadAll")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **next** | **kotlin.String**|  |

### Return type

[**Error**](Error.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

