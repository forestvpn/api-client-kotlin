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

import com.forestvpn.api.client.models.NetworkService

import com.squareup.moshi.Json

/**
 * 
 *
 * @param host 
 * @param networkServices 
 */


data class Server (

    @Json(name = "host")
    val host: kotlin.String,

    @Json(name = "network_services")
    val networkServices: kotlin.collections.List<NetworkService>

)

