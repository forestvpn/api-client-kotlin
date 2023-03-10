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

import com.forestvpn.api.client.models.CreateOrUpdateDeviceRequestInfo

import com.squareup.moshi.Json

/**
 * 
 *
 * @param externalKey 
 * @param name 
 * @param location 
 * @param torOver 
 * @param connectionMode 
 * @param randomServer 
 * @param info 
 */


data class CreateOrUpdateDeviceRequest (

    @Json(name = "external_key")
    val externalKey: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "location")
    val location: java.util.UUID? = null,

    @Json(name = "tor_over")
    val torOver: kotlin.Boolean? = false,

    @Json(name = "connection_mode")
    val connectionMode: java.util.UUID? = null,

    @Json(name = "random_server")
    val randomServer: kotlin.Boolean? = false,

    @Json(name = "info")
    val info: CreateOrUpdateDeviceRequestInfo? = null

)

