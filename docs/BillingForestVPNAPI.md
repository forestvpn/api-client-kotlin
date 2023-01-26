# BillingForestVPNAPI

All URIs are relative to *https://api.forestvpn.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSubscription**](BillingForestVPNAPI.md#cancelSubscription) | **DELETE** /billing/subscriptions/{subscriptionID}/ | Cancel subscription
[**createPaymentMethodStripeSetupIntent**](BillingForestVPNAPI.md#createPaymentMethodStripeSetupIntent) | **POST** /billing/payment-methods/stripe/setup-intents/ | Create stripe&#39;s setup intent for add new payment method.
[**createSubscription**](BillingForestVPNAPI.md#createSubscription) | **POST** /billing/subscriptions/ | Create subscription
[**deletePaymentMethod**](BillingForestVPNAPI.md#deletePaymentMethod) | **DELETE** /billing/payment-methods/{paymentMethodID}/ | Delete payment method
[**getBillingAccount**](BillingForestVPNAPI.md#getBillingAccount) | **GET** /billing/account/ | Billing account info
[**getBillingBundle**](BillingForestVPNAPI.md#getBillingBundle) | **GET** /billing/bundles/{bundleID}/ | Bundle info
[**getBillingPaymentOption**](BillingForestVPNAPI.md#getBillingPaymentOption) | **GET** /billing/payment-options/{paymentOptionID}/ | Payment option info
[**getBillingProduct**](BillingForestVPNAPI.md#getBillingProduct) | **GET** /billing/products/{productID}/ | Product info
[**getPaymentMethod**](BillingForestVPNAPI.md#getPaymentMethod) | **GET** /billing/payment-methods/{paymentMethodID}/ | Payment method info
[**getSubscription**](BillingForestVPNAPI.md#getSubscription) | **GET** /billing/subscriptions/{subscriptionID}/ | Subscription info
[**getSubscriptionItem**](BillingForestVPNAPI.md#getSubscriptionItem) | **GET** /billing/subscription-items/{subscriptionItemID}/ | Subscription item info
[**listBillingBundles**](BillingForestVPNAPI.md#listBillingBundles) | **GET** /billing/bundles/ | Billing bundles list
[**listBillingFeatures**](BillingForestVPNAPI.md#listBillingFeatures) | **GET** /billing/features/ | Billing feature list
[**listBillingPaymentOptions**](BillingForestVPNAPI.md#listBillingPaymentOptions) | **GET** /billing/payment-options/ | Billing payment option list
[**listBillingProducts**](BillingForestVPNAPI.md#listBillingProducts) | **GET** /billing/products/ | Billing products list
[**listPaymentMethods**](BillingForestVPNAPI.md#listPaymentMethods) | **GET** /billing/payment-methods/ | Payment method list
[**listSubscriptionItems**](BillingForestVPNAPI.md#listSubscriptionItems) | **GET** /billing/subscription-items/ | Subscription items list
[**listSubscriptions**](BillingForestVPNAPI.md#listSubscriptions) | **GET** /billing/subscriptions/ | Billing subscriptions list
[**reactivateSubscription**](BillingForestVPNAPI.md#reactivateSubscription) | **POST** /billing/subscriptions/{subscriptionID}/reactivate/ | Reactivate subscription
[**updateBillingAccount**](BillingForestVPNAPI.md#updateBillingAccount) | **PATCH** /billing/account/ | Update billing account
[**updateSubscriptionItem**](BillingForestVPNAPI.md#updateSubscriptionItem) | **PATCH** /billing/subscription-items/{subscriptionItemID}/ | Update subscription item


<a name="cancelSubscription"></a>
# **cancelSubscription**
> cancelSubscription(subscriptionID)

Cancel subscription

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val subscriptionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.cancelSubscription(subscriptionID)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#cancelSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#cancelSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionID** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPaymentMethodStripeSetupIntent"></a>
# **createPaymentMethodStripeSetupIntent**
> StripeSetupIntent createPaymentMethodStripeSetupIntent(createStripeSetupIntentRequest)

Create stripe&#39;s setup intent for add new payment method.

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val createStripeSetupIntentRequest : CreateStripeSetupIntentRequest =  // CreateStripeSetupIntentRequest | 
try {
    val result : StripeSetupIntent = apiInstance.createPaymentMethodStripeSetupIntent(createStripeSetupIntentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#createPaymentMethodStripeSetupIntent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#createPaymentMethodStripeSetupIntent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createStripeSetupIntentRequest** | [**CreateStripeSetupIntentRequest**](CreateStripeSetupIntentRequest.md)|  | [optional]

### Return type

[**StripeSetupIntent**](StripeSetupIntent.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSubscription"></a>
# **createSubscription**
> Subscription createSubscription(subscription)

Create subscription

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val subscription : Subscription =  // Subscription | 
try {
    val result : Subscription = apiInstance.createSubscription(subscription)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#createSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#createSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | [**Subscription**](Subscription.md)|  | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePaymentMethod"></a>
# **deletePaymentMethod**
> deletePaymentMethod(paymentMethodID)

Delete payment method

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val paymentMethodID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deletePaymentMethod(paymentMethodID)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#deletePaymentMethod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#deletePaymentMethod")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethodID** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingAccount"></a>
# **getBillingAccount**
> BillingAccount getBillingAccount()

Billing account info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
try {
    val result : BillingAccount = apiInstance.getBillingAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#getBillingAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#getBillingAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingAccount**](BillingAccount.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingBundle"></a>
# **getBillingBundle**
> Bundle getBillingBundle(bundleID)

Bundle info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val bundleID : kotlin.String = bundleID_example // kotlin.String | 
try {
    val result : Bundle = apiInstance.getBillingBundle(bundleID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#getBillingBundle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#getBillingBundle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleID** | **kotlin.String**|  |

### Return type

[**Bundle**](Bundle.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingPaymentOption"></a>
# **getBillingPaymentOption**
> PaymentOption getBillingPaymentOption(paymentOptionID)

Payment option info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val paymentOptionID : kotlin.String = paymentOptionID_example // kotlin.String | 
try {
    val result : PaymentOption = apiInstance.getBillingPaymentOption(paymentOptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#getBillingPaymentOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#getBillingPaymentOption")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentOptionID** | **kotlin.String**|  |

### Return type

[**PaymentOption**](PaymentOption.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBillingProduct"></a>
# **getBillingProduct**
> Product getBillingProduct(productID)

Product info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val productID : kotlin.String = productID_example // kotlin.String | 
try {
    val result : Product = apiInstance.getBillingProduct(productID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#getBillingProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#getBillingProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **kotlin.String**|  |

### Return type

[**Product**](Product.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentMethod"></a>
# **getPaymentMethod**
> PaymentMethod getPaymentMethod(paymentMethodID)

Payment method info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val paymentMethodID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentMethod = apiInstance.getPaymentMethod(paymentMethodID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#getPaymentMethod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#getPaymentMethod")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethodID** | **java.util.UUID**|  |

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscription"></a>
# **getSubscription**
> Subscription getSubscription(subscriptionID)

Subscription info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val subscriptionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Subscription = apiInstance.getSubscription(subscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#getSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#getSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionID** | **java.util.UUID**|  |

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscriptionItem"></a>
# **getSubscriptionItem**
> SubscriptionItem getSubscriptionItem(subscriptionItemID)

Subscription item info

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val subscriptionItemID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SubscriptionItem = apiInstance.getSubscriptionItem(subscriptionItemID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#getSubscriptionItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#getSubscriptionItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionItemID** | **java.util.UUID**|  |

### Return type

[**SubscriptionItem**](SubscriptionItem.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBillingBundles"></a>
# **listBillingBundles**
> kotlin.collections.List&lt;Bundle&gt; listBillingBundles()

Billing bundles list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
try {
    val result : kotlin.collections.List<Bundle> = apiInstance.listBillingBundles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#listBillingBundles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#listBillingBundles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Bundle&gt;**](Bundle.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBillingFeatures"></a>
# **listBillingFeatures**
> kotlin.collections.List&lt;BillingFeature&gt; listBillingFeatures()

Billing feature list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
try {
    val result : kotlin.collections.List<BillingFeature> = apiInstance.listBillingFeatures()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#listBillingFeatures")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#listBillingFeatures")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;BillingFeature&gt;**](BillingFeature.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""
Configure wireguardAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBillingPaymentOptions"></a>
# **listBillingPaymentOptions**
> kotlin.collections.List&lt;PaymentOption&gt; listBillingPaymentOptions()

Billing payment option list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
try {
    val result : kotlin.collections.List<PaymentOption> = apiInstance.listBillingPaymentOptions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#listBillingPaymentOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#listBillingPaymentOptions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;PaymentOption&gt;**](PaymentOption.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBillingProducts"></a>
# **listBillingProducts**
> kotlin.collections.List&lt;Product&gt; listBillingProducts()

Billing products list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
try {
    val result : kotlin.collections.List<Product> = apiInstance.listBillingProducts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#listBillingProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#listBillingProducts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Product&gt;**](Product.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPaymentMethods"></a>
# **listPaymentMethods**
> kotlin.collections.List&lt;PaymentMethod&gt; listPaymentMethods()

Payment method list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
try {
    val result : kotlin.collections.List<PaymentMethod> = apiInstance.listPaymentMethods()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#listPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#listPaymentMethods")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;PaymentMethod&gt;**](PaymentMethod.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSubscriptionItems"></a>
# **listSubscriptionItems**
> kotlin.collections.List&lt;SubscriptionItem&gt; listSubscriptionItems(subscription, perPage, page)

Subscription items list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val subscription : kotlin.String = subscription_example // kotlin.String | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<SubscriptionItem> = apiInstance.listSubscriptionItems(subscription, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#listSubscriptionItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#listSubscriptionItems")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **kotlin.String**|  | [optional]
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;SubscriptionItem&gt;**](SubscriptionItem.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSubscriptions"></a>
# **listSubscriptions**
> kotlin.collections.List&lt;Subscription&gt; listSubscriptions(product, perPage, page)

Billing subscriptions list

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val product : kotlin.String = product_example // kotlin.String | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<Subscription> = apiInstance.listSubscriptions(product, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#listSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#listSubscriptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **kotlin.String**|  | [optional]
 **perPage** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Subscription&gt;**](Subscription.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reactivateSubscription"></a>
# **reactivateSubscription**
> Subscription reactivateSubscription(subscriptionID)

Reactivate subscription

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val subscriptionID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Subscription = apiInstance.reactivateSubscription(subscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#reactivateSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#reactivateSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionID** | **java.util.UUID**|  |

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBillingAccount"></a>
# **updateBillingAccount**
> BillingAccount updateBillingAccount(billingAccount)

Update billing account

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val billingAccount : BillingAccount =  // BillingAccount | 
try {
    val result : BillingAccount = apiInstance.updateBillingAccount(billingAccount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#updateBillingAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#updateBillingAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingAccount** | [**BillingAccount**](BillingAccount.md)|  |

### Return type

[**BillingAccount**](BillingAccount.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSubscriptionItem"></a>
# **updateSubscriptionItem**
> SubscriptionItem updateSubscriptionItem(subscriptionItemID, subscriptionItem)

Update subscription item

### Example
```kotlin
// Import classes:
//import com.forestvpn.api.client.infrastructure.*
//import com.forestvpn.api.client.models.*

val apiInstance = BillingForestVPNAPI()
val subscriptionItemID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val subscriptionItem : SubscriptionItem =  // SubscriptionItem | 
try {
    val result : SubscriptionItem = apiInstance.updateSubscriptionItem(subscriptionItemID, subscriptionItem)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingForestVPNAPI#updateSubscriptionItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingForestVPNAPI#updateSubscriptionItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionItemID** | **java.util.UUID**|  |
 **subscriptionItem** | [**SubscriptionItem**](SubscriptionItem.md)|  |

### Return type

[**SubscriptionItem**](SubscriptionItem.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

