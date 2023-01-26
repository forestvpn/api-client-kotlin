
# AggregatedDataUsageStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggrInterval** | **kotlin.String** | Aggregation value. It might de a hour, day, week, or month |  [optional]
**deviceId** | [**java.util.UUID**](java.util.UUID.md) | User device name, useful for retrieve extra data through device API |  [optional]
**deviceName** | **kotlin.String** | User device name, useful for showing in the chart |  [optional]
**receivedBytes** | **kotlin.Int** | Sum of the received bytes aggregated around the device and aggr_interval |  [optional]
**transmittedBytes** | **kotlin.Int** | Sum of the transmitted bytes aggregated around the device and aggr_interval |  [optional]
**totalBytes** | **kotlin.Int** | Sum of the received + transmitted bytes aggregated around the device and aggr_interval |  [optional]
**usageTime** | **kotlin.Int** | Minutes of usage time aggregated around the device and aggr_interval |  [optional]



