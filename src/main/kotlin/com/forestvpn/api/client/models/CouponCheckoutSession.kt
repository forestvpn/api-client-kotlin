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
 * @param key 
 * @param discount 
 */


data class CouponCheckoutSession (

    @Json(name = "key")
    val key: kotlin.String,

    @Json(name = "discount")
    val discount: kotlin.Double

)
