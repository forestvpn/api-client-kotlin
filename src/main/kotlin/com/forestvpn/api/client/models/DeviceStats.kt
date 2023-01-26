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
 * @param connections 
 * @param receivedBytes 
 * @param transmittedBytes 
 * @param blockedAds 
 * @param blockedMalwares 
 * @param date 
 */


data class DeviceStats (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "connections")
    val connections: kotlin.Int? = null,

    @Json(name = "received_bytes")
    val receivedBytes: kotlin.Int? = null,

    @Json(name = "transmitted_bytes")
    val transmittedBytes: kotlin.Int? = null,

    @Json(name = "blocked_ads")
    val blockedAds: kotlin.Int? = null,

    @Json(name = "blocked_malwares")
    val blockedMalwares: kotlin.Int? = null,

    @Json(name = "date")
    val date: java.time.OffsetDateTime? = null

)
