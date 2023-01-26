# CheckoutForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyCouponCheckoutSession**](CheckoutForestVPNAPI.md#applyCouponCheckoutSession) | **POST** /checkout/sessions/{sessionID}/apply_coupon/ | Apply coupon to session
[**createCheckoutSession**](CheckoutForestVPNAPI.md#createCheckoutSession) | **POST** /checkout/sessions/ | Create checkout session
[**createWaitListRequest**](CheckoutForestVPNAPI.md#createWaitListRequest) | **POST** /checkout/wait-list/ | Create request to add country in wait list
[**expireCheckoutSession**](CheckoutForestVPNAPI.md#expireCheckoutSession) | **POST** /checkout/sessions/{sessionID}/expire/ | Expire checkout session
[**getCheckoutSession**](CheckoutForestVPNAPI.md#getCheckoutSession) | **GET** /checkout/sessions/{sessionID}/ | Checkout session details
[**getStripeCheckoutSession**](CheckoutForestVPNAPI.md#getStripeCheckoutSession) | **GET** /checkout/sessions/{sessionID}/stripe/checkout/session/ | Stripe checkout session details
[**getStripePaymentIntent**](CheckoutForestVPNAPI.md#getStripePaymentIntent) | **GET** /checkout/sessions/{sessionID}/stripe/payment/intent/ | Stripe payment intent details
[**processCloudPaymentsAuth**](CheckoutForestVPNAPI.md#processCloudPaymentsAuth) | **POST** /checkout/sessions/{sessionID}/cloud-payments/auth/ | Cloud payments auth
[**processCloudPaymentsPost3ds**](CheckoutForestVPNAPI.md#processCloudPaymentsPost3ds) | **POST** /checkout/sessions/{sessionID}/cloud-payments/post3ds/ | Cloud payments post3ds


<a name="applyCouponCheckoutSession"></a>
# **applyCouponCheckoutSession**
> CouponCheckoutSession applyCouponCheckoutSession(sessionID, createCouponCheckoutSession)

Apply coupon to session

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val sessionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createCouponCheckoutSession : CreateCouponCheckoutSession =  // CreateCouponCheckoutSession | 
try {
    val result : CouponCheckoutSession = apiInstance.applyCouponCheckoutSession(sessionID, createCouponCheckoutSession)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#applyCouponCheckoutSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#applyCouponCheckoutSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **java.util.UUID**|  |
 **createCouponCheckoutSession** | [**CreateCouponCheckoutSession**](CreateCouponCheckoutSession.md)|  |

### Return type

[**CouponCheckoutSession**](CouponCheckoutSession.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCheckoutSession"></a>
# **createCheckoutSession**
> CheckoutSession createCheckoutSession(createCheckoutSessionRequest)

Create checkout session

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val createCheckoutSessionRequest : CreateCheckoutSessionRequest =  // CreateCheckoutSessionRequest | 
try {
    val result : CheckoutSession = apiInstance.createCheckoutSession(createCheckoutSessionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#createCheckoutSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#createCheckoutSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCheckoutSessionRequest** | [**CreateCheckoutSessionRequest**](CreateCheckoutSessionRequest.md)|  | [optional]

### Return type

[**CheckoutSession**](CheckoutSession.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWaitListRequest"></a>
# **createWaitListRequest**
> createWaitListRequest(xCountry)

Create request to add country in wait list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val xCountry : kotlin.String = xCountry_example // kotlin.String | 
try {
    apiInstance.createWaitListRequest(xCountry)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#createWaitListRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#createWaitListRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xCountry** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="expireCheckoutSession"></a>
# **expireCheckoutSession**
> expireCheckoutSession(sessionID)

Expire checkout session

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val sessionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.expireCheckoutSession(sessionID)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#expireCheckoutSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#expireCheckoutSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCheckoutSession"></a>
# **getCheckoutSession**
> CheckoutSession getCheckoutSession(sessionID)

Checkout session details

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val sessionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CheckoutSession = apiInstance.getCheckoutSession(sessionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#getCheckoutSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#getCheckoutSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **java.util.UUID**|  |

### Return type

[**CheckoutSession**](CheckoutSession.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStripeCheckoutSession"></a>
# **getStripeCheckoutSession**
> StripeCheckoutSession getStripeCheckoutSession(sessionID)

Stripe checkout session details

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val sessionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : StripeCheckoutSession = apiInstance.getStripeCheckoutSession(sessionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#getStripeCheckoutSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#getStripeCheckoutSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **java.util.UUID**|  |

### Return type

[**StripeCheckoutSession**](StripeCheckoutSession.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStripePaymentIntent"></a>
# **getStripePaymentIntent**
> StripePaymentIntent getStripePaymentIntent(sessionID, useStripeSdk, returnUrl)

Stripe payment intent details

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val sessionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val useStripeSdk : kotlin.Boolean = true // kotlin.Boolean | 
val returnUrl : kotlin.String = returnUrl_example // kotlin.String | 
try {
    val result : StripePaymentIntent = apiInstance.getStripePaymentIntent(sessionID, useStripeSdk, returnUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#getStripePaymentIntent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#getStripePaymentIntent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **java.util.UUID**|  |
 **useStripeSdk** | **kotlin.Boolean**|  | [optional]
 **returnUrl** | **kotlin.String**|  | [optional]

### Return type

[**StripePaymentIntent**](StripePaymentIntent.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="processCloudPaymentsAuth"></a>
# **processCloudPaymentsAuth**
> CloudPaymentsAuth processCloudPaymentsAuth(sessionID, createCloudPaymentsAuth)

Cloud payments auth

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val sessionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createCloudPaymentsAuth : CreateCloudPaymentsAuth =  // CreateCloudPaymentsAuth | 
try {
    val result : CloudPaymentsAuth = apiInstance.processCloudPaymentsAuth(sessionID, createCloudPaymentsAuth)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#processCloudPaymentsAuth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#processCloudPaymentsAuth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **java.util.UUID**|  |
 **createCloudPaymentsAuth** | [**CreateCloudPaymentsAuth**](CreateCloudPaymentsAuth.md)|  |

### Return type

[**CloudPaymentsAuth**](CloudPaymentsAuth.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="processCloudPaymentsPost3ds"></a>
# **processCloudPaymentsPost3ds**
> CloudPaymentsPost3ds processCloudPaymentsPost3ds(sessionID, createCloudPaymentsPost3ds)

Cloud payments post3ds

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = CheckoutForestVPNAPI()
val sessionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createCloudPaymentsPost3ds : CreateCloudPaymentsPost3ds =  // CreateCloudPaymentsPost3ds | 
try {
    val result : CloudPaymentsPost3ds = apiInstance.processCloudPaymentsPost3ds(sessionID, createCloudPaymentsPost3ds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckoutForestVPNAPI#processCloudPaymentsPost3ds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckoutForestVPNAPI#processCloudPaymentsPost3ds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **java.util.UUID**|  |
 **createCloudPaymentsPost3ds** | [**CreateCloudPaymentsPost3ds**](CreateCloudPaymentsPost3ds.md)|  |

### Return type

[**CloudPaymentsPost3ds**](CloudPaymentsPost3ds.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

