
# CheckoutSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  | 
**cancelUrl** | **kotlin.String** |  | 
**successUrl** | **kotlin.String** |  | 
**currency** | **kotlin.String** |  | 
**amountSubtotal** | **kotlin.Double** |  | 
**amountTotal** | **kotlin.Double** |  | 
**products** | [**kotlin.collections.List&lt;CheckoutSessionProduct&gt;**](CheckoutSessionProduct.md) |  | 
**paymentStatus** | [**inline**](#PaymentStatus) |  | 
**status** | [**inline**](#Status) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**expiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**redirectUrl** | **kotlin.String** |  |  [optional]
**locale** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**trialPeriod** | **kotlin.String** | Trial period duration in ISO 8601 format. |  [optional]
**user** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]


<a name="PaymentStatus"></a>
## Enum: payment_status
Name | Value
---- | -----
paymentStatus | paid, unpaid, no_payment_required


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | open, complete, expired



