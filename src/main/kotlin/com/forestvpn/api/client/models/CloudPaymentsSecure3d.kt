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
 * @param paReq 
 * @param acsUrl 
 * @param termUrl 
 */


data class CloudPaymentsSecure3d (

    @Json(name = "pa_req")
    val paReq: kotlin.String,

    @Json(name = "acs_url")
    val acsUrl: kotlin.String,

    @Json(name = "term_url")
    val termUrl: kotlin.String

)

