
# Subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [readonly]
**currentPeriodStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Start of the current period that the subscription has been invoiced for. |  [readonly]
**currentPeriodEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | End of the current period that the subscription has been invoiced for. At the end of this period, a new invoice will be created. |  [readonly]
**status** | [**SubscriptionStatus**](SubscriptionStatus.md) |  |  [readonly]
**promotionalCode** | **kotlin.String** |  |  [optional]
**source** | [**SubscriptionSource**](SubscriptionSource.md) |  |  [optional] [readonly]
**endedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | If the subscription has ended, the date the subscription ended. |  [optional] [readonly]
**trialStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | If the subscription has a trial, the beginning of that trial. |  [optional] [readonly]
**trialEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | If the subscription has a trial, the end of that trial. |  [optional] [readonly]
**cancelAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | A date in the future at which the subscription will automatically get canceled. |  [optional] [readonly]
**canceledAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | If the subscription has been canceled, the date of that cancellation. |  [optional] [readonly]
**description** | **kotlin.String** | The subscription’s description, meant to be displayable to the customer. |  [optional] [readonly]
**items** | [**kotlin.collections.List&lt;SubscriptionItem&gt;**](SubscriptionItem.md) |  |  [optional]



