# FriendshipForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptFriendshipInvitation**](FriendshipForestVPNAPI.md#acceptFriendshipInvitation) | **PATCH** /friendship/invitations/{code}/ | Accept friendship invitation
[**createFriendshipInvitation**](FriendshipForestVPNAPI.md#createFriendshipInvitation) | **POST** /friendship/invitations/ | Create friendship invitation
[**deleteFriend**](FriendshipForestVPNAPI.md#deleteFriend) | **DELETE** /friendship/friends/{id}/ | Delete friend
[**getFriend**](FriendshipForestVPNAPI.md#getFriend) | **GET** /friendship/friends/{id}/ | Friend details
[**getFriendshipInvitation**](FriendshipForestVPNAPI.md#getFriendshipInvitation) | **GET** /friendship/invitations/{code}/ | Friendship invitation details
[**listFriends**](FriendshipForestVPNAPI.md#listFriends) | **GET** /friendship/friends/ | Get friends list
[**rejectFriendshipInvitation**](FriendshipForestVPNAPI.md#rejectFriendshipInvitation) | **DELETE** /friendship/invitations/{code}/ | Reject friendship invitation


<a name="acceptFriendshipInvitation"></a>
# **acceptFriendshipInvitation**
> acceptFriendshipInvitation(code)

Accept friendship invitation

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FriendshipForestVPNAPI()
val code : kotlin.String = code_example // kotlin.String | 
try {
    apiInstance.acceptFriendshipInvitation(code)
} catch (e: ClientException) {
    println("4xx response calling FriendshipForestVPNAPI#acceptFriendshipInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendshipForestVPNAPI#acceptFriendshipInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFriendshipInvitation"></a>
# **createFriendshipInvitation**
> FriendshipInvitation createFriendshipInvitation(perPage, page)

Create friendship invitation

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FriendshipForestVPNAPI()
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FriendshipInvitation = apiInstance.createFriendshipInvitation(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendshipForestVPNAPI#createFriendshipInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendshipForestVPNAPI#createFriendshipInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**FriendshipInvitation**](FriendshipInvitation.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFriend"></a>
# **deleteFriend**
> deleteFriend(id)

Delete friend

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FriendshipForestVPNAPI()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteFriend(id)
} catch (e: ClientException) {
    println("4xx response calling FriendshipForestVPNAPI#deleteFriend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendshipForestVPNAPI#deleteFriend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFriend"></a>
# **getFriend**
> Friendship getFriend(id)

Friend details

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FriendshipForestVPNAPI()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Friendship = apiInstance.getFriend(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendshipForestVPNAPI#getFriend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendshipForestVPNAPI#getFriend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**Friendship**](Friendship.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFriendshipInvitation"></a>
# **getFriendshipInvitation**
> FriendshipInvitation getFriendshipInvitation(code)

Friendship invitation details

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FriendshipForestVPNAPI()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : FriendshipInvitation = apiInstance.getFriendshipInvitation(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendshipForestVPNAPI#getFriendshipInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendshipForestVPNAPI#getFriendshipInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

[**FriendshipInvitation**](FriendshipInvitation.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFriends"></a>
# **listFriends**
> kotlin.collections.List&lt;Friendship&gt; listFriends(perPage, page)

Get friends list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FriendshipForestVPNAPI()
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<Friendship> = apiInstance.listFriends(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendshipForestVPNAPI#listFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendshipForestVPNAPI#listFriends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Friendship&gt;**](Friendship.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rejectFriendshipInvitation"></a>
# **rejectFriendshipInvitation**
> rejectFriendshipInvitation(code)

Reject friendship invitation

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = FriendshipForestVPNAPI()
val code : kotlin.String = code_example // kotlin.String | 
try {
    apiInstance.rejectFriendshipInvitation(code)
} catch (e: ClientException) {
    println("4xx response calling FriendshipForestVPNAPI#rejectFriendshipInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendshipForestVPNAPI#rejectFriendshipInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

