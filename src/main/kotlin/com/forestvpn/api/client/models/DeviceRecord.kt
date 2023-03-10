/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.forestvpn.api.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param date 
 * @param receivedBytes 
 * @param transmittedBytes 
 * @param usageTime 
 */


data class DeviceRecord (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "date")
    val date: kotlin.String? = null,

    @Json(name = "received_bytes")
    val receivedBytes: java.math.BigDecimal? = null,

    @Json(name = "transmitted_bytes")
    val transmittedBytes: java.math.BigDecimal? = null,

    @Json(name = "usage_time")
    val usageTime: java.math.BigDecimal? = null

)

