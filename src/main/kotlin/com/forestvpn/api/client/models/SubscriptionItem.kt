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

import com.forestvpn.api.client.models.Price

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param price 
 * @param priceId 
 * @param quantity 
 */


data class SubscriptionItem (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "price")
    val price: Price,

    @Json(name = "price_id")
    val priceId: java.util.UUID,

    @Json(name = "quantity")
    val quantity: kotlin.Int

)

