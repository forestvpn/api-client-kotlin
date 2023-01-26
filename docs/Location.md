
# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  | 
**name** | **kotlin.String** |  | 
**latitude** | **kotlin.Double** |  | 
**longitude** | **kotlin.Double** |  | 
**country** | [**Country**](Country.md) |  | 
**distance** | **kotlin.Double** | it&#39;s distance in kilometers between an user (longitude and latitude from request object) and a location object |  [optional]
**latencyRate** | **kotlin.Double** | it&#39;s a rate from 0 to 1 which shows a connection quality. where 1 is good and 0 is bad |  [optional]
**alternativeNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]



