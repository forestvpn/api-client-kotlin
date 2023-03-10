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
 * @param proto 
 * @param connectionUri 
 */


data class NetworkService (

    @Json(name = "proto")
    val proto: NetworkService.Proto,

    @Json(name = "connection_uri")
    val connectionUri: kotlin.String

) {

    /**
     * 
     *
     * Values: wireguard
     */
    enum class Proto(val value: kotlin.String) {
        @Json(name = "wireguard") wireguard("wireguard");
    }
}

