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
 * @param deviceId 
 * @param active 
 */


data class UpdateFCMDeviceRequest (

    @Json(name = "device_id")
    val deviceId: kotlin.String? = null,

    @Json(name = "active")
    val active: kotlin.Boolean? = null

)
