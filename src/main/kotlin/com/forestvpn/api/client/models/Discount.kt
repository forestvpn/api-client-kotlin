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
 * @param price 
 * @param recurring 
 * @param discount 
 */


data class Discount (

    @Json(name = "price")
    val price: kotlin.Double? = null,

    @Json(name = "recurring")
    val recurring: kotlin.String? = null,

    @Json(name = "discount")
    val discount: kotlin.Double? = null

)
