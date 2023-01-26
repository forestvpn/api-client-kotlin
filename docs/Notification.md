
# Notification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**slug** | **kotlin.Int** |  | 
**title** | **kotlin.String** |  | 
**description** | **kotlin.String** |  | 
**unread** | **kotlin.Boolean** |  | 
**type** | [**inline**](#Type) |  | 
**level** | [**inline**](#Level) |  |  [optional]
**recipient** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**actorContentType** | **kotlin.Int** |  |  [optional]
**actorObjectId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**verb** | **kotlin.String** |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**&#x60;public&#x60;** | **kotlin.Boolean** |  |  [optional]
**deleted** | **kotlin.Boolean** |  |  [optional]
**&#x60;data&#x60;** | **kotlin.String** |  |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | system_update, product_update, non_paper


<a name="Level"></a>
## Enum: level
Name | Value
---- | -----
level | success, info, warning, error



