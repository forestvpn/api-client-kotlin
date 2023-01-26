# AuthForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginToken**](AuthForestVPNAPI.md#loginToken) | **POST** /auth/token/login/ | Login with JWT token
[**migrateLegacyAuth**](AuthForestVPNAPI.md#migrateLegacyAuth) | **GET** /legacy/auth/ | Legacy auth migration
[**obtainToken**](AuthForestVPNAPI.md#obtainToken) | **GET** /auth/token/obtain/ | Obtain JWT token
[**updateUserProfile**](AuthForestVPNAPI.md#updateUserProfile) | **PATCH** /auth/profile/ | Update profile
[**userProfile**](AuthForestVPNAPI.md#userProfile) | **GET** /auth/profile/ | Profile
[**whoAmI**](AuthForestVPNAPI.md#whoAmI) | **GET** /auth/whoami/ | Who am I


<a name="loginToken"></a>
# **loginToken**
> TokenLogin loginToken(createTokenLogin)

Login with JWT token

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AuthForestVPNAPI()
val createTokenLogin : CreateTokenLogin =  // CreateTokenLogin | 
try {
    val result : TokenLogin = apiInstance.loginToken(createTokenLogin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthForestVPNAPI#loginToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthForestVPNAPI#loginToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTokenLogin** | [**CreateTokenLogin**](CreateTokenLogin.md)|  | [optional]

### Return type

[**TokenLogin**](TokenLogin.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="migrateLegacyAuth"></a>
# **migrateLegacyAuth**
> LegacyAuthMigrationToken migrateLegacyAuth()

Legacy auth migration

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AuthForestVPNAPI()
try {
    val result : LegacyAuthMigrationToken = apiInstance.migrateLegacyAuth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthForestVPNAPI#migrateLegacyAuth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthForestVPNAPI#migrateLegacyAuth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LegacyAuthMigrationToken**](LegacyAuthMigrationToken.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="obtainToken"></a>
# **obtainToken**
> TokenObtain obtainToken()

Obtain JWT token

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AuthForestVPNAPI()
try {
    val result : TokenObtain = apiInstance.obtainToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthForestVPNAPI#obtainToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthForestVPNAPI#obtainToken")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TokenObtain**](TokenObtain.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserProfile"></a>
# **updateUserProfile**
> User updateUserProfile(user)

Update profile

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AuthForestVPNAPI()
val user : User =  // User | 
try {
    val result : User = apiInstance.updateUserProfile(user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthForestVPNAPI#updateUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthForestVPNAPI#updateUserProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userProfile"></a>
# **userProfile**
> User userProfile()

Profile

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AuthForestVPNAPI()
try {
    val result : User = apiInstance.userProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthForestVPNAPI#userProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthForestVPNAPI#userProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="whoAmI"></a>
# **whoAmI**
> User whoAmI()

Who am I

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = AuthForestVPNAPI()
try {
    val result : User = apiInstance.whoAmI()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthForestVPNAPI#whoAmI")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthForestVPNAPI#whoAmI")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

